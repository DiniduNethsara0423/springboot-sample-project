package icet.crm.controller;

import icet.crm.dto.Category;
import icet.crm.entity.CategoryEntity;
import icet.crm.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @PostMapping("/category")
    Category createCategory(@RequestBody Category category){
        return categoryService.createCategory(category);

    }
}
