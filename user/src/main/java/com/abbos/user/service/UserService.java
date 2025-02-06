package com.abbos.user.service;

import com.abbos.basedomain.dto.NotificationCreateDTO;
import com.abbos.user.client.NotificationClient;
import com.abbos.user.config.KafkaProducer;
import com.abbos.user.dto.UserCreateDTO;
import com.abbos.user.dto.UserResponseDTO;
import com.abbos.user.entity.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Aliabbos Ashurov
 * @since 21/January/2025  11:31
 **/
@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {
    private final NotificationClient notificationClient;
    private final KafkaProducer kafkaProducer;

    @Transactional
    public UserResponseDTO save(UserCreateDTO dto) {
        final var userNew = new User().toBuilder()
                .username(dto.username())
                .fullName(dto.fullName())
                .email(dto.email())
                .password(dto.password())
                .build();

        kafkaProducer.sendMessageDTO(new NotificationCreateDTO("Hello from producer", -1L));


        log.info("Message sent successfully");
        return new UserResponseDTO(userNew.getId(), userNew.getFullName(), userNew.getUsername(), userNew.getEmail());
    }

}
