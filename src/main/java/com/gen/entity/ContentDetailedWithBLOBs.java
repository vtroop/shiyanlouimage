package com.gen.entity;

import java.io.Serializable;

public class ContentDetailedWithBLOBs extends ContentDetailed implements Serializable{
    private String bodyRaw;

    private String bodyFixed;

    public String getBodyRaw() {
        return bodyRaw;
    }

    public void setBodyRaw(String bodyRaw) {
        this.bodyRaw = bodyRaw == null ? null : bodyRaw.trim();
    }

    public String getBodyFixed() {
        return bodyFixed;
    }

    @Override
    public String toString() {
        return "ContentDetailedWithBLOBs{" +
                "bodyRaw='" + bodyRaw + '\'' +
                ", bodyFixed='" + bodyFixed + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContentDetailedWithBLOBs that = (ContentDetailedWithBLOBs) o;

        if (bodyRaw != null ? !bodyRaw.equals(that.bodyRaw) : that.bodyRaw != null) return false;
        return bodyFixed != null ? bodyFixed.equals(that.bodyFixed) : that.bodyFixed == null;

    }

    @Override
    public int hashCode() {
        int result = bodyRaw != null ? bodyRaw.hashCode() : 0;
        result = 31 * result + (bodyFixed != null ? bodyFixed.hashCode() : 0);
        return result;
    }

    public void setBodyFixed(String bodyFixed) {
        this.bodyFixed = bodyFixed == null ? null : bodyFixed.trim();
    }
}