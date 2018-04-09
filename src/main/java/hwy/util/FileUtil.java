package hwy.util;

import java.io.File;

/**
 * 文件工具类
 * @author huangweiyu
 * @date 2018/3/29 10:00
 **/
public class FileUtil {

    /**
     * 根据路径生成文件夹
     * @param path 路径
     */
    public static void createDir(String path) {
        File file = new File(path);
        if (!file.exists()) {
            file.mkdirs();
        }
    }
}
