package com.sube.ai.config;

import com.sube.ai.service.ConsultantService;
import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.service.AiServices;
import dev.langchain4j.service.spring.AiService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: ai-4-java
 * @description:
 * @author: 0x
 * @create: 2026-04-14 13:08
 **/
@Configuration
@RequiredArgsConstructor
public class CommonConfig {

    private final OpenAiChatModel chatModel;

//    @Bean
//    public ConsultantService consultantService() {
//        return AiServices.builder(ConsultantService.class)
//                .chatModel(chatModel)
//                .build();
//    }
}
