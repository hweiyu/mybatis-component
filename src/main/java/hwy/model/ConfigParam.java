package hwy.model;

public class ConfigParam {

    private ConnectionParam connect;

    private String outPath;

    private String packagePath;

    public ConfigParam(String outPath, String packagePath, ConnectionParam connect) {
        this.outPath = outPath;
        this.packagePath = packagePath;
        this.connect = connect;
    }

    public ConnectionParam getConnect() {
        return connect;
    }

    public void setConnect(ConnectionParam connect) {
        this.connect = connect;
    }

    public String getOutPath() {
        return outPath;
    }

    public void setOutPath(String outPath) {
        this.outPath = outPath;
    }

    public String getPackagePath() {
        return packagePath;
    }

    public void setPackagePath(String packagePath) {
        this.packagePath = packagePath;
    }
}
