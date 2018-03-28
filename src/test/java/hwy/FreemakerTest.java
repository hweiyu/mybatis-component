package hwy;

import hwy.util.TemplateUtil;

/**
 * @author huangweiyu
 * @date 2018/3/27 15:58
 **/
public class FreemakerTest {

    public static void main(String[] args) {

        TemplateUtil.outFile("test.ftl", "d:\\test.txt", new TestBean());

    }

}
