package com.caren.android.fikry.kotlin.barcodedetection

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.ml.md.R

class BarcodeFieldHeaderAdapter(private val headerTitle: String)
    : RecyclerView.Adapter<BarcodeFieldHeaderAdapter.HeaderViewHolder>() {

    class HeaderViewHolder private constructor(view: View) : RecyclerView.ViewHolder(view) {

        private val headerTextView: TextView = view.findViewById(R.id.header_text)

        fun bindBarcodeField(text: String) {
            headerTextView.text = text
        }

        companion object {

            fun create(parent: ViewGroup): HeaderViewHolder {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.barcode_header, parent, false)
                return HeaderViewHolder(view)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeaderViewHolder {
        return HeaderViewHolder.create(parent)
    }

    override fun getItemViewType(position: Int): Int {
        return R.layout.barcode_header
    }

    override fun getItemCount(): Int {
        return 1
    }

    override fun onBindViewHolder(holder: HeaderViewHolder, position: Int) {
        holder.bindBarcodeField(headerTitle)
    }
}