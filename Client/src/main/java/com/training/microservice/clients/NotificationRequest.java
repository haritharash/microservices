package com.training.microservice.clients;

public record NotificationRequest(Integer toCustomerId, String toCustomerName, String message) {

}
