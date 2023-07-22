package wayne.payment.http;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import wayne.api.dto.payment.Payment;
import wayne.api.dto.payment.PaymentRequest;
import wayne.api.utils.CommonResult;
import wayne.payment.service.PaymentService;

@Tag(name = "支付 REST API")
@Slf4j
@RestController
@RequestMapping("/payment")
public class PaymentContoller {
    @Autowired
    private PaymentService paymentService;

    @Operation(summary = "創建支付")
    @PostMapping(value = "/create")
    public CommonResult create(@RequestBody PaymentRequest paymentRequest) {
        Payment payment = paymentService.create(paymentRequest);
        log.info("payment create result ,{}", payment);

        if (payment != null) {
            return new CommonResult(200, "success: " , payment);
        }

        return new CommonResult(444, "failure: " , null);
    }

    @Operation(summary = "查詢支付")
    @GetMapping(value = "/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {

        Payment result = paymentService.getPaymentById(id);
        log.info("payment query result is:,{} ", result);

        if (result != null) {
            return new CommonResult(200, "success: " , result);
        }
        return new CommonResult(444, "failure: " , null);
    }
}
