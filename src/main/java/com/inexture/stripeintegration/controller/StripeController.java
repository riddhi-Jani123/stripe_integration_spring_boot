package com.inexture.stripeintegration.controller;

import com.inexture.stripeintegration.service.impl.StripeService;
import com.stripe.exception.StripeException;
import com.stripe.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stripe")
public class StripeController {

    @Autowired
    private StripeService stripeService;

    @GetMapping("/account")
    public Account getStripeAccountDetails() throws StripeException {
        return stripeService.getStripeAccount();
    }
}
