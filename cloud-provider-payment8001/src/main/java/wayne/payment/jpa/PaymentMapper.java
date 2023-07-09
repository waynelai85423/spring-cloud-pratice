package wayne.payment.jpa;

import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import wayne.api.entities.Payment;
import wayne.payment.http.PaymentRequest;

import static org.mapstruct.CollectionMappingStrategy.TARGET_IMMUTABLE;
import static org.mapstruct.NullValueMappingStrategy.RETURN_DEFAULT;

@Mapper(componentModel = "spring", collectionMappingStrategy = TARGET_IMMUTABLE, nullValueMappingStrategy = RETURN_DEFAULT, builder = @Builder)
public interface PaymentMapper {

    Payment toJpa(PaymentRequest paymentRequest);
}
