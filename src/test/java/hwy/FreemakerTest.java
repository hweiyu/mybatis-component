package hwy;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

/**
 * @author huangweiyu
 * @date 2018/3/27 15:58
 **/
public class FreemakerTest {

    public static void main(String[] args) throws IOException, TemplateException {

        Configuration conf = new Configuration();

        conf.setClassForTemplateLoading(FreemakerTest.class, "/template");

        Template template = conf.getTemplate("model.ftl");

        Writer out = new FileWriter(new File("d:\\test.xml"));

        //定义数据
        Map<String,Object> root = new HashMap<String,Object>();

        //定义数据
        root.put("val", "数据数据");

        template.process(root, out);
        out.flush();
        out.close();
    }

}
