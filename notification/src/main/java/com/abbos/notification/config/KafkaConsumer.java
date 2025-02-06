package com.abbos.notification.config;

import com.abbos.basedomain.dto.NotificationCreateDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;

/**
 * @author Aliabbos Ashurov
 * @since 04/February/2025  14:21
 **/
@Slf4j
@EnableKafka
@Configuration
public class KafkaConsumer {

    @KafkaListener(topics = "notification", groupId = "notification-group-id")
    public void consumer(@Payload NotificationCreateDTO dto) {
        log.info("Received message: {}", dto);
    }

}
