package com.abbos.user.client;

import com.abbos.basedomain.dto.NotificationCreateDTO;
import com.abbos.user.dto.NotificationResponseDTO;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author Aliabbos Ashurov
 * @since 21/January/2025  12:59
 **/
@FeignClient(name = "notification")
@LoadBalancerClient(name = "notification")
public interface NotificationClient {

    @PostMapping("/api/v1/notification/save")
    NotificationResponseDTO save(@RequestBody NotificationCreateDTO dto);
}

