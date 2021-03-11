package com.goit.module5.qa;

public class StarTrack {
    private Point start;
    private Point finish;
    private String name;

    public StarTrack(Point start, Point finish) {
        this.start = start;
        this.finish = finish;
    }

    public void setName(String name) {
        this.name = name;
    }
}
