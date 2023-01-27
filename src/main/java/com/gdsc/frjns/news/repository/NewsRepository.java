package com.gdsc.frjns.news.repository;

import com.gdsc.frjns.news.domain.News;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NewsRepository extends JpaRepository<News, Long> {

    List<News> findAll();
    Slice<News> findAllBy(Pageable pageable);
}
