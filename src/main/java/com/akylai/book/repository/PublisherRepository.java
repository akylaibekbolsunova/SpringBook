package com.akylai.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akylai.book.entity.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {

}
