package wayne.payment;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@EnableJpaRepositories(basePackages = {"wayne.payment.*"})
//@Import({PersistenceConfig.class})
//@EntityScan("wayne.entities") // 指定B服务实体类的包路径
//@SpringBootApplication(scanBasePackages = {"wayne.entities","wayne.payment","wayne.utils"})
@OpenAPIDefinition(info = @Info(title = "Payment", version = "1.0.0", description = "支付項目"))
@SpringBootApplication(scanBasePackages = {"wayne.payment","wayne.api","wayne.utils"})
public class PaymentMain8001 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8001.class, args);
    }
}
