package com.bonbravo.chatapp.entity;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ChatMessage {

    private String message;
    private String sender;
    private MessageType messageType;
}
