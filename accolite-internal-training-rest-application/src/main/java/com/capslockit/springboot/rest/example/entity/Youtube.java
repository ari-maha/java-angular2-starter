package com.capslockit.springboot.rest.example.entity;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import javax.persistence.*;

@Entity
@Table(name = "youtube")
public class Youtube {
    @Id
    @Column
    @GeneratedValue
    private Long id;

    @Column(name = "video_id")
    private String videoId;

    @Column(name = "uploader_name")
    private String uploaderName;

    @Column(name = "video_age")
    private Integer videoAge;

    @Column(name = "category")
    private String category;

    @Column(name = "video_length")
    private Integer videoLength;

    @Column(name = "views")
    private Integer views;

    @Column(name = "video_rate")
    private Double videoRate;

    @Column(name = "video_ratings")
    private Double videoRatings;

    @Column(name = "number_of_comments")
    private Integer numberOfComments;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public String getUploaderName() {
        return uploaderName;
    }

    public void setUploaderName(String uploaderName) {
        this.uploaderName = uploaderName;
    }

    public Integer getVideoAge() {
        return videoAge;
    }

    public void setVideoAge(Integer videoAge) {
        this.videoAge = videoAge;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getVideoLength() {
        return videoLength;
    }

    public void setVideoLength(Integer videoLength) {
        this.videoLength = videoLength;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Double getVideoRate() {
        return videoRate;
    }

    public void setVideoRate(Double videoRate) {
        this.videoRate = videoRate;
    }

    public Double getVideoRatings() {
        return videoRatings;
    }

    public void setVideoRatings(Double videoRatings) {
        this.videoRatings = videoRatings;
    }

    public Integer getNumberOfComments() {
        return numberOfComments;
    }

    public void setNumberOfComments(Integer numberOfComments) {
        this.numberOfComments = numberOfComments;
    }

    @Override
    public String toString() {
        ObjectMapper mapper = new ObjectMapper();

        String jsonString = "";
        try {
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            jsonString = mapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return jsonString;
    }
}
