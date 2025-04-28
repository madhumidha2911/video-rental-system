package com.example.videorentalsystem.entity;

import lombok.*;
import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String director;
    private String genre;
    private boolean available = true;
}