package com.inexture.stripeintegration.enums;

public enum SubscriptionStatus {
    ACTIVE("active"),
    CANCELED("canceled"),
    PAUSED("paused");

    private final String status;

    SubscriptionStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}

