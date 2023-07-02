package utils;

import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;
import org.springframework.boot.orm.jpa.hibernate.SpringPhysicalNamingStrategy;
import org.springframework.stereotype.Component;

@Component
public class UpperCasePhysicalNamingStrategy extends SpringPhysicalNamingStrategy {
    @Override
    public Identifier toPhysicalTableName(Identifier name, JdbcEnvironment context) {
        if (name != null) {
            String tableName = name.getText();
            String upperCaseTableName = tableName.toUpperCase();
            return Identifier.toIdentifier(upperCaseTableName);
        }
        return super.toPhysicalTableName(name, context);
    }
}
