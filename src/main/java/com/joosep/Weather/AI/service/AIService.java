package com.joosep.Weather.AI.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AIService {
    private final ChatClient client;

    @Autowired
    public AIService(ChatClient.Builder builder) {
        this.client = builder
                .defaultSystem("You are a helpful AI Assistant answering questions about cities around the world.")
                // try commenting out the next line in order to see changes in the AI's responses
                .defaultFunctions("currentWeatherFunction")
                .build();
    }


    public String cityFaq(String message) {
        return client.prompt()
                .user(message)
                .call()
                .content();
    }
}
