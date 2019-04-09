package com.mmall.controller.provider;

import com.mmall.common.ServerResponse;
import com.mmall.service.ICartService;
import com.mmall.vo.CartVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart.service")
public class CartServiceCotroller {

    @Autowired
    ICartService cartService;

    @PostMapping("/add/{userId}/{productId}/{count}")
    ServerResponse<CartVo> add(@PathVariable("userId") Integer userId, @PathVariable("productId") Integer productId, @PathVariable("count") Integer count){
        return cartService.add(userId, productId, count);
    }

    @PostMapping("/update/{userId}/{productId}/{count}")
    ServerResponse<CartVo> update(@PathVariable("userId") Integer userId, @PathVariable("productId") Integer productId, @PathVariable("count") Integer count){
        return cartService.update(userId, productId, count);
    }

    @PostMapping("/deleteProduct/{userId}/{productId}")
    ServerResponse<CartVo> deleteProduct(@PathVariable("userId") Integer userId, @PathVariable("productIds") String productIds){
        return cartService.deleteProduct(userId, productIds);
    }

    @PostMapping("/list/{userId}")
    ServerResponse<CartVo> list(@PathVariable("userId") Integer userId){
        return cartService.list(userId);
    }

    @PostMapping("/selectOrUnselect/{userId}/{productId}/{checked}")
    ServerResponse<CartVo> selectOrUnselect(
            @PathVariable("userId") Integer userId
            , @PathVariable("productId") Integer productId
            , @PathVariable("checked") Integer checked){
        return cartService.selectOrUnselect(userId, productId, checked);
    }

    @PostMapping("/getCartProductCount/{userId}")
    ServerResponse<Integer> getCartProductCount(@PathVariable("userId") Integer userId){
        return cartService.getCartProductCount(userId);
    }
}
