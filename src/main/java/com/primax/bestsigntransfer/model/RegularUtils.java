package com.primax.bestsigntransfer.model;

import com.github.houbb.opencc4j.util.ZhConverterUtil;


/**
 * 正则匹配数字/下划线/中文
 *
 * @author stan
 * @date 2022-05-06
 */
public class RegularUtils {

    /**
     * 正则匹配数字/下划线/中文
     *
     * @return
     */
    public static String regularFormat(String content) {

//        StringBuffer result = new StringBuffer(content);
        /*StringBuffer result = new StringBuffer("");
        Pattern patter = Pattern.compile("([0-9]+)|([_]+)|([\\u4E00-\\u9FA5]+)|([a-z]+)|([A-Z]+)|([-]+)|([,]+)|([。]+)");
        if (content.contains("_")|| content.contains("[")||content.contains("]")) {
            Matcher matcher = patter.matcher(content);
            while (matcher.find()) {
                //匹配内容，文本放到matcher.group(); 中
                result.append(matcher.group(0));
            }
            return String.valueOf(result);
        }*/
        content = ZhConverterUtil.toTraditional(content);
        if (content.contains("[")||content.contains("]")||content.contains("\"")) {
            content = content.replace("[","").replace("]","").replace("\"","");
            String[] s = content.split("_");
            content = s[0];
        }
        return content;
    }
}
