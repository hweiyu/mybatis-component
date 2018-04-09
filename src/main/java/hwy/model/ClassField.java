package hwy.model;

import hwy.constant.JdbcJavaTypeCons;
import hwy.model.param.Column;
import hwy.util.StringUtil;

/**
 * model文件对应的表信息
 * @author huangweiyu
 * @date 2018/3/29 14:00
 **/
public class ClassField {

    /**
     * 属性名
     */
    private String name;

    /**
     * 属性类型
     */
    private String type;

    /**
     * 属性注释信息
     */
    private String javaDoc;

    /**
     * 属性set方法
     */
    private String setMethod;

    /**
     * 属性get方法
     */
    private String getMethod;

    public ClassField(Column column) {
        this(column.getColumnName(), column.getDataType(), column.getColumnComment());
    }

    private ClassField(String name, String type, String javaDoc) {
        this.name = StringUtil.toHumpFormat(name);
        this.type = JdbcJavaTypeCons.get(type.toLowerCase());
        this.javaDoc = javaDoc;
        String methodName = StringUtil.toHumpFormatWithFirstUpper(name);
        this.getMethod = "get" + methodName;
        this.setMethod = "set" + methodName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSetMethod() {
        return setMethod;
    }

    public void setSetMethod(String setMethod) {
        this.setMethod = setMethod;
    }

    public String getGetMethod() {
        return getMethod;
    }

    public void setGetMethod(String getMethod) {
        this.getMethod = getMethod;
    }

    public String getJavaDoc() {
        return javaDoc;
    }

    public void setJavaDoc(String javaDoc) {
        this.javaDoc = javaDoc;
    }
}
