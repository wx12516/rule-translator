package com.asiainfo.rule.translator.utils;

public abstract class StringUtil {
    public static String getStringValue(String strValue) {
        char[] ch = strValue.toCharArray();
        StringBuilder sb = new StringBuilder(strValue.length());
        for (int i = 1; i < ch.length - 1; i++) {
            char c = ch[i];
            if (c == '\\') {
                char spec = ch[++i];
                char real = 0;
                switch (spec) {
                    case '\"':
                        real = '\"';
                        break;
                    case '\'':
                        real = '\'';
                        break;
                    case 't':
                        real = '\t';
                        break;
                    case 'r':
                        real = '\r';
                        break;
                    case 'n':
                        real = '\n';
                        break;
                    case 'b':
                        real = '\b';
                        break;
                    case 'f':
                        real = '\f';
                        break;
                    case '\\':
                        real = '\\';
                        break;
                    default:
                        // 16进制，8进制不支持，目前语法上可以通过，但未来取消
                        throw new RuntimeException("不支持的转义符号" + strValue);
                }
                sb.append(real);

            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

}
