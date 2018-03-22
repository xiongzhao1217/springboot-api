import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.internal.types.JavaTypeResolverDefaultImpl;
import java.sql.Types;

/**
 * 覆盖数据库类型与java类型映射
 * @author xz
 */
public class MyJavaTypeResolverImpl extends JavaTypeResolverDefaultImpl {

    public MyJavaTypeResolverImpl() {
        super();
        // SMALLINT -> Integer
        super.typeMap.put(Types.SMALLINT, new JdbcTypeInformation("SMALLINT", new FullyQualifiedJavaType(Integer.class.getName())));
        // DECIMAL -> Double
        super.typeMap.put(Types.DECIMAL, new JdbcTypeInformation("DECIMAL", new FullyQualifiedJavaType(Double.class.getName())));
        // BIGINT -> Integer
        super.typeMap.put(Types.BIGINT, new JdbcTypeInformation("BIGINT", new FullyQualifiedJavaType(Integer.class.getName())));
    }
}