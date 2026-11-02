package com.renatoschlogel.message_api.api;

import com.renatoschlogel.message_api.domain.MessageService;
import com.renatoschlogel.message_api.infra.Message;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/messages")
@AllArgsConstructor
public class MessageController {

    private final MessageService service;

    @GetMapping
    public List<Message> listAll() {
        return service.listAll();
    }

    @PostMapping
    public Message create(@RequestBody CreateMessageRequest request) {
        return service.create(request.content());
    }



}
