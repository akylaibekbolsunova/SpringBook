package com.akylai.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akylai.book.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
