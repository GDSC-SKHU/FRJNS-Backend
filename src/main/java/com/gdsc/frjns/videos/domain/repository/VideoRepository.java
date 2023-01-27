package com.gdsc.frjns.videos.domain.repository;

import com.gdsc.frjns.videos.domain.model.Video;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Long> {
    Slice<Video> findAllBy(Pageable pageable);
}