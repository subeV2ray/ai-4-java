package com.sube.ai.controller;

import com.sube.ai.service.ConsultantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

/**
 * @program: ai-4-java
 * @description:
 * @author: 0x
 * @create: 2026-04-10 13:36
 **/
@RestController
@RequestMapping("/ai")
@RequiredArgsConstructor
public class ChatController {
    private final ConsultantService consultantService;

//    private final OpenAiChatModel chatModel;
//
//
//    @GetMapping("/chat")
//    private String req(@RequestParam("msg") String msg) {
//        return chatModel.chat(msg);
//    }

    @GetMapping(value = "/chat", produces = "text/s;charset=utf-8")
    private Flux<String> reqStream(@RequestParam("msg") String msg) {
        return consultantService.chat(msg);
    }

}
