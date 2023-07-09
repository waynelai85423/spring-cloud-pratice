package wayne.payment.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import wayne.payment.http.PaymentRequest;
import wayne.payment.jpa.PaymentMapper;
import wayne.payment.jpa.PaymentRepository;
import wayne.payment.service.PaymentService;
import wayne.api.entities.Payment;
@Service
@Validated
@Transactional(rollbackFor = Exception.class)
@Slf4j
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository paymentRepository;

    private final PaymentMapper paymentMapper;

    @Override
    public Payment create(PaymentRequest paymentRequest) {
        return paymentRepository.save(paymentMapper.toJpa(paymentRequest));
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentRepository.findById(id).orElse(null);
    };
}
