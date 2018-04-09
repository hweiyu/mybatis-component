package hwy.model;

import java.util.List;

/**
 * model文件数据实体
 */
public class ModelBean extends Bean {

    /**
     * 包路径
     */
    private String packagePath;

    /**
     * 类属性集合
     */
    private List<ClassField> fields;

    public String getPackagePath() {
        return packagePath;
    }

    public void setPackagePath(String packagePath) {
        this.packagePath = packagePath;
    }

    public List<ClassField> getFields() {
        return fields;
    }

    public void setFields(List<ClassField> fields) {
        this.fields = fields;
    }
}
