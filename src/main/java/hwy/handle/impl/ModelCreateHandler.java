package hwy.handle.impl;

import hwy.constant.TemplateCons;
import hwy.handle.factory.ModelFactory;
import hwy.model.Bean;
import hwy.model.param.ConfigParam;
import hwy.util.StringUtil;

/**
 * 创建model文件处理类
 * @author huangweiyu
 * @date 2018/3/28 15:22
 **/
public class ModelCreateHandler extends BaseTemplateHandler {

    private ConfigParam param;

    public ModelCreateHandler(ConfigParam param) {
        this.param = param;
    }

    @Override
    public Bean getBean() {
        return new ModelFactory(this.param).getBean();
    }

    @Override
    public String getOutFilePath() {
        String path = this.param.getOutPath();
        String packagePath = this.param.getPackagePath();
        String outPath = path + "\\" + packagePath.replace(".", "\\");
        return String.format(TemplateCons.MODEL_DIR_TEMPLATE, outPath.replace("\\\\", "\\"));
    }

    @Override
    public String getOutFileName() {
        String table = this.param.getConnect().getTable();
        return String.format(TemplateCons.MODEL_FILE_TEMPLATE, StringUtil.toHumpFormatWithFirstUpper(table));
    }

    @Override
    public String getTemplateName() {
        return TemplateCons.MODEL_FILE_NAME;
    }
}
