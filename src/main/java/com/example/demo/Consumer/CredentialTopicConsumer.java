package com.example.demo.Consumer;

import com.example.demo.DTO.LoginRequestDto;
import com.example.demo.DTO.UserDTO;
import com.example.demo.Repository.CredRepository;
import com.example.demo.Repository.UsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.ArrayDeque;

@Component
public class CredentialTopicConsumer {
    @Autowired
    private CredRepository credRepository;

    UserDTO userDTO = new UserDTO( 4L, "dsa");
    private final ArrayDeque<String> messages = new ArrayDeque<>();

    @KafkaListener(topics = "myTopic", groupId = "kafka-sandbox")
    public void listen(String message) {
        synchronized (messages) {
            messages.add(message);
            LoginRequestDto loginRequestDto = new LoginRequestDto();
            loginRequestDto.setLogin(message);
            loginRequestDto.setPassword("asd");
            System.out.println(message);
            credRepository.addToDB(loginRequestDto);

        }

    }

    public ArrayDeque<String> getMessages() {
        return messages;
    }
}
