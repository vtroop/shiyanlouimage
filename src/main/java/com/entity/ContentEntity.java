package com.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by Evilina on 2016/8/16.
 */
@Entity
@Table(name = "content", schema = "shiyanloudb", catalog = "")
public class ContentEntity implements Serializable{
    private int id;
    private String name;
    private String url;
    private Timestamp date;
    private String body;
    private Collection<ContentDetailedEntity> contentDetailedsById;
    private String updateBody;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Basic
    @Column(name = "date")
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Basic
    @Column(name = "body")
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContentEntity that = (ContentEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (body != null ? !body.equals(that.body) : that.body != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (body != null ? body.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "contentByContentId")
    public Collection<ContentDetailedEntity> getContentDetailedsById() {
        return contentDetailedsById;
    }

    @Override
    public String toString() {
        return "ContentEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", date=" + date +
                ", body='" + body + '\'' +
                ", contentDetailedsById=" + contentDetailedsById +
                ", updateBody='" + updateBody + '\'' +
                '}';
    }

    public void setContentDetailedsById(Collection<ContentDetailedEntity> contentDetailedsById) {
        this.contentDetailedsById = contentDetailedsById;
    }

    @Basic
    @Column(name = "update_body")
    public String getUpdateBody() {
        return updateBody;
    }

    public void setUpdateBody(String updateBody) {
        this.updateBody = updateBody;
    }
}
