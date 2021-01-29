package com.spring.codeBlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.codeBlog.model.Post;

@Repository
public interface CodeblogRepository extends JpaRepository<Post, Long> {

}
