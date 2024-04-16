package com.inexture.stripeintegration.service.impl;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Account;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class StripeService {

    @Value("${stripe.apiKey}")
    private String stripeSecretKey;

    public Account getStripeAccount() throws StripeException {
        Stripe.apiKey = stripeSecretKey;

        return Account.retrieve();
    }

}
