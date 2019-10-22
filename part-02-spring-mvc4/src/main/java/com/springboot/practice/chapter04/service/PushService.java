package com.springboot.practice.chapter04.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 在PushService里产生DeferredResult给控制器使用，
 * 通过@Scheduled注解的方法定时更新DeferredResult
 *
 * @author GuofanLee
 * @date 2019-10-22 11:17
 */
@Service
public class PushService {

    private DeferredResult<String> deferredResult;

    public DeferredResult<String> getAsyncUpdate() {
        deferredResult = new DeferredResult<>();
        return deferredResult;
    }

    @Scheduled(fixedDelay = 5000)
    public void refresh() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if (deferredResult != null) {
            deferredResult.setResult(dateFormat.format(new Date()));
        }
    }

}
