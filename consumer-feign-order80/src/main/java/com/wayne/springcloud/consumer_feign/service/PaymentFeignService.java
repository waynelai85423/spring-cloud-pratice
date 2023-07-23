package com.wayne.springcloud.consumer_feign.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import wayne.api.dto.payment.Payment;
import wayne.api.dto.payment.PaymentRequest;
import wayne.api.utils.CommonResult;

@Component
@FeignClient(name = "payment",url = "${wayne.payment.http.url:localhost:8001}",path = "/payment")
public interface PaymentFeignService {

    @GetMapping(value = "/get/{id}")
     CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @PostMapping(value = "/create")
     CommonResult<Payment> create(@RequestBody PaymentRequest paymentRequest);

    @GetMapping("/feign/timeout")
     String paymentFeignTimeout();
}