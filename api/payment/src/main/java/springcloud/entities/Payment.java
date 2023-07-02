package springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import utils.AbstractEntity;

import javax.persistence.Entity;
import java.io.Serializable;

;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment extends AbstractEntity<String> implements Serializable {

    private String serial;

    private String status;
}
