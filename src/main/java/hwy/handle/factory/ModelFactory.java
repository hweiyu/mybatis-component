package hwy.handle.factory;

import hwy.constant.TemplateCons;
import hwy.handle.AbstractFactory;
import hwy.model.Bean;
import hwy.model.ClassField;
import hwy.model.ModelBean;
import hwy.model.param.Column;
import hwy.model.param.ConfigParam;
import hwy.util.StringUtil;

import java.util.ArrayList;
import java.util.List;

public class ModelFactory extends AbstractFactory {

    private ConfigParam config;

    public ModelFactory(ConfigParam config) {
        this.config = config;
    }

    @Override
    public Bean getBean() {
        ModelBean bean = new ModelBean();
        String table = config.getConnect().getTable();
        bean.setTable(table);
        bean.setPackagePath(String.format(TemplateCons.MODEL_PACKAGE_TEMPLATE, config.getPackagePath()));
        bean.setClassName(StringUtil.toHumpFormatWithFirstUpper(table));
        bean.setFields(getFields());
        return bean;
    }

    private List<ClassField> getFields() {
        List<Column> columns = config.getColumns();
        List<ClassField> fields = new ArrayList<>(columns.size());
        for (Column column : columns) {
            fields.add(new ClassField(column));
        }
        return fields;
    }
}
