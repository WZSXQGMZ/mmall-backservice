package com.mmall.controller.provider;

import com.github.pagehelper.PageInfo;
import com.mmall.common.ServerResponse;
import com.mmall.pojo.Product;
import com.mmall.service.IProductService;
import com.mmall.vo.ProductDetailVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product.service")
public class ProductServiceController {
    @Autowired
    IProductService productService;

    @PostMapping("/saveOrUpdateProduct")
    ServerResponse saveOrUpdateProduct(@RequestBody Product product){
        return productService.saveOrUpdateProduct(product);
    }

    @PostMapping("/setSaleStatus/{productId}/{status}")
    ServerResponse<String> setSaleStatus(@PathVariable("productId") Integer productId, @PathVariable("status") Integer status){
        return productService.setSaleStatus(productId, status);
    }

    @PostMapping("/manageProductDetail/{productId}")
    ServerResponse<ProductDetailVo> manageProductDetail(@PathVariable("productId") Integer productId){
        return productService.manageProductDetail(productId);
    }

    @PostMapping("/getProductList/{pageNum}/{pageSize}")
    ServerResponse<PageInfo> getProductList(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
        return productService.getProductList(pageNum, pageSize);
    }

    @PostMapping("/searchProduct/{productName}/{productId}/{pageNum}/{pageSize}")
    ServerResponse<PageInfo> searchProduct(
            @PathVariable("productName") String productName
            , @PathVariable("productId") Integer productId
            , @PathVariable("pageNum") int pageNum
            , @PathVariable("pageSize") int pageSize){
        return productService.searchProduct(productName, productId, pageNum, pageSize);
    }

    @PostMapping("/getProductDetail/{productId}")
    ServerResponse<ProductDetailVo> getProductDetail(@PathVariable("productId") Integer productId){
        return productService.getProductDetail(productId);
    }

    @PostMapping("/getProductByKeywordCategory/{keyword}/{categoryId}/{pageNum}/{pageSize}/{orderBy}")
    ServerResponse<PageInfo> getProductByKeywordCategory(
            @PathVariable("keyword") String keyword
            , @PathVariable("categoryId") Integer categoryId
            , @PathVariable("pageNum") int pageNum
            , @PathVariable("pageSize") int pageSize
            , @PathVariable("orderBy") String orderBy){
        return productService.getProductByKeywordCategory(keyword, categoryId, pageNum, pageSize, orderBy);
    }
}
