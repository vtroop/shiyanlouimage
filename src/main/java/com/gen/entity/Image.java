package com.gen.entity;

import java.io.Serializable;
import java.util.Date;

public class Image implements Serializable{
    private Integer id;

    private Integer contentDetailId;

    private Double size;

    private String type;

    private String path;

    private Date updateTime;

    private String url;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getContentDetailId() {
        return contentDetailId;
    }

    public void setContentDetailId(Integer contentDetailId) {
        this.contentDetailId = contentDetailId;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}