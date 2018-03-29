package hwy.util;

import freemarker.template.Configuration;
import freemarker.template.Template;
import hwy.model.Bean;

import java.io.FileWriter;
import java.io.Writer;

public class TemplateUtil {

    private static Configuration config;

    static {
        config = new Configuration();
        config.setClassForTemplateLoading(TemplateUtil.class, "/template");
    }

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
