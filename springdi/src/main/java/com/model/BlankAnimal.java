package com.model;

import com.soundsystem.CompactDisk;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BlankAnimal {
        private String title;
        private String artist;

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    @Autowired
    private Animal animal;

        public BlankAnimal(String title, String artist, List<String> track) {
            this.title = title;
            this.artist = artist;
            this.track = track;
        }
        BlankAnimal(){

        }
        private List<String> track;
        public void play() {
            System.out.println(title + " " + "played by" + " " +artist);
            for(String track1:track){
                System.out.println(track1);
            }
        }
    }

