/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.caren.android.fikry.kotlin.barcodedetection

import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.MergeAdapter
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.firebase.ml.md.R
import com.caren.android.fikry.kotlin.camera.WorkflowModel
import com.caren.android.fikry.kotlin.camera.WorkflowModel.WorkflowState

/** Displays the bottom sheet to present barcode fields contained in the detected barcode.  */
class BarcodeResultFragment : BottomSheetDialogFragment() {

    override fun onCreateView(
        layoutInflater: LayoutInflater,
        viewGroup: ViewGroup?,
        bundle: Bundle?
    ): View {
        val view = layoutInflater.inflate(R.layout.barcode_bottom_sheet, viewGroup)

        val arguments = arguments
        val barcodeFieldList: ArrayList<BarcodeField> =
                if (arguments?.containsKey(ARG_BARCODE_FIELD_LIST) == true) {
                    arguments.getParcelableArrayList(ARG_BARCODE_FIELD_LIST) ?: ArrayList()
                } else {
                    Log.e(TAG, "No barcode field list passed in!")
                    ArrayList()
                }

        val headerTitle: String =
                if (arguments?.containsKey(ARG_HEADER_TITLE) == true) {
                    arguments.getString(ARG_HEADER_TITLE) ?: ""
                } else {
                    Log.e(TAG, "No header title passed in!")
                    ""
                }

        view.findViewById<RecyclerView>(R.id.barcode_field_recycler_view).apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(activity)

            val headerAdapter = BarcodeFieldHeaderAdapter(headerTitle)
            val fieldAdapter = BarcodeFieldAdapter(barcodeFieldList)
            val mergeAdapter = MergeAdapter(headerAdapter, fieldAdapter)

            adapter = mergeAdapter
        }

        return view
    }

    override fun onDismiss(dialogInterface: DialogInterface) {
        activity?.let {
            // Back to working state after the bottom sheet is dismissed.
            ViewModelProviders.of(it).get<WorkflowModel>(WorkflowModel::class.java)
                    .setWorkflowState(WorkflowState.DETECTING)
        }
        super.onDismiss(dialogInterface)
    }

    companion object {

        private const val TAG = "BarcodeResultFragment"
        private const val ARG_BARCODE_FIELD_LIST = "arg_barcode_field_list"
        private const val ARG_HEADER_TITLE = "header_title"

        fun show(fragmentManager: FragmentManager, barcodeFieldArrayList: ArrayList<BarcodeField>,
                 headerTitle: String) {
            val barcodeResultFragment = BarcodeResultFragment()
            barcodeResultFragment.arguments = Bundle().apply {
                putParcelableArrayList(ARG_BARCODE_FIELD_LIST, barcodeFieldArrayList)
                putString(ARG_HEADER_TITLE, headerTitle)
            }
            barcodeResultFragment.show(fragmentManager, TAG)
        }

        fun dismiss(fragmentManager: FragmentManager) {
            (fragmentManager.findFragmentByTag(TAG) as BarcodeResultFragment?)?.dismiss()
        }
    }
}
