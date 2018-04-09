package hwy.model.param;

import java.util.ArrayList;
import java.util.List;

/**
 * 全局配置信息
 */
public class ConfigParam {

    /**
     * jdbc配置信息
     */
    private ConnectionParam connect;

    /**
     * 生成的文件导出路径
     */
    private String outPath;

    /**
     * java类包路径
     */
    private String packagePath;

    /**
     * 数据库表字段集合
     */
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
