package hwy.handle.factory;

import hwy.handle.AbstractFactory;
import hwy.model.Bean;
import hwy.model.param.ConfigParam;

public class DaoFactory extends AbstractFactory {

    private ConfigParam config;

    public DaoFactory(ConfigParam config) {
        this.config = config;
    }

    @Override
    public Bean getBean() {
        return null;
    }
}
