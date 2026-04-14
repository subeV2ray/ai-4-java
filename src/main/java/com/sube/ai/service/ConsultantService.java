package com.sube.ai.service;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;
import dev.langchain4j.service.spring.AiServiceWiringMode;
import reactor.core.publisher.Flux;

/**
 * @program: ai-4-java
 * @description:
 * @author: 0x
 * @create: 2026-04-14 13:07
 **/
@AiService(
        wiringMode = AiServiceWiringMode.EXPLICIT, // 手动装配
        chatModel = "openAiChatModel", // 指定模型
        streamingChatModel = "openAiStreamingChatModel"
)
public interface ConsultantService {
//    String chat(String msg);
    @SystemMessage("你是一个Java领域专家，只回答Java相关的问题。如果被问到不属于Java的问题，直接拒绝回答")
//    @SystemMessage(fromResource = "system.txt")
    Flux<String> chat(String msg);
}
