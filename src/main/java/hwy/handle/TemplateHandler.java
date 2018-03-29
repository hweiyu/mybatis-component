package hwy.handle;

import hwy.model.Bean;

/**
 * @author huangweiyu
 * @date 2018/3/29 9:20
 **/
public interface TemplateHandler extends Handler {

    Bean getBean();

    String getOutFilePath();

    String getOutFileName();

    String getTemplateName();
}
