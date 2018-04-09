package hwy.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * jdbc,java数据类型映射关系
 * @author huangweiyu
 * @date 2018/3/29 14:20
 **/
public class JdbcJavaTypeCons {

    private static Map<String, String> typeMap;

    static {
        typeMap = new HashMap<>();
        typeMap.put("bigint", "Long");
        typeMap.put("int", "Integer");
        typeMap.put("tinyint", "Integer");
        typeMap.put("smallint", "Integer");
        typeMap.put("mediumint", "Integer");
        typeMap.put("integer", "Integer");
        typeMap.put("float", "Float");
        typeMap.put("double", "Double");
        typeMap.put("decimal", "BigDecimal");
        typeMap.put("numeric", "BigDecimal");
        typeMap.put("char", "String");
        typeMap.put("varchar", "String");
        typeMap.put("blob", "byte[]");
        typeMap.put("longblob", "byte[]");
        typeMap.put("tinytext", "String");
        typeMap.put("text", "String");
        typeMap.put("date", "Date");
        typeMap.put("time", "Date");
        typeMap.put("year", "Date");
        typeMap.put("datetime", "Date");
        typeMap.put("timestamp", "Date");
    }

    public static String get(String key) {
        return typeMap.get(key);
    }
}
