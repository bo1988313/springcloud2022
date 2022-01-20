package com.zhl.cloud.gateway.util;

import lombok.extern.slf4j.Slf4j;

import java.time.ZonedDateTime;

/**
 * @author Administrator
 */
@Slf4j
public class TimeUtil {
    public static void main(String[] args) {
        log.info(getZonedDateTime());
    }

    public static String getZonedDateTime() {
        ZonedDateTime zbj = ZonedDateTime.now();
        return zbj.toString();
    }
}
