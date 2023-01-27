package com.gdsc.frjns.videos.service;

import com.gdsc.frjns.videos.domain.model.Video;
import com.gdsc.frjns.videos.domain.repository.VideoRepository;
import com.gdsc.frjns.videos.dto.VideoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VideoService {

    private final VideoRepository videoRepository;

    public Slice<VideoResponse> findAll(Pageable pageable) {
        Slice<Video> videoSlice = videoRepository.findAllBy(pageable);

        return videoSlice.map(Video::toResponse);
    }
}
