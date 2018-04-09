package hwy.handle;

import hwy.model.Bean;

/**
 * bean工厂，抽象类
 */
public abstract class AbstractFactory {

    /**
     * 获取bean
     * @return
     */
    public abstract Bean getBean();
}
