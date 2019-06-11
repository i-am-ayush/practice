package com.soundsystem;

import java.util.List;

public class BlankDisk implements CompactDisk {
    private String title;
    private String artist;

    public BlankDisk(String title, String artist, List<String> track) {
        this.title = title;
        this.artist = artist;
        this.track = track;
    }

    private List<String> track;
    public void play() {
        System.out.println(title + " " + "played by" + " " +artist);
        for(String track1:track){
            System.out.println(track1);
        }
    }
}
