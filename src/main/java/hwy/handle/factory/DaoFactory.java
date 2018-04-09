package hwy.handle.factory;

import hwy.constant.TemplateCons;
import hwy.handle.AbstractFactory;
import hwy.model.Bean;
import hwy.model.DaoBean;
import hwy.model.param.ConfigParam;
import hwy.util.StringUtil;

/**
 * dao工厂
 */
public class DaoFactory extends AbstractFactory {

    private ConfigParam config;

    public DaoFactory(ConfigParam config) {
        this.config = config;
    }

    @Override
    public Bean getBean() {
        DaoBean bean = new DaoBean();
        String table = config.getConnect().getTable();
        bean.setTable(table);
        bean.setPackagePath(String.format(TemplateCons.DAO_PACKAGE_TEMPLATE, config.getPackagePath()));
        String className = StringUtil.toHumpFormatWithFirstUpper(table);
        bean.setClassName(className);
        bean.setModelParam(StringUtil.toHumpFormat(className));
        bean.setModelPath(String.format(TemplateCons.MODEL_PACKAGE_TEMPLATE, config.getPackagePath()));
        return bean;
    }
}
