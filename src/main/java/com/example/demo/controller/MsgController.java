package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Message;

@RestController("/dev")
public class MsgController {

    @GetMapping("/hello")
    public Message startMessage(@RequestParam(name = "text", defaultValue = "World") String text) {
        return new Message(String.format("Hello %s!", text));

    }
}