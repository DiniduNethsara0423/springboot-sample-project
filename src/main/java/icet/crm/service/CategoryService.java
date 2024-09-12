package icet.crm.service;

import icet.crm.dto.Category;
import icet.crm.entity.CategoryEntity;

import java.util.List;

public interface CategoryService {
    CategoryEntity createCategory(Category category);

    List<Category> getCategory();

    Boolean removeCategory(Long catagoryId);

}
