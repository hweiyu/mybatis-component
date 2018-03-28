package hwy.handle.impl;

import hwy.handle.Handler;
import hwy.model.ConfigParam;

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

    }
}
