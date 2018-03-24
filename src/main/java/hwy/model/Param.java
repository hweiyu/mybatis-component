package hwy.model;

public class Param {

    private String url;

    private String username;

    private String password;

    private String table;

    private String outPath;

    public Param(String url, String username, String password, String table, String outPath) {
        this.url = url;
        this.username = username;
        this.password = password;
        this.table = table;
        this.outPath = outPath;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public String getOutPath() {
        return outPath;
    }

    public void setOutPath(String outPath) {
        this.outPath = outPath;
    }
}
