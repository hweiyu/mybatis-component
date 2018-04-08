package hwy.model;

import java.util.List;

public class MapperBean extends Bean {

    private String mapperPath;

    private String modelPath;

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
