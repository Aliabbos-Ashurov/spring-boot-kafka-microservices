package com.abbos.user.config;

import com.abbos.basedomain.dto.NotificationCreateDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

/**
 * @author Aliabbos Ashurov
 * @since 04/February/2025  14:22
 **/
@EnableKafka
@Configuration
@RequiredArgsConstructor
public class KafkaProducer {

    private final KafkaTemplate<String, NotificationCreateDTO> kafkaTemplate;

    public void sendMessageDTO(NotificationCreateDTO dto) {
        Message<NotificationCreateDTO> props = MessageBuilder.withPayload(dto)
                .setHeader(KafkaHeaders.TOPIC, "notification")
                .build();
        kafkaTemplate.send(props);
    }
}
