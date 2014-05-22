package org.vint.iblog.common.util;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * 时间日期工具类
 * Created by Vin on 14-5-20.
 */
public class TimeUtil {

    /**
     * 获取日期格式，如2014-05-20
     * @param date  日期对象
     * @return  年月日字符串格式，中间用-分割
     */
    public static String getDate(Date date){
        Calendar calendar = Calendar.getInstance(Locale.CHINA);
        calendar.setTime(date);
        return calendar.get(Calendar.YEAR) + "-"
                + (calendar.get(Calendar.MONTH) + 1) + "-"
                + calendar.get(Calendar.DAY_OF_MONTH);
    }
}
