package wayne.payment.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import wayne.api.dto.payment.Payment;
import wayne.api.dto.payment.PaymentRequest;
import wayne.payment.jpa.PaymentMapper;
import wayne.payment.jpa.PaymentRepository;
import wayne.payment.service.PaymentService;
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

        return paymentMapper.fromJpa(paymentRepository.save(paymentMapper.toJpa(paymentRequest)));
    }

    @Override
    public Payment getPaymentById(Long id) {

        return paymentMapper.fromJpa(paymentRepository.findById(id).orElse(null));
    };
}
