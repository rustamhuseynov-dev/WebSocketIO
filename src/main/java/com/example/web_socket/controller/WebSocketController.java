package com.example.web_socket.controller;

import com.example.web_socket.model.WSMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/ws")
@RequiredArgsConstructor
public class WebSocketController {

    private final SimpMessagingTemplate simpMessagingTemplate;

    @MessageMapping("/chat")
    public void chatEndPoint(@Payload WSMessage wsMessage){
        System.out.println(wsMessage);
        simpMessagingTemplate.convertAndSend("/topic",wsMessage);
    }
}
