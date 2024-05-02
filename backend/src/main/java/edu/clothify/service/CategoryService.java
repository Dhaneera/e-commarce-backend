package edu.clothify.service;

import edu.clothify.dto.CategoryDto;

import java.util.List;

public interface CategoryService {
    public boolean saveCategory(CategoryDto categoryDto);

    public List<CategoryDto> getAllCategories();

    CategoryDto getCategoryByName(String name);

    boolean deleteCategoryByName(String name);
}
