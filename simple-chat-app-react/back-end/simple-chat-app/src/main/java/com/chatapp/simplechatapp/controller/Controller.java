package com.chatapp.simplechatapp.controller;

import com.chatapp.simplechatapp.model.ChatMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @MessageMapping("/chatroom")
    @SendTo("/chatroom/public")
    public ChatMessage receivePublicMessage(
            @Payload ChatMessage chatMessage
    ) {
        return chatMessage;
    }

    @MessageMapping("/chatroom")
    @SendTo("/chatroom/public")
    public ChatMessage receivePrivateMessage(
            @Payload ChatMessage chatMessage
    ) {
        simpMessagingTemplate.convertAndSendToUser(chatMessage.getReceiver(), "/private", chatMessage);
        return chatMessage;
    }

}
