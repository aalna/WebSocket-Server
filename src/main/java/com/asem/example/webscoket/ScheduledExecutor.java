package com.asem.example.webscoket;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ScheduledExecutor {

    @Autowired
    private SimpMessagingTemplate template;

    @Scheduled(fixedDelay = 2000, initialDelay = 1000)
    public void sendToSubscribers() {
        template.convertAndSend("/topic/messages", OutputMessage.builder().name("User").text("test").build());
    }

}

