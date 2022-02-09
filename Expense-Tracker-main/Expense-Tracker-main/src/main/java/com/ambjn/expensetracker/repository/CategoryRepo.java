package com.ambjn.expensetracker.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ambjn.expensetracker.model.Categories;

@Repository
public interface CategoryRepo extends CrudRepository<Categories, Integer>{

}
