package wayne.utils;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.Min;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Steven Wang <steven.wang@softleader.com.tw>
 * @since 3.0.0
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public abstract class AuditingBase<U extends Serializable> extends ExtensionFields implements Serializable {

    /**
     * id
     */
    @Min(1)
    protected Long id;

    /**
     * 建立時間
     */

    protected LocalDateTime createdDate;

    /**
     * 建立人員
     */
    protected U createdBy;

    /**
     * 最後修改時間
     */
    protected LocalDateTime lastModifiedDate;

    /**
     * 最後修改人員
     */
    protected U lastModifiedBy;
}

