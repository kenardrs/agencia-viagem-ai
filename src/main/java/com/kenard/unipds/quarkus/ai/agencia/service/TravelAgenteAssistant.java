package com.kenard.unipds.quarkus.ai.agencia.service;

import io.quarkiverse.langchain4j.RegisterAiService;

@RegisterAiService
public interface TravelAgenteAssistant {
    /**
     * Receives a user message and returns a response from the travel agent assistant.
     *
     * @param userMessage The message from the user.
     * @return The response from the travel agent assistant.
     */
    String chat(String userMessage);
}
