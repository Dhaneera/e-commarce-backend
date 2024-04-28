package edu.clothify.service;

import edu.clothify.dto.CategoryDto;

import java.util.List;

public interface CategoryService {
    boolean saveCategory(CategoryDto categoryDto);

    List<CategoryDto> getAllCategories();

    CategoryDto getCategoryByName(String name);

    boolean deleteCategoryByName(String name);
}
