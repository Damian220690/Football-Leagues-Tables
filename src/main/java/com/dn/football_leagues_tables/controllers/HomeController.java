package com.dn.football_leagues_tables.controllers;

import com.dn.football_leagues_tables.model.FootballTeam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;


@Controller
@RequestMapping("/europeanLeagues")
public class HomeController {

    @Autowired
    RestTemplate restTemplate;

    @Value("${api.url}")
    String urlPart;

    @Value("${api.key}")
    String key;

    @GetMapping("/{id}/info")
    @ResponseBody
    public FootballTeam[] getInfo(@PathVariable int id){
        String fullUrlAdress = urlPart+id+key;
        FootballTeam [] teams = restTemplate.getForObject(fullUrlAdress, FootballTeam[].class);
        return teams;
    }
}
