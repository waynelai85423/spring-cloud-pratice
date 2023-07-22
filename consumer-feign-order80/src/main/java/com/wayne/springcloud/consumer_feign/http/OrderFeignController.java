package com.wayne.springcloud.consumer_feign.http;


import com.wayne.springcloud.consumer_feign.service.PaymentFeignService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import wayne.api.dto.payment.Payment;
import wayne.api.dto.payment.PaymentRequest;
import wayne.api.utils.CommonResult;

@Tag(name = "消費者 API")
@Slf4j
@RestController
@RequestMapping("/consumer")
public class OrderFeignController {
    @Autowired
    private PaymentFeignService paymentFeignService;

    @Operation(summary = "查詢支付")
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        return paymentFeignService.getPaymentById(id);
    }

    @Operation(summary = "創建支付")
    @PostMapping ("/payment/feign/create")
    public CommonResult<Payment> paymentFeignCreate(@RequestBody PaymentRequest paymentRequest) {
        return paymentFeignService.create(paymentRequest);
    }

    @GetMapping("/payment/feign/timeout")
    public String paymentFeignTimeout() {
        return paymentFeignService.paymentFeignTimeout();
    }
}
