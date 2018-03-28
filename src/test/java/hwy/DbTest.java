package hwy;

import hwy.model.Column;
import hwy.model.ConnectionParam;
import hwy.util.DbUtil;

/**
 * @author huangweiyu
 * @date 2018/3/27 16:03
 **/
public class DbTest {

    public static void main(String[] args) {
        ConnectionParam param = new ConnectionParam(
                "192.168.1.101",
                "3306",
                "sinter_demo",
                "root",
                "123456",
                "t_shop"
        );
        DbUtil.select(param, Column.class);
    }
}
