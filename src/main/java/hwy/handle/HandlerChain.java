package hwy.handle;

import hwy.handle.impl.DaoCreateHandler;
import hwy.handle.impl.MapperCreateHandler;
import hwy.handle.impl.TableDataHandler;
import hwy.handle.impl.ModelCreateHandler;
import hwy.model.param.ConfigParam;

import java.util.LinkedList;
import java.util.List;

/**
 * @author huangweiyu
 * @date 2018/3/28 15:09
 **/
public class HandlerChain {

    /**
     * 处理类列表
     */
    private List<Handler> handlers = new LinkedList<Handler>();

    /**
     * 传入参数
     */
    private ConfigParam param;

    public HandlerChain(ConfigParam param) {
        this.param = param;
    }

    public HandlerChain addHandler(Handler handler) {
        handlers.add(handler);
        return this;
    }

    public void doHandlers() {
        for (Handler handler : handlers) {
            handler.handle();
        }
    }

    public void result() {
        this.addHandler(new TableDataHandler(param))
                .addHandler(new ModelCreateHandler(param))
                .addHandler(new MapperCreateHandler(param))
                .addHandler(new DaoCreateHandler(param))
                .doHandlers();
    }
}
