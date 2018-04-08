package hwy.model;

import java.util.List;

public class ModelBean extends Bean {

    private String packagePath;

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
