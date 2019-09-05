package com.dn.football_leagues_tables.controllers;

import com.dn.football_leagues_tables.model.FootballTeam;
import com.dn.football_leagues_tables.service.LeaguesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/europeanLeagues")
public class HomeController {

    @Autowired
    LeaguesService leaguesService;

    @GetMapping("/{id}/info")
    public String getLeagueTable(@PathVariable int id, Model model){
        model.addAttribute("leagueTeams", leaguesService.getTeamsFromSpecificLeague(id));
        return "LeagueTable";
    }
}
