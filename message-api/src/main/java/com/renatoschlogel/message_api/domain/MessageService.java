package com.renatoschlogel.message_api.domain;

import com.renatoschlogel.message_api.infra.Message;
import com.renatoschlogel.message_api.infra.MessageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    private final MessageRepository repository;

    public MessageService(MessageRepository repository) {
        this.repository = repository;
    }

    public Message create(String content) {
        Message message = new Message(content);
        return repository.save(message);
    }

    public List<Message> listAll() {
        return repository.findAll();
    }
}
