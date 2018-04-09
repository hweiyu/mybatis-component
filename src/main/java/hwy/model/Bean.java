package hwy.model;

/**
 * 用于标记可以由工厂创建的bean实体类
 */
public class Bean {

    /**
     * 表名
     */
    private String table;

    /**
     * 类名
     */
    private String className;

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
