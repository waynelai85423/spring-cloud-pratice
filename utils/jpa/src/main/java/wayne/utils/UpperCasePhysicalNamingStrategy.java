package wayne.utils;

import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;
import org.springframework.boot.orm.jpa.hibernate.SpringPhysicalNamingStrategy;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class UpperCasePhysicalNamingStrategy extends SpringPhysicalNamingStrategy {
    @Override
    protected Identifier getIdentifier(String name, boolean quoted, JdbcEnvironment jdbcEnvironment) {
        String identifier = name.toLowerCase(Locale.ROOT).replace("_entity", "");
        return new Identifier(identifier.toUpperCase(), quoted);
    }
}
