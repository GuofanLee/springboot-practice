package com.springboot.practice.chapter03.n03_taskscheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ScheduledTaskService {

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("每隔五秒执行一次：" + DATE_FORMAT.format(new Date()));
    }

    /**
     * 16:07:00 执行
     */
    @Scheduled(cron = "0 07 16 ? * *")
    public void fixTimeExecution() {
        System.out.println("在指定时间执行：" + DATE_FORMAT.format(new Date()));
    }

}
