package com.example.websocket.handler;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Component
public class WebSocket extends TextWebSocketHandler {

    @Override
    public void afterConnectionEstablished(WebSocketSession session) {
        System.out.println("[afterConnectionEstablished] session id : " + session.getId());

        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                try {
                    session.sendMessage(new TextMessage("Olá " + UUID.randomUUID()));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                
            }
            
        }, 1000, 1000);
    }

    // @Override
    // public void handleMessage(WebSocketSession session, WebSocketMessage<?>
    // message) throws Exception {
    // // TODO Auto-generated method stub
    // super.handleMessage(session, message);
    // }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) {
        System.out.println("[handleMessage] message : " + message.getPayload());
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) {
        System.out.println("[afterConnectionClosed] session id : " + session.getId());
    }

}
