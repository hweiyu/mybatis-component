package hwy.handle.impl;

import hwy.constant.TemplateCons;
import hwy.handle.Handler;
import hwy.handle.factory.ModelFactory;
import hwy.model.Bean;
import hwy.model.param.ConfigParam;
import hwy.util.TemplateUtil;

/**
 * @author huangweiyu
 * @date 2018/3/28 15:22
 **/
public class ModelCreateHandler implements Handler {

    private ConfigParam param;

    public ModelCreateHandler(ConfigParam param) {
        this.param = param;
    }

    @Override
    public void handle() {
        Bean data = new ModelFactory().getBean();
        TemplateUtil.outFile(TemplateCons.MODEL_FILE_NAME, "D:\\test.txt", data);
    }
}
