package com.mmall.controller.provider;

import com.github.pagehelper.PageInfo;
import com.mmall.common.ServerResponse;
import com.mmall.pojo.Shipping;
import com.mmall.service.IShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shipping")
public class ShippingServiceController {
    @Autowired
    IShippingService shippingService;


    @PostMapping("/add/{userId}")
    ServerResponse add(@PathVariable("userId") Integer userId, @RequestBody Shipping shipping){
        return shippingService.add(userId, shipping);
    }

    @PostMapping("/del/{userId}/{shippingId}")
    ServerResponse<String> del(@PathVariable("userId") Integer userId, @PathVariable("shippingId") Integer shippingId){
        return shippingService.del(userId, shippingId);
    }

    @PostMapping("/update/{userId}")
    ServerResponse update(@PathVariable("userId") Integer userId, @RequestBody Shipping shipping){
        return shippingService.update(userId, shipping);
    }

    @PostMapping("/select/{userId}/{shippingId}")
    ServerResponse<Shipping> select(@PathVariable("userId") Integer userId, @PathVariable("shippingId") Integer shippingId){
        return shippingService.select(userId, shippingId);
    }

    @PostMapping("/list/{userId}/{pageNum}/{pageSize}")
    ServerResponse<PageInfo> list(@PathVariable("userId") Integer userId, @PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
        return shippingService.list(userId, pageNum, pageSize);
    }


}
