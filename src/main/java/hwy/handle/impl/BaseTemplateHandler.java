package hwy.handle.impl;

import hwy.handle.TemplateHandler;
import hwy.model.Bean;
import hwy.util.FileUtil;
import hwy.util.TemplateUtil;

/**
 * 通用模板实现类
 * @author huangweiyu
 * @date 2018/3/29 9:29
 **/
public class BaseTemplateHandler implements TemplateHandler {

    @Override
    public void handle() {
        //获取bean
        Bean data = getBean();
        //获取文件导出路径
        String outPath = getOutFilePath();
        //获取文件名
        String outFileName = getOutFileName();
        //获取模板名
        String tempName = getTemplateName();
        String filePath = outPath + "\\" + outFileName;
        //生成文件目录
        FileUtil.createDir(outPath);
        //根据模板和数据，生成文件
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
