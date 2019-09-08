package com.dn.football_leagues_tables.controllers;

import com.dn.football_leagues_tables.service.LeaguesService;
import com.dn.football_leagues_tables.service.TeamDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/europeanLeagues")
public class HomeController {

    @Autowired
    LeaguesService leaguesService;

    @Autowired
    TeamDetailsService teamDetailsService;

    @GetMapping("/{id}/leagueTable")
    public String getLeagueTable(@PathVariable int id, Model model){
        model.addAttribute("leagueTeams", leaguesService.getTeamsFromSpecificLeague(id));
        return "LeagueTable";
    }

    @GetMapping("/{leagueId}/teamsDetails/{teamsId}")
    public String getTeamsDetailsFromChosenLeague(@PathVariable int leagueId, @PathVariable int teamsId, Model model){
        model.addAttribute("teamDetails",teamDetailsService.getDetailsAboutTeam(leagueId, teamsId));
        return "TeamDetails";
    }
}
