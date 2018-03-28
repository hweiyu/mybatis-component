package hwy.model.param;

import java.util.ArrayList;
import java.util.List;

public class ConfigParam {

    private ConnectionParam connect;

    private String outPath;

    private String packagePath;

    private List<Column> columns;

    public ConfigParam(String outPath, String packagePath, ConnectionParam connect) {
        this.outPath = outPath;
        this.packagePath = packagePath;
        this.connect = connect;
        this.columns = new ArrayList<>();
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

    public List<Column> getColumns() {
        return columns;
    }

    public void setColumns(List<Column> columns) {
        this.columns = columns;
    }
}
