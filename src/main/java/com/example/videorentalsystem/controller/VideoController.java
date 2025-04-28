package com.example.videorentalsystem.controller;

import com.example.videorentalsystem.entity.Video;
import com.example.videorentalsystem.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/videos")
public class VideoController {
    @Autowired
    private VideoService videoService;

    @GetMapping
    public List<Video> getAllVideos() {
        return videoService.getAllVideos();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping
    public Video addVideo(@RequestBody Video video) {
        return videoService.addVideo(video);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/{id}")
    public void deleteVideo(@PathVariable Long id) {
        videoService.deleteVideo(id);
    }
}