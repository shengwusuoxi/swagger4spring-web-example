package com.sparc.swagger4springweb.controllers.api;

import com.sparc.swagger4springweb.models.Category;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiError;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/api/v1/categories")
public class CategoryController {

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public
    @ResponseBody
    Category[] categories() {
        Category category1 = new Category();
        category1.setId(1);
        category1.setName("Full Time");
        Category category2 = new Category();
        category2.setId(2);
        category2.setName("Part Time");

        return new Category[]{category1, category2};
    }

    @RequestMapping(value = "/{categoryId}", method = RequestMethod.POST, consumes = "application/json")
    public void updateCategory(@PathVariable Long categoryId, @RequestBody Category category) {
        //update category
    }
}
