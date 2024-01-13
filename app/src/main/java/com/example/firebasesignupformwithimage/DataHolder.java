package com.example.firebasesignupformwithimage;

public class DataHolder {


    String name , course , image;

    public DataHolder(String name, String course, String image) {
        this.name = name;
        this.course = course;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
