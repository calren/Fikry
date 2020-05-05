package com.caren.android.fikry.kotlin.network;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BookJson {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("isbn")
    @Expose
    private String isbn;
    @SerializedName("isbn13")
    @Expose
    private String isbn13;
    @SerializedName("ratings_count")
    @Expose
    private Integer ratingsCount;
    @SerializedName("reviews_count")
    @Expose
    private Integer reviewsCount;
    @SerializedName("text_reviews_count")
    @Expose
    private Integer textReviewsCount;
    @SerializedName("work_ratings_count")
    @Expose
    private Integer workRatingsCount;
    @SerializedName("work_reviews_count")
    @Expose
    private Integer workReviewsCount;
    @SerializedName("work_text_reviews_count")
    @Expose
    private Integer workTextReviewsCount;
    @SerializedName("average_rating")
    @Expose
    private String averageRating;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn13() {
        return isbn13;
    }

    public void setIsbn13(String isbn13) {
        this.isbn13 = isbn13;
    }

    public Integer getRatingsCount() {
        return ratingsCount;
    }

    public void setRatingsCount(Integer ratingsCount) {
        this.ratingsCount = ratingsCount;
    }

    public Integer getReviewsCount() {
        return reviewsCount;
    }

    public void setReviewsCount(Integer reviewsCount) {
        this.reviewsCount = reviewsCount;
    }

    public Integer getTextReviewsCount() {
        return textReviewsCount;
    }

    public void setTextReviewsCount(Integer textReviewsCount) {
        this.textReviewsCount = textReviewsCount;
    }

    public Integer getWorkRatingsCount() {
        return workRatingsCount;
    }

    public void setWorkRatingsCount(Integer workRatingsCount) {
        this.workRatingsCount = workRatingsCount;
    }

    public Integer getWorkReviewsCount() {
        return workReviewsCount;
    }

    public void setWorkReviewsCount(Integer workReviewsCount) {
        this.workReviewsCount = workReviewsCount;
    }

    public Integer getWorkTextReviewsCount() {
        return workTextReviewsCount;
    }

    public void setWorkTextReviewsCount(Integer workTextReviewsCount) {
        this.workTextReviewsCount = workTextReviewsCount;
    }

    public String getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(String averageRating) {
        this.averageRating = averageRating;
    }

}
