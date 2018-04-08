package hwy.model;

import hwy.constant.JdbcJavaTypeCons;
import hwy.model.param.Column;
import hwy.util.StringUtil;

/**
 * @author huangweiyu
 * @version V1.0
 * @Title: 描述
 * @Description: 描述
 * @date 2018/4/8 16:18
 **/
public class MapperField {

    private String javaName;
    private String javaType;
    private String jdbcName;
    private String jdbcType;
    private Boolean key;

    public MapperField(Column column) {
        this.javaName = StringUtil.toHumpFormat(column.getColumnName());
        this.javaType = JdbcJavaTypeCons.get(column.getDataType().toLowerCase());
        this.jdbcName = column.getColumnName();
        this.jdbcType = column.getDataType().toUpperCase();
        final String keyFlag = "PRI";
        this.key = keyFlag.equals(column.getColumnKey());
    }

    public String getJavaName() {
        return javaName;
    }

    public void setJavaName(String javaName) {
        this.javaName = javaName;
    }

    public String getJavaType() {
        return javaType;
    }

    public void setJavaType(String javaType) {
        this.javaType = javaType;
    }

    public String getJdbcName() {
        return jdbcName;
    }

    public void setJdbcName(String jdbcName) {
        this.jdbcName = jdbcName;
    }

    public String getJdbcType() {
        return jdbcType;
    }

    public void setJdbcType(String jdbcType) {
        this.jdbcType = jdbcType;
    }

    public Boolean getKey() {
        return key;
    }

    public void setKey(Boolean key) {
        this.key = key;
    }
}
