package com.mmall.controller.provider;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.Category;
import com.mmall.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category.service")
public class CategoryServiceController {

    @Autowired
    ICategoryService categoryService;

    @PostMapping("/addCategory/{categoryName}/{parentId}")
    ServerResponse addCategory(@PathVariable("categoryName") String categoryName, @PathVariable("parentId") Integer parentId){
        return categoryService.addCategory(categoryName, parentId);
    }

    @PostMapping("/updateCategoryName/{categoryId}/{categoryName}")
    ServerResponse updateCategoryName(@PathVariable("categoryId") Integer categoryId, @PathVariable("categoryName") String categoryName){
        return categoryService.updateCategoryName(categoryId, categoryName);
    }

    @PostMapping("/getChildrenParallelCategory/{categoryId}")
    ServerResponse<List<Category>> getChildrenParallelCategory(@PathVariable("categoryId") Integer categoryId){
        return categoryService.getChildrenParallelCategory(categoryId);
    }

    @PostMapping("/selectCategoryAndChildrenById/{categoryId}")
    ServerResponse<List<Integer>> selectCategoryAndChildrenById(@PathVariable("categoryId") Integer categoryId){
        return categoryService.selectCategoryAndChildrenById(categoryId);
    }
}
