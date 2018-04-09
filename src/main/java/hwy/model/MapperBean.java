package hwy.model;

import java.util.List;

/**
 * mapper文件数据实体
 */
public class MapperBean extends Bean {

    /**
     * mapper文件路径
     */
    private String mapperPath;

    /**
     * 模型路径
     */
    private String modelPath;

    /**
     * 数据集
     */
    private List<MapperField> fields;

    public String getMapperPath() {
        return mapperPath;
    }

    public void setMapperPath(String mapperPath) {
        this.mapperPath = mapperPath;
    }

    public String getModelPath() {
        return modelPath;
    }

    public void setModelPath(String modelPath) {
        this.modelPath = modelPath;
    }

    public List<MapperField> getFields() {
        return fields;
    }

    public void setFields(List<MapperField> fields) {
        this.fields = fields;
    }
}
