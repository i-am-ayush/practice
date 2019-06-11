package com.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CdPlayerJavaConfig {
    @Bean
    public CompactDisk sgtPeppers(){
        return new SgtPeppers();
    }
    @Bean(name="cdu")
    public CompactDiskUser compactDiskUser(){
        return new CompactDiskUser();
    }
}
