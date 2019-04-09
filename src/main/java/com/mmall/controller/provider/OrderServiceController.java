package com.mmall.controller.provider;

import com.github.pagehelper.PageInfo;
import com.mmall.common.ServerResponse;
import com.mmall.service.IOrderService;
import com.mmall.vo.OrderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/order.service")
public class OrderServiceController {
    @Autowired
    IOrderService orderService;

    @PostMapping("/pay/{orderNo}/{userId}/{path}")
    ServerResponse pay(@PathVariable("orderNo") Long orderNo, @PathVariable("userId") Integer userId, @PathVariable("path") String path){
        return orderService.pay(orderNo, userId, path);
    }

    @PostMapping("/aliCallback")
    ServerResponse aliCallback(@RequestBody Map<String, String> params){
        return orderService.aliCallback(params);
    }

    @PostMapping("/queryOrderPayStatus/{userId}/{orderNo}")
    ServerResponse queryOrderPayStatus(@PathVariable("userId") Integer userId, @PathVariable("orderNo") Long orderNo){
        return orderService.queryOrderPayStatus(userId, orderNo);
    }

    @PostMapping("/createOrder/{userId}/{shippingId}")
    ServerResponse createOrder(@PathVariable("userId") Integer userId, @PathVariable("shippingId") Integer shippingId){
        return orderService.createOrder(userId, shippingId);
    }

    @PostMapping("/cancel/{userId}/{orderNo}")
    ServerResponse<String> cancel(@PathVariable("userId") Integer userId, @PathVariable("orderNo")Long orderNo){
        return orderService.cancel(userId, orderNo);
    }

    @PostMapping("/getOrderCartProduct/{userId}")
    ServerResponse getOrderCartProduct(@PathVariable("userId")Integer userId){
        return orderService.getOrderCartProduct(userId);
    }

    @PostMapping("/getOrderDetail/{userId}/{orderNo}")
    ServerResponse<OrderVo> getOrderDetail(@PathVariable("userId")Integer userId, @PathVariable("orderNo")Long orderNo){
        return orderService.getOrderDetail(userId, orderNo);
    }

    @PostMapping("/getOrderList/{userId}/{pageNum}/{pageSize}")
    ServerResponse<PageInfo> getOrderList(@PathVariable("userId")Integer userId, @PathVariable("pageNum")int pageNum, @PathVariable("pageSize")int pageSize){
        return orderService.getOrderList(userId, pageNum, pageSize);
    }

    // backend

    @PostMapping("/manageList/{pageNum}/{pageSize}")
    ServerResponse<PageInfo> manageList(@PathVariable("pageNum")int pageNum, @PathVariable("pageSize")int pageSize){
        return orderService.manageList(pageNum, pageSize);
    }

    @PostMapping("/manageDetail/{orderNo}")
    ServerResponse<OrderVo> manageDetail(@PathVariable("orderNo")Long orderNo){
        return orderService.manageDetail(orderNo);
    }

    @PostMapping("/manageSearch/{orderNo}/{pageNum}/{pageSize}")
    ServerResponse<PageInfo> manageSearch(@PathVariable("orderNo")Long orderNo, @PathVariable("pageNum")int pageNum, @PathVariable("pageSize")int pageSize){
        return orderService.manageSearch(orderNo, pageNum, pageSize);
    }

    @PostMapping("/manageSendGoods/{orderNo}")
    ServerResponse<String> manageSendGoods(@PathVariable("orderNo")Long orderNo){
        return orderService.manageSendGoods(orderNo);
    }

    // hour个小时以内未付款的订单，进行关闭
    void closeOrder(int hour){
        orderService.closeOrder(hour);
    }

}
