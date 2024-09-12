package icet.crm.service.Impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import icet.crm.dto.Category;
import icet.crm.entity.CategoryEntity;
import icet.crm.repository.CategoryRepository;
import icet.crm.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    ObjectMapper mapper;

    @Override
    public CategoryEntity createCategory(Category category) {
       //Model entity conversion
        CategoryEntity entity=mapper.convertValue(category,CategoryEntity.class);
        //saving Data

        categoryRepository.save(entity);
        return entity;
    }

    @Override
    public List<Category> getCategory() {
        return null;
    }

    @Override
    public Boolean removeCategory(Long catagoryId) {
        return null;
    }
}
