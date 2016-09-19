package com.gen.entity;

import java.util.Date;

public class ContentDetailed {
    private Integer id;

    private Integer contentId;

    private Date updateTime;

    private Integer imageNumber;

    private Integer bodyMd5;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getImageNumber() {
        return imageNumber;
    }

    public void setImageNumber(Integer imageNumber) {
        this.imageNumber = imageNumber;
    }

    public Integer getBodyMd5() {
        return bodyMd5;
    }

    public void setBodyMd5(Integer bodyMd5) {
        this.bodyMd5 = bodyMd5;
    }
}