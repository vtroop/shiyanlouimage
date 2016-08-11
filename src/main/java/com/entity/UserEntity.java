package com.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Evilina on 2016/7/31.
 */
@Entity
@Table(name = "user", schema = "shiyanloudb", catalog = "")
public class UserEntity {
    private int id;
    private String username;
    private String password;
    private Collection<ImageEntity> imagesById;

    public UserEntity(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public UserEntity(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public UserEntity() {
    }

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "username", nullable = true, length = 16)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password", nullable = true, length = 16)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (id != that.id) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @OneToMany(mappedBy = "userByUserId")
    public Collection<ImageEntity> getImagesById() {
        return imagesById;
    }

    public void setImagesById(Collection<ImageEntity> imagesById) {
        this.imagesById = imagesById;
    }
}
