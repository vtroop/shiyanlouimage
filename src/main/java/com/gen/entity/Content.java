package com.gen.entity;



import org.apache.commons.codec.digest.DigestUtils;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Content implements Serializable {
    private Integer id;

    private String title;

    private String url;

    private String urlMd5;

    private Date updateTime;

    private List<ContentDetailedWithBLOBs> contentDetailedList;

    public List<ContentDetailedWithBLOBs> getContentDetailedList() {
        return contentDetailedList;
    }

    public void setContentDetailedList(List<ContentDetailedWithBLOBs> contentDetailedList) {
        this.contentDetailedList = contentDetailedList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getUrlMd5() {

        return urlMd5;
    }

    public void setUrlMd5(String urlMd5) {
        this.urlMd5 = urlMd5 == null ? null : urlMd5.trim() ;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Content content = (Content) o;

        if (id != null ? !id.equals(content.id) : content.id != null) return false;
        if (title != null ? !title.equals(content.title) : content.title != null) return false;
        if (url != null ? !url.equals(content.url) : content.url != null) return false;
        if (urlMd5 != null ? !urlMd5.equals(content.urlMd5) : content.urlMd5 != null) return false;
        if (updateTime != null ? !updateTime.equals(content.updateTime) : content.updateTime != null) return false;
        return contentDetailedList != null ? contentDetailedList.equals(content.contentDetailedList) : content.contentDetailedList == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (urlMd5 != null ? urlMd5.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (contentDetailedList != null ? contentDetailedList.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Content{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", urlMd5='" + urlMd5 + '\'' +
                ", updateTime=" + updateTime +
                ", contentDetailedList=" + contentDetailedList +
                '}';
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}