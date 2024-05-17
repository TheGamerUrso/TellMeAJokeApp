package tgu.springframework.TellMeAJoke.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import tgu.springframework.TellMeAJoke.services.TellAJokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TellMeAJokeController 
{

    private final TellAJokeService tellAJokeService;

    public TellMeAJokeController(@Qualifier("TellAJokeService")TellAJokeService tellAJokeService) {
        this.tellAJokeService = tellAJokeService;
    }

    @RequestMapping({"/", ""})
    public String TellMeAJoke(Model model)
    {
        model.addAttribute("joke", tellAJokeService.TellAJoke());
        return "index";
    }
    
}
