package br.com.pratali.coffee_shop.service;

import br.com.pratali.coffee_shop.entity.Category;
import br.com.pratali.coffee_shop.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    public Category getById(Integer id) {
        return categoryRepository.findById(id).orElse(null);
    }

    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }

    public Category updateCategory(Integer id, Category category) {
        Category x = categoryRepository.findById(id).orElse(null);

        if (x != null) {
            x.setCategoryName(category.getCategoryName());
            return categoryRepository.save(x);
        } else {
            return null;
        }
    }

    public Boolean deleteCategory(Integer id) {
        Category category = categoryRepository.findById(id).orElse(null);

        if (category != null) {
            categoryRepository.delete(category);
            return true;
        }

        return false;
    }
}
