package org.vint.iblog.common.util;

/**
 * 公共工具类
 * Created by Vin on 14-5-20.
 */
public class CommonUtil {

    /**
     * 截取文章标题中不包含后缀的内容
     *
     * @param originTitle 原本的标题
     * @return 处理过的标题
     */
    public static String getNoMdTitle(String originTitle) {
        originTitle = originTitle.trim();
        int index = originTitle.lastIndexOf(".md");
        if (index == -1) {
            index = originTitle.lastIndexOf(".MD");
        }
        if (index != -1) {
            return originTitle.substring(0, index);
        }
        return originTitle;
    }
}
