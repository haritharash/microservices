package com.training.microservice.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}