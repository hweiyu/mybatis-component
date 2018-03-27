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
                "127.0.0.1",
                "3306",
                "test",
                "root",
                "123456",
                "test_table"
        );
        DbUtil.select(param, Column.class);
    }
}
