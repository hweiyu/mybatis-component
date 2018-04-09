package hwy.model.param;

import hwy.constant.JdbcCons;

/**
 * jdbc配置信息
 */
public class ConnectionParam {

    /**
     * ip
     */
    private String ip;

    /**
     * 端品
     */
    private String port;

    /**
     * 数据库
     */
    private String database;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 表名
     */
    private String table;

    /**
     * 数据库驱动
     */
    private String driver;

    public ConnectionParam(String ip, String port, String database, String username, String password, String table) {
        this.ip = ip;
        this.port = port;
        this.database = database;
        this.username = username;
        this.password = password;
        this.table = table;
        this.driver = JdbcCons.JDBC_DRIVER;
    }

    /**
     * 拼接的数据库链接url
     * @return
     */
    public String getUrl() {
        return String.format(JdbcCons.CONNECT_TEMPLATE, getIp(), getPort(), getDatabase());
    }

    /**
     * 拼接的数据库查表结构的sql
     */
    public String getSql() {
        return String.format(JdbcCons.SQL_TEMPLATE, getTable(), getDatabase());
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

}
