package com.abbos.basedomain.dto;

import java.io.Serializable;

/**
 * @author Aliabbos Ashurov
 * @since 06/February/2025  10:27
 **/
public record NotificationCreateDTO(
        String message,
        Long userId
) implements Serializable {
}
