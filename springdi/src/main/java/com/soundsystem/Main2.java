package com.soundsystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

public class Main2 {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(CdPlayerJavaConfig.class);
        ctx.refresh();
        SgtPeppers sgtPeppers=(SgtPeppers)ctx.getBean("sgtPeppers");
        CompactDiskUser compactDiskUser=(CompactDiskUser)ctx.getBean("cdu");
        System.out.println(compactDiskUser.getCompactDisk());
        sgtPeppers.play();
    }
}
