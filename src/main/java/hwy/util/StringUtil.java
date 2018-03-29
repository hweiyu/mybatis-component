package hwy.util;

public class StringUtil {

    public static final String EMPTY_STR = "";

    public static boolean isEmpty(String str) {
        return null == str || EMPTY_STR.equals(str);
    }

    public static String toHumpFormat(String str) {
        String temp = toHumpFormatWithFirstUpper(str);
        return temp.substring(0, 1).toLowerCase() + temp.substring(1, temp.length());
    }

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
