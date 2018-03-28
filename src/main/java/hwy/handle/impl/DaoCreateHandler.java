package hwy.handle.impl;

import hwy.handle.Handler;
import hwy.model.ConfigParam;

/**
 * @author huangweiyu
 * @date 2018/3/28 15:31
 **/
public class DaoCreateHandler implements Handler {

    private ConfigParam param;

    public DaoCreateHandler(ConfigParam param) {
        this.param = param;
    }

    @Override
    public void handle() {

    }
}
