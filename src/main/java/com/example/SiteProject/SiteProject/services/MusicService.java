package com.example.SiteProject.SiteProject.services;

import com.example.SiteProject.SiteProject.dtos.MusicDTO;

public interface MusicService {

    public MusicDTO save(MusicDTO music);

    public MusicDTO delete(Long id);

}
