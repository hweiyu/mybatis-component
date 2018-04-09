package hwy.util;

/**
 * 字符串工具类
 */
public class StringUtil {

    public static final String EMPTY_STR = "";

    /**
     * 是否为空
     * @param str 字符串
     * @return
     */
    public static boolean isEmpty(String str) {
        return null == str || EMPTY_STR.equals(str);
    }

    /**
     * 字符串，驼锋格式
     * @param str 字符串
     * @return
     */
    public static String toHumpFormat(String str) {
        String temp = toHumpFormatWithFirstUpper(str);
        return temp.substring(0, 1).toLowerCase() + temp.substring(1, temp.length());
    }

    /**
     * 字符串，驼锋格式，首字母大写
     * @param str 字符串
     * @return
     */
    public static String toHumpFormatWithFirstUpper(String str) {
        if (isEmpty(str)) {
            return EMPTY_STR;
        }
        String[] strArr = str.split("_");
        StringBuilder buf = new StringBuilder(str.length());
        for (String s : strArr) {
            buf.append(s.substring(0, 1).toUpperCase()).append(s.substring(1, s.length()));
        }
        return buf.toString();
    }
}
