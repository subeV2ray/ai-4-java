package com.sube.ai.service;

import dev.langchain4j.service.spring.AiService;
import dev.langchain4j.service.spring.AiServiceWiringMode;

/**
 * @program: ai-4-java
 * @description:
 * @author: 0x
 * @create: 2026-04-14 13:07
 **/
@AiService(
        wiringMode = AiServiceWiringMode.EXPLICIT, // 手动装配
        chatModel = "openAiChatModel" // 指定模型
)
public interface ConsultantService {
    String chat(String msg);
}
