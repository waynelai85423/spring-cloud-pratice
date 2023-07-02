package payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import utils.PersistenceConfig;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "payment.*")
@Import({PersistenceConfig.class})
@EntityScan("springcloud.entities.Payment") // 指定B服务实体类的包路径
public class PaymentMain8001 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8001.class, args);
    }
}