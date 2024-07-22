package com.training.microservice.clients;

import org.springframework.web.bind.annotation.PostMapping;

public interface NotificationClient {
    @PostMapping("api/v1/notification")
    void sendNotification(NotificationRequest notificationRequest);
}
