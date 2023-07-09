package wayne.payment.service;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import wayne.payment.http.PaymentRequest;
import wayne.api.entities.Payment;

@Service
public interface PaymentService {
    Payment create(PaymentRequest paymentRequest);

     Payment getPaymentById(@Param("id") Long id);
}
