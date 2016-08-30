package com.entity;

/**
 * Created by Evilina on 2016/8/23.
 *  mybatis parameterType的包装对象，包装了查询条件
 */
public class ContentVo {
    //文章信息
    private ContentEntity contentEntity;

    //为了系统可拓展性，对原始po进行拓展
    private ContentExpand contentExpand;

    public ContentEntity getContentEntity() {
        return contentEntity;
    }

    public void setContentEntity(ContentEntity contentEntity) {
        this.contentEntity = contentEntity;
    }

    public ContentExpand getContentExpand() {
        return contentExpand;
    }

    public void setContentExpand(ContentExpand contentExpand) {
        this.contentExpand = contentExpand;
    }

}
