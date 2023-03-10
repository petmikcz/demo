package cz.dev.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cz.dev.model.Message;


@RestController()
@RequestMapping("/dev")
public class MsgController {

    @GetMapping("/message")
    public Message startMessage(@RequestParam(name = "message", defaultValue = "World") String text) {
        return new Message(String.format("Hello %s!", text));

    }
}