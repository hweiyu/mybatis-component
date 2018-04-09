package hwy.util;

import hwy.model.param.ConnectionParam;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 数据库工具类
 */
public class DbUtil {

    public static <T> List<T> select(ConnectionParam config, Class<T> cls) {
        List<T> list = new ArrayList<T>();
        try (Connection con = getConnection(config);
             PreparedStatement pstmt = con.prepareStatement(config.getSql());
             ResultSet resultSet = pstmt.executeQuery()) {
            list.addAll(getData(resultSet, cls));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    private static Connection getConnection(ConnectionParam config) throws SQLException {
        try {
            Class.forName(config.getDriver());
            Connection con = DriverManager.getConnection(
                    config.getUrl(), config.getUsername(), config.getPassword());
            return con;
        } catch (Exception e) {
            e.printStackTrace();
        }
        throw new SQLException("database connect error!");
    }

    private static <T> List<T> getData(ResultSet rs, Class<T> cls)
            throws SQLException, IllegalAccessException,
            InstantiationException, InvocationTargetException {
        List<T> result = new ArrayList<>();
        Method[] methods = cls.getDeclaredMethods();
        ResultSetMetaData metaData = rs.getMetaData();
        int colLen = metaData.getColumnCount();
        while (rs.next()) {
            T curObj = cls.newInstance();
            for (int i = 0; i < colLen; i++) {
                String colsName = metaData.getColumnName(i + 1);
                Object colsValue = rs.getObject(colsName);
                for (Method method : methods) {
                    if (method.getName().startsWith("get")) {
                        continue;
                    }
                    if (method.getName().equalsIgnoreCase("set" + colsName.replaceAll("_", ""))) {
                        method.invoke(curObj, colsValue);
                    }
                }
            }
            result.add(curObj);
        }
        return result;
    }
}