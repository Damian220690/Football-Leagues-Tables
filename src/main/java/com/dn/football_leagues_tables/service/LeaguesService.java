package com.dn.football_leagues_tables.service;

import com.dn.football_leagues_tables.model.FootballTeam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LeaguesService {

    @Autowired
    RestTemplate restTemplate;

    @Value("${api.url}")
    String urlPart;

    @Value("${api.key}")
    String key;

    public FootballTeam[] getInformationAboutSpecificLeague(int id){
        String fullUrlAdress = urlPart + id + key;
        FootballTeam [] teams = restTemplate.getForObject(fullUrlAdress, FootballTeam[].class);
        return teams;
    }
}
