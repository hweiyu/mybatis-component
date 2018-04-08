package hwy.handle.factory;

import hwy.constant.TemplateCons;
import hwy.handle.AbstractFactory;
import hwy.model.Bean;
import hwy.model.MapperBean;
import hwy.model.MapperField;
import hwy.model.param.Column;
import hwy.model.param.ConfigParam;
import hwy.util.StringUtil;

import java.util.ArrayList;
import java.util.List;

public class MapperFactory extends AbstractFactory {

    private ConfigParam config;

    public MapperFactory(ConfigParam config) {
        this.config = config;
    }

    @Override
    public Bean getBean() {
        MapperBean bean = new MapperBean();
        String table = config.getConnect().getTable();
        bean.setTable(table);
        bean.setMapperPath(String.format(TemplateCons.MAPPER_PACKAGE_TEMPLATE, config.getPackagePath()));
        bean.setClassName(StringUtil.toHumpFormatWithFirstUpper(table));
        bean.setModelPath(String.format(TemplateCons.MODEL_PACKAGE_TEMPLATE, config.getPackagePath()));
        bean.setFields(getFields());
        return bean;
    }

    private List<MapperField> getFields() {
        List<Column> columns = config.getColumns();
        List<MapperField> fields = new ArrayList<>(columns.size());
        for (Column column : columns) {
            fields.add(new MapperField(column));
        }
        return fields;
    }
}
