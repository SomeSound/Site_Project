package com.example.SiteProject.SiteProject.services;

import com.example.SiteProject.SiteProject.dtos.ArtistDTO;
import com.example.SiteProject.SiteProject.entities.ArtistEntity;

public class ArtistServiceImpl implements ArtistService {
    @Override
    public ArtistDTO save(ArtistDTO artist) {

        ArtistDTO response = new ArtistDTO();
        try{
            response = new ArtistDTO();
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return response;
    }
}
