package com.chatapp.simplechatapp.model;


import com.chatapp.simplechatapp.constants.MessageType;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ChatMessage {
    private String sender;
    private String content;
    private String receiver;
    private String date;
    private MessageType type;
}
