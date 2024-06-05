package tgu.springframework.TellMeAJoke.controllers;

import tgu.springframework.TellMeAJoke.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TellMeAJokeController 
{

    private final JokeService  jokeService;

    public TellMeAJokeController(JokeService  jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model) {

        model.addAttribute("joke", jokeService.getJoke());

        return "index";
    }
    
}
