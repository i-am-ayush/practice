package com.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("cdu")
public class CompactDiskUser {
    private CompactDisk compactDisk;

    public CompactDisk getCompactDisk() {
        return compactDisk;
    }
    CompactDiskUser(){

    }
    @Autowired
    public void setCompactDisk(CompactDisk compactDisk) {
        this.compactDisk = compactDisk;
    }

}
