package hwy.util;

import java.io.File;

/**
 * @author huangweiyu
 * @date 2018/3/29 10:00
 **/
public class FileUtil {

    public static void createDir(String path) {
        File file = new File(path);
        if (!file.exists()) {
            file.mkdirs();
        }
    }
}
