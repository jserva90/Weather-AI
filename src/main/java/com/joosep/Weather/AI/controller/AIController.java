package com.joosep.Weather.AI.controller;

import com.joosep.Weather.AI.service.AIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AIController {
    private final AIService aiService;

    @Autowired
    public AIController(AIService aiService) {
        this.aiService = aiService;
    }

    @GetMapping("/cities")
    public String cityFaq(@RequestParam String message) {
        return aiService.cityFaq(message);
    }
}

