package com.abbos.notification.controller;

import com.abbos.basedomain.dto.NotificationCreateDTO;
import com.abbos.notification.dto.NotificationResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Aliabbos Ashurov
 * @since 21/January/2025  11:58
 **/
@RestController
@RequestMapping("/api/v1/notification")
@RequiredArgsConstructor
public class NotificationController {

    @PostMapping("/save")
    public ResponseEntity<NotificationResponseDTO> save(@RequestBody NotificationCreateDTO dto) {
        //return ResponseEntity.ok(notificationService.save("Hi"));
        return null;
    }
}
