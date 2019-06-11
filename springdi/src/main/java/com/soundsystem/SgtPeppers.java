package com.soundsystem;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisk{
    private String title ="Peppers band";
    private String artist="the Beatles";
    public void play() {
        System.out.println("playing song " + title + " " + artist);
    }
}
