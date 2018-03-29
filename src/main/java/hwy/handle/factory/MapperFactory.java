package hwy.handle.factory;

import hwy.handle.AbstractFactory;
import hwy.model.Bean;
import hwy.model.param.ConfigParam;

public class MapperFactory extends AbstractFactory {

    private ConfigParam config;

    public MapperFactory(ConfigParam config) {
        this.config = config;
    }

    @Override
    public Bean getBean() {
        return null;
    }
}
