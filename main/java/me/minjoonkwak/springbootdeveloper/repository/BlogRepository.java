package me.minjoonkwak.springbootdeveloper.repository;

import me.minjoonkwak.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
