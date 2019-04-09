package com.mmall.listener;

import com.mmall.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

//@Component
public class ApplicationReadyListener implements ApplicationListener<ApplicationReadyEvent> {
    @Autowired
    ProductServiceImpl productService;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        productService.moveProductInfoToSolr();
    }
}
