package com.chat.app.controller;

import com.chat.app.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {
    // this annotation maps websocket message to destination (/sendMessage)
    //when ever client send msg to this endpoint this  method is called to process it
    @MessageMapping("/sendMessage")
    // return of this particular method is send to chatroom ie: /topic/messages
    // who are subscribe to this pariticular topic
    @SendTo("/topic/message")
    public ChatMessage sendMessage(ChatMessage message){
        return message;
    }

    //whoever visiting the root url we will return Thymeleaf template

    @GetMapping("/chat")
    public String chat(){
        return "chat";
    }
}
