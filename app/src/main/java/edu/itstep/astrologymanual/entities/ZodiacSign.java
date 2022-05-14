package edu.itstep.astrologymanual.entities;

import java.io.Serializable;

public class ZodiacSign implements Serializable {
    private String title;
    private int image;
    private String dates;
    private String description;

    public ZodiacSign(String title, int image, String dates, String description) {
        this.title = title;
        this.image = image;
        this.dates = dates;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDates() {
        return dates;
    }

    public void setDates(String dates) {
        this.dates = dates;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
