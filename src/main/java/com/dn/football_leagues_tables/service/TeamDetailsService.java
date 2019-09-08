package com.dn.football_leagues_tables.service;

import com.dn.football_leagues_tables.model.TeamDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TeamDetailsService {

    @Autowired
    RestTemplate restTemplate;

    @Value("${api.teamsUrl}")
    private String teamsUrlPart;

    @Value("${api.key}")
    private String key;

    public TeamDetails getDetailsAboutTeam(int leagueId, int teamId){
        String urlAdress = teamsUrlPart + leagueId +"&team_id=" + teamId + key;
        TeamDetails[] teamsDetails = restTemplate.getForObject(urlAdress, TeamDetails[].class);
        return teamsDetails[0];
    }

}
