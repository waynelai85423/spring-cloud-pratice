package wayne.payment.service;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import wayne.api.dto.payment.Payment;
import wayne.api.dto.payment.PaymentRequest;


@Service
public interface PaymentService {
    Payment create(PaymentRequest paymentRequest);

     Payment getPaymentById(@Param("id") Long id);
}
