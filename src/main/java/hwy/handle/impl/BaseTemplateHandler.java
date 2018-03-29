package hwy.handle.impl;

import hwy.handle.TemplateHandler;
import hwy.model.Bean;
import hwy.util.FileUtil;
import hwy.util.TemplateUtil;

/**
 * @author huangweiyu
 * @date 2018/3/29 9:29
 **/
public class BaseTemplateHandler implements TemplateHandler {

    @Override
    public void handle() {
        Bean data = getBean();
        String outPath = getOutFilePath();
        String outFileName = getOutFileName();
        String tempName = getTemplateName();
        String filePath = outPath + "\\" + outFileName;
        FileUtil.createDir(outPath);
        TemplateUtil.outFile(tempName, filePath, data);
    }

    @Override
    public Bean getBean() {
        throw new NullPointerException("not support to create bean");
    }

    @Override
    public String getOutFilePath() {
        throw new NullPointerException("not support to create out path");
    }

    @Override
    public String getOutFileName() {
        throw new NullPointerException("not support to create out file name");
    }

    @Override
    public String getTemplateName() {
        throw new NullPointerException("not support to create template");
    }
}
