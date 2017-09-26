package com.example.daniel.customlistview;

/**
 * Created by Daniel on 9/26/2017.
 */

public class SchoolSubject {

    public String name;
    public boolean isHomeworkDone;
    public int imageId;
    public boolean isFavorite;

    public SchoolSubject(String name, Boolean isHomeworkDone, int imageId, Boolean isFavorite){
        this.name = name;
        this.isHomeworkDone = isHomeworkDone;
        this.imageId = imageId;
        this.isFavorite = isFavorite;
    }
}
