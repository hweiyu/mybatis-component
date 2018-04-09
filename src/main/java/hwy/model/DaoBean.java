package hwy.model;

/**
 * dao文件数据实体
 */
public class DaoBean extends Bean {

    /**
     * java包路径
     */
    private String packagePath;

    /**
     * 参数
     */
    private String modelParam;

    /**
     * 模型路径
     */
    private String modelPath;

    public String getPackagePath() {
        return packagePath;
    }

    public void setPackagePath(String packagePath) {
        this.packagePath = packagePath;
    }

    public String getModelParam() {
        return modelParam;
    }

    public void setModelParam(String modelParam) {
        this.modelParam = modelParam;
    }

    public String getModelPath() {
        return modelPath;
    }

    public void setModelPath(String modelPath) {
        this.modelPath = modelPath;
    }
}
