package wayne.api.dto.payment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import wayne.utils.AuditingBase;

import java.io.Serializable;

import static lombok.AccessLevel.PRIVATE;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor(access = PRIVATE)
public class Payment extends AuditingBase<String> implements Serializable {
    private String serial;

    private String status;
}
