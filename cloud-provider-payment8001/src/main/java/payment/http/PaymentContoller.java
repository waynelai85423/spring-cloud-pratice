package payment.http;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import payment.service.PaymentService;
import springcloud.entities.CommonResult;
import springcloud.entities.Payment;
@Slf4j
@RestController
@RequestMapping("/payment")
public class PaymentContoller {
    @Autowired
    private PaymentService paymentService;

    @PostMapping(value = "/create")
    public CommonResult create(Payment payment) {
        payment = paymentService.create(payment);
        log.info("payment create result ,{}", payment);

        if (payment != null) {
            return new CommonResult(200, "success: " , payment);
        }

        return new CommonResult(444, "failure: " , null);
    }

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
