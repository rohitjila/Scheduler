package com.clone.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

//this annotation is used to make the class eligible for dependency injection and register it in the Spring IOC container
@Component
public class ScheduledTasks {
    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);
    private static final SimpleDateFormat date = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 10000) // used to define the scheduled tasks in the application
    public void reportCurrentTime() {
        log.info("The time will generate after every five second {}", date.format(new Date()));
    }
}
