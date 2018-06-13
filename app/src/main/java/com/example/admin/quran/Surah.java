package com.example.admin.quran;

/**
 * Created by admin on 6/8/2018.
 */

public class Surah {
    private String stand;
    private String name;
    private String url;
    private String filename;

    public Surah(String stand, String name, String url, String filename) {
        this.stand = stand;
        this.name = name;
        this.url = url;
        this.filename = filename;
    }

    public String getStand() {
        return stand;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public String getFilename() {
        return filename;
    }
}

//test AnassLamaiz editing this
