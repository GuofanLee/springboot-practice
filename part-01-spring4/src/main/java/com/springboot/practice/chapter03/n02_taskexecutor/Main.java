package com.springboot.practice.chapter03.n02_taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 请填写类的描述
 *
 * @author GuofanLee
 * @date 2019-09-25 20:49
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);
        for (int i = 0; i < 10; i++) {
            asyncTaskService.executorAsyncTask(i);
            asyncTaskService.executeAsyncTaskPlus(i);
        }
        context.close();
    }

}
