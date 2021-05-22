
package com.online.foodify.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.foodify.model.Category;
import com.online.foodify.repository.CategoryRepo;

@Service
public class CategoryService {

	@Autowired
	CategoryRepo categoryRepo;

	public List<Category> getAllCategory() {
		return categoryRepo.findAll();
	}

	public void addCategory(Category category) {
		categoryRepo.save(category);
	}

	public void removeCategorybyId(int id) {
		categoryRepo.deleteById(id);
	}

	public Optional<Category> updateCategoryById(int id) {
		return categoryRepo.findById(id);
	}
}
