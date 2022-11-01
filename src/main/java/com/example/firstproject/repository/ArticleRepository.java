package com.example.firstproject.repository;

import com.example.firstproject.entity.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article,Long> {
// CrudRepository<관리대상 엔티티: Article, 대표값의 타입(id) : Long>
}
