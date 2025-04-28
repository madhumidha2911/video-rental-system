package com.example.videorentalsystem.repository;

import com.example.videorentalsystem.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Long> {
}