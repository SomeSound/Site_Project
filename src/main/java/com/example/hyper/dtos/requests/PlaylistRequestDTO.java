package com.example.hyper.dtos.requests;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class PlaylistRequestDTO {

    @NotEmpty(message = "Invalid name, can not be empty")
    private String name;

//    private List<TrackRequestDTO> tracks;
}