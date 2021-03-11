package com.goit.module7;

public enum Season {
    SUMMER("summer", 3),
    AUTUMN("autumn", 4),
    WINTER("winter", 1),
    SPRING("spring", 2);

    private String name;
    private int place;

    Season(String name, int place) {
        this.name = name;
        this.place = place;
    }

    public String getName() {
        return name;
    }
}
