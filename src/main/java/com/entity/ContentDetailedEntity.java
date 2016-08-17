package com.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Evilina on 2016/8/16.
 */
@Entity
@Table(name = "content_detailed", schema = "shiyanloudb", catalog = "")
public class ContentDetailedEntity {
    private int id;
    private Integer contentId;
    private String name;
    private String body;
    private String updateBody;
    private Timestamp date;
    private ContentEntity contentByContentId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "content_id")
    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "body")
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Basic
    @Column(name = "update_body")
    public String getUpdateBody() {
        return updateBody;
    }

    public void setUpdateBody(String updateBody) {
        this.updateBody = updateBody;
    }

    @Basic
    @Column(name = "date")
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContentDetailedEntity that = (ContentDetailedEntity) o;

        if (id != that.id) return false;
        if (contentId != null ? !contentId.equals(that.contentId) : that.contentId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (body != null ? !body.equals(that.body) : that.body != null) return false;
        if (updateBody != null ? !updateBody.equals(that.updateBody) : that.updateBody != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (contentId != null ? contentId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (body != null ? body.hashCode() : 0);
        result = 31 * result + (updateBody != null ? updateBody.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "content_id", referencedColumnName = "id")
    public ContentEntity getContentByContentId() {
        return contentByContentId;
    }

    @Override
    public String toString() {
        return "ContentDetailedEntity{" +
                "id=" + id +
                ", contentId=" + contentId +
                ", name='" + name + '\'' +
                ", body='" + body + '\'' +
                ", updateBody='" + updateBody + '\'' +
                ", date=" + date +
                ", contentByContentId=" + contentByContentId +
                '}';
    }

    public void setContentByContentId(ContentEntity contentByContentId) {
        this.contentByContentId = contentByContentId;
    }
}
