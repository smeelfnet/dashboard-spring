package com.dashboard.api.models.actor;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "actors")
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "actor_id")
    private Long id;

    @Column(name = "full_name")
    @NotEmpty(message = "*Please provide your name")
    private String fullName;

    @Column(name = "active")
    private Long active;

    @Column(name = "tmdb_id")
    private Long tmdbId;

    @Column(name = "picture_path")
    private String picturePath;
}
