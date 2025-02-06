package com.abbos.user.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * @author Aliabbos Ashurov
 * @since 04/February/2025  14:22
 **/
@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic notificationTopic() {
        return TopicBuilder.name(KafkaTopic.NOTIFICATION.getHeader())
                .build();
    }
}
