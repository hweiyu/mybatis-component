package hwy.constant;

import java.util.Arrays;
import java.util.List;

public class FrameCons {

    private FrameCons() {
        throw new AssertionError("not support to new Instance");
    }

    public static final String IP_LABEL = "database ip : ";
    public static final String IP_TEXT_NAME = "ip";
    public static final String IP_DEFAULT_VALUE = "127.0.0.1";

    public static final String PORT_LABEL = "database port : ";
    public static final String PORT_TEXT_NAME = "port";
    public static final String PORT_DEFAULT_VALUE = "3306";

    public static final String DATABASE_LABEL = "database : ";
    public static final String DATABASE_TEXT_NAME = "database";
    public static final String DATABASE_DEFAULT_VALUE = "demo";

    public static final String USERNAME_LABEL = "username : ";
    public static final String USERNAME_TEXT_NAME = "username";
    public static final String USERNAME_DEFAULT_VALUE = "root";

    public static final String PASSWORD_LABEL = "password : ";
    public static final String PASSWORD_TEXT_NAME = "password";
    public static final String PASSWORD_DEFAULT_VALUE = "123456";

    public static final String TABLE_LABEL = "database table : ";
    public static final String TABLE_TEXT_NAME = "table";
    public static final String TABLE__DEFAULT_VALUE = "demo_table";

    public static final String OUTPATH_LABEL = "file out path : ";
    public static final String OUTPATH_TEXT_NAME = "outpath";
    public static final String OUTPATH_DEFAULT_VALUE = "D:\\out";

    public static final String PACKAGEPATH_LABEL = "java package : ";
    public static final String PACKAGEPATH_TEXT_NAME = "packagepath";
    public static final String PACKAGEPATH_DEFAULT_VALUE = "com.hwy";

    public static final String CREATE_BUTTON_NAME = "create";

    public static final List<String> LABEL_TEXT_LIST = Arrays.asList(
            IP_LABEL,
            PORT_LABEL,
            DATABASE_LABEL,
            USERNAME_LABEL,
            PASSWORD_LABEL,
            TABLE_LABEL,
            OUTPATH_LABEL,
            PACKAGEPATH_LABEL
    );

    public static final List<String> TEXT_NAME_LIST = Arrays.asList(
            IP_TEXT_NAME,
            PORT_TEXT_NAME,
            DATABASE_TEXT_NAME,
            USERNAME_TEXT_NAME,
            PASSWORD_TEXT_NAME,
            TABLE_TEXT_NAME,
            OUTPATH_TEXT_NAME,
            PACKAGEPATH_TEXT_NAME
    );
}
