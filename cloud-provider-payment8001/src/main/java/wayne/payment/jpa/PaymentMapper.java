package wayne.payment.jpa;

import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import wayne.api.dto.payment.Payment;
import wayne.api.dto.payment.PaymentRequest;
import wayne.api.entities.payment.PaymentEntity;

import static org.mapstruct.CollectionMappingStrategy.TARGET_IMMUTABLE;
import static org.mapstruct.NullValueMappingStrategy.RETURN_DEFAULT;

@Mapper(componentModel = "spring", collectionMappingStrategy = TARGET_IMMUTABLE, nullValueMappingStrategy = RETURN_DEFAULT, builder = @Builder)
public interface PaymentMapper {

    PaymentEntity toJpa(PaymentRequest paymentRequest);

    Payment fromJpa(PaymentEntity paymentEntity);

}
