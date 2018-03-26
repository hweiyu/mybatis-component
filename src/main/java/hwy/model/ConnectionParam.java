package hwy.model;

public class ConnectionParam {

    private String ip;

    private String port;

    private String database;

    private String username;

    private String password;

    private String table;

    private String driver;

    public ConnectionParam(String ip, String port, String database, String username, String password, String table) {
        this.ip = ip;
        this.port = port;
        this.database = database;
        this.username = username;
        this.password = password;
        this.table = table;
        this.driver = "com.mysql.jdbc.Driver";
    }

    public String getUrl() {
        //todo assemble database url
        return null;
    }

    public String getSql() {
        //todo assmeble database sql
        return null;
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
