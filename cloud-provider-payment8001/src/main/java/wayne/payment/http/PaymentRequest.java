package wayne.payment.http;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;


@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class PaymentRequest implements Serializable {
    private String serial;

    private String status;
}
