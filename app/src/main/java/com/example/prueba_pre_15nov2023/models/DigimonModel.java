package com.example.prueba_pre_15nov2023.models;

import kotlin.jvm.internal.SerializedIr;

public class DigimonModel {
    private String name;
    private String img;
    private String level;

    public DigimonModel(String name, String img, String level) {
        this.name = name;
        this.img = img;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public String getImg() {
        return img;
    }

    public String getLevel() {
        return level;
    }
}
