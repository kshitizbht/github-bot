package com.github.bot.githubbot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BotController {

    @PostMapping("/webhookevents")
    public void githubEvent(@RequestBody GithubEvent event) {
        if (event.getPull_request() != null) {
            System.out.println(event.getPull_request().getTitle());
        } else {
            System.out.println(event);
        }
    }

    @GetMapping("/test")
    public String getStatus(){
        return "The app is running fine";
    }
}
