package com.example.yyz.news121.utils;

/**
 * Created by yyz on 2017/2/21.
 */
public class TitleValueEntity {
    private String title;
    private float value;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public TitleValueEntity(String title, float value) {
        super();
        this.title = title;
        this.value = value;
    }

    public TitleValueEntity() {
        super();
    }
}
