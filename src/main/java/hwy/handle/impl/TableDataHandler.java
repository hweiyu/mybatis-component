package hwy.handle.impl;

import hwy.exception.BusinessException;
import hwy.handle.Handler;
import hwy.model.param.Column;
import hwy.model.param.ConfigParam;
import hwy.util.DbUtil;

import java.util.List;

/**
 * @author huangweiyu
 * @date 2018/3/28 15:06
 **/
public class TableDataHandler implements Handler {

    private ConfigParam param;

    public TableDataHandler(ConfigParam param) {
        this.param = param;
    }

    @Override
    public void handle() {
        setTableColumns();
    }

    private void setTableColumns() {
        List<Column> columns = DbUtil.select(param.getConnect(), Column.class);
        if (null == columns || columns.isEmpty()) {
            throw new BusinessException("table is not exist");
        }
        param.setColumns(columns);
    }
}
