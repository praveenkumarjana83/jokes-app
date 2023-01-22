package com.jpk.jokesapp.controller;

import com.jpk.jokesapp.services.JokeService;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/"})
    public  String showJoke(@NotNull Model model) {
        model.addAttribute("joke", jokeService.getJoke());
        return "index";
    }

}
