package com.springboot.practice.chapter03.n03_taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("com.springboot.practice.chapter03.n03_taskscheduler")
@EnableScheduling
public class TaskSchedulerConfig {
}
