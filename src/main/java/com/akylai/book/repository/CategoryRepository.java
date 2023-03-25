package com.akylai.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akylai.book.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
