package hwy.handle.impl;

import hwy.handle.Handler;
import hwy.model.ConfigParam;

/**
 * @author huangweiyu
 * @date 2018/3/28 15:31
 **/
public class MapperCreateHandler implements Handler {

    private ConfigParam param;

    public MapperCreateHandler(ConfigParam param) {
        this.param = param;
    }

    @Override
    public void handle() {

    }
}
