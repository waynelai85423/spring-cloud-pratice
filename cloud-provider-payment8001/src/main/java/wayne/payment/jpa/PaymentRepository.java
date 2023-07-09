package wayne.payment.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import wayne.api.entities.Payment;

@Transactional(rollbackFor = Exception.class)
@Repository
public interface PaymentRepository extends JpaRepository<Payment,Long>, JpaSpecificationExecutor<Payment> {

}
