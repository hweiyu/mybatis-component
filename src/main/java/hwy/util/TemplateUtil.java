package hwy.util;

import freemarker.template.Configuration;
import freemarker.template.Template;
import hwy.model.Bean;

import java.io.FileWriter;
import java.io.Writer;

/**
 * freemaker工具类
 */
public class TemplateUtil {

    private static Configuration config;

    static {
        config = new Configuration();
        config.setClassForTemplateLoading(TemplateUtil.class, "/template");
    }

    /**
     * 根据模板和数据，生成文件
     * @param templateName 模板名
     * @param outPath 导出路径
     * @param data 数据
     */
    public static void outFile(String templateName, String outPath, Bean data) {
        try (Writer out = new FileWriter(outPath)) {
            Template template = config.getTemplate(templateName);
            if (null != template) {
                template.process(data, out);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
