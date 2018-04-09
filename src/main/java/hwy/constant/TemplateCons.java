package hwy.constant;

/**
 * 模板需要用的常量
 */
public class TemplateCons {

    private TemplateCons() {
        throw new AssertionError("not support to new Instance");
    }

    public static final String MODEL_FILE_NAME = "model.ftl";

    public static final String DAO_FILE_NAME = "dao.ftl";

    public static final String MAPPER_FILE_NAME = "mapper.ftl";

    public static final String MODEL_FILE_TEMPLATE = "%s.java";

    public static final String DAO_FILE_TEMPLATE = "%sMapper.java";

    public static final String MAPPER_FILE_TEMPLATE = "%sMapper.xml";

    public static final String MODEL_DIR_TEMPLATE = "%s\\model";

    public static final String DAO_DIR_TEMPLATE = "%s\\dao";

    public static final String MAPPER_DIR_TEMPLATE = "%s\\mapper";

    public static final String MODEL_PACKAGE_TEMPLATE = "%s.model";

    public static final String DAO_PACKAGE_TEMPLATE = "%s.dao";

    public static final String MAPPER_PACKAGE_TEMPLATE = "%s.mapper";
}
