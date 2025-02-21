package com.chat.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
      registry.addEndpoint("/chat")
//this we have used for security feature so that we want to entertain request for this URL only
// it will prevent any sort of unauthorized broadcast or message comming into our application
              .setAllowedOrigins("http://localhost:8080")
// this will add compatibilty for clients that dont support websockets by using sockjs as the fallback
// and this makes the app more accessible to the more users
              .withSockJS();
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
//set message broker
// this line setups a message broker that can handle message for topics
// we are saying that if whoever is subscribe to this slash topic
// they will get a broadcast of whatever message are being sent over here
        registry.enableSimpleBroker("/topic");
//expect message with /app/sendmessage
 // here we are actually telling the server that if you get any sort of message
// with this prefix process it
        registry.setApplicationDestinationPrefixes("/app");
    }
}
