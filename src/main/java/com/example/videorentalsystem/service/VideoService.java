package com.example.videorentalsystem.service;

import com.example.videorentalsystem.entity.Video;
import com.example.videorentalsystem.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService {
    @Autowired
    private VideoRepository videoRepository;

    public List<Video> getAllVideos() {
        return videoRepository.findAll();
    }

    public Video addVideo(Video video) {
        return videoRepository.save(video);
    }

    public void deleteVideo(Long id) {
        videoRepository.deleteById(id);
    }
}