package hwy.handle.impl;

import freemarker.template.Configuration;
import hwy.handle.Handler;
import hwy.model.Column;
import hwy.model.ConfigParam;
import hwy.util.DbUtil;

import java.util.List;

/**
 * @author huangweiyu
 * @date 2018/3/28 15:06
 **/
public class AssembleBaseInfoHandler implements Handler {

    private ConfigParam param;

    public AssembleBaseInfoHandler(ConfigParam param) {
        this.param = param;
    }

    @Override
    public void handle() {
        setTableColumns();
        setFreemakerConfig();
    }

    private void setTableColumns() {
        List<Column> columns = DbUtil.select(param.getConnect(), Column.class);
        param.setColumns(columns);
    }

    private void setFreemakerConfig() {
        Configuration conf = new Configuration();
        conf.setClassForTemplateLoading(this.getClass(), "/template");
        param.setTemplateConfig(conf);
    }
}
