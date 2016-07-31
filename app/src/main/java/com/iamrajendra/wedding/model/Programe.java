package com.iamrajendra.wedding.model;

/**
 * Created by rajendraverma on 30-07-2016.
 */
public class Programe {
    private int bg_image;
    private String title;
    private String date;

    public Programe(int bg_image, String title, String date) {
        this.bg_image = bg_image;
        this.title = title;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getBg_image() {
        return bg_image;
    }

    public void setBg_image(int bg_image) {
        this.bg_image = bg_image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
