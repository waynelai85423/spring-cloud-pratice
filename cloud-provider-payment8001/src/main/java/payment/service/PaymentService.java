package payment.service;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import springcloud.entities.Payment;

@Service
public interface PaymentService {
    Payment create(Payment payment);

     Payment getPaymentById(@Param("id") Long id);
}
