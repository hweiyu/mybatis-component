package hwy.constant;

/**
 * @author huangweiyu
 * @date 2018/3/28 14:24
 **/
public class JdbcCons {

    private JdbcCons() {
        throw new AssertionError("not support to new Instance");
    }

    public static final String SQL_TEMPLATE =
            "SELECT COLUMN_NAME, DATA_TYPE, COLUMN_COMMENT, COLUMN_KEY FROM INFORMATION_SCHEMA.COLUMNS " +
                    "WHERE TABLE_NAME = '%s' AND TABLE_SCHEMA = '%s' " +
                    "ORDER BY ORDINAL_POSITION;";

    public static final String CONNECT_TEMPLATE = "jdbc:mysql://%s:%s/%s" +
            "?zeroDateTimeBehavior=convertToNull&useUnicode=true&characterEncoding=utf-8";

    public static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
}
