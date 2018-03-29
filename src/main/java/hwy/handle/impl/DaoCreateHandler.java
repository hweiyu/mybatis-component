package hwy.handle.impl;

import hwy.constant.TemplateCons;
import hwy.handle.factory.DaoFactory;
import hwy.model.Bean;
import hwy.model.param.ConfigParam;
import hwy.util.StringUtil;

/**
 * @author huangweiyu
 * @date 2018/3/28 15:31
 **/
public class DaoCreateHandler extends BaseTemplateHandler {

    private ConfigParam param;

    public DaoCreateHandler(ConfigParam param) {
        this.param = param;
    }

    @Override
    public Bean getBean() {
        return new DaoFactory(this.param).getBean();
    }

    @Override
    public String getOutFilePath() {
        String path = this.param.getOutPath();
        String packagePath = this.param.getPackagePath();
        String outPath = path + "\\" + packagePath.replace(".", "\\");
        return String.format(TemplateCons.DAO_DIR_TEMPLATE, outPath.replace("\\\\", "\\"));
    }

    @Override
    public String getOutFileName() {
        String table = this.param.getConnect().getTable();
        return String.format(TemplateCons.DAO_FILE_TEMPLATE, StringUtil.toHumpFormatWithFirstUpper(table));
    }

    @Override
    public String getTemplateName() {
        return TemplateCons.DAO_FILE_NAME;
    }
}
