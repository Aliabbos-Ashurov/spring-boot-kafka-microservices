package com.abbos.user.config;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author Aliabbos Ashurov
 * @since 04/February/2025  14:40
 **/
@Getter
@RequiredArgsConstructor
public enum KafkaTopic {

    NOTIFICATION("notification");

    private final String header;
}
