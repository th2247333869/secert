package com.mysecret.cn.common.util;


import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.FastDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author tianhao
 * @date 200606
 */
public class DateUtils {

    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static FastDateFormat timeFormat = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss");
    private static FastDateFormat dateFormat;
    private static FastDateFormat timeFormat2;
    private static FastDateFormat format;

    static {
        dateFormat = DateFormatUtils.ISO_DATE_FORMAT;
        timeFormat2 = FastDateFormat.getInstance("yyyyMMddHHmmss");
        format = FastDateFormat.getInstance("MM/dd/yyyy");
    }


    public static String date2String(Date date) {
        return dateFormat.format(date);
    }

    public static String time2String(Date date) {
        return timeFormat.format(date);
    }

    public static String time2String2(Date date) {
        return timeFormat2.format(date);
    }

    public static Date String2time(String date) {
        if (StringUtils.isBlank(date)) {
            return null;
        } else {
            try {
                return timeFormat.parse(date);
            } catch (ParseException var2) {
                var2.printStackTrace();
                return null;
            }
        }
    }

    public static Date getNow() {
        Date time = null;
        try {
            time = sdf.parse(sdf.format(new Date()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return time;
    }

    public static String getStrNow() {
        return date2Str(new Date());
    }

    public static Integer getIntTime(){
        Date date = new Date();
        long time = date.getTime();
        return (int)time;
    }

    public static Integer getNoFormatNow() {
        SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        long s = 0;
        try {
            s = sim.parse(date2Str(new Date())).getTime();
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return (int)s;
    }

    public static Date String2date(String date) {
        if (StringUtils.isBlank(date)) {
            return null;
        } else {
            try {
                return dateFormat.parse(date);
            } catch (ParseException var2) {
                var2.printStackTrace();
                return null;
            }
        }
    }

    public static Date Str2date(String date) {
        if (StringUtils.isBlank(date)) {
            return null;
        } else {
            try {
                return format.parse(date);
            } catch (ParseException var2) {
                var2.printStackTrace();
                return null;
            }
        }
    }

    public static String date2Str(Date date) {
        return format.format(date);
    }

    public static Date getTodayStartTime() {
        Calendar cal = Calendar.getInstance();
        cal.set(11, 0);
        cal.set(13, 0);
        cal.set(12, 0);
        cal.set(14, 0);
        return cal.getTime();
    }

    public static Date getTodayEndTime() {
        Calendar cal = Calendar.getInstance();
        cal.set(11, 24);
        cal.set(13, 0);
        cal.set(12, 0);
        cal.set(14, 0);
        return cal.getTime();
    }

    public static Date getDateStartTime(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(11, 0);
        cal.set(12, 0);
        cal.set(13, 0);
        return cal.getTime();
    }

    public static Date getDateEndTime(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(11, 23);
        cal.set(12, 59);
        cal.set(13, 59);
        return cal.getTime();
    }

    public static Date getWeekStartTime() {
        Calendar cal = Calendar.getInstance();
        cal.set(cal.get(1), cal.get(2), cal.get(5), 0, 0, 0);
        cal.set(7, 2);
        return cal.getTime();
    }

    public static Date getWeekEndTime() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(getWeekStartTime());
        cal.add(7, 7);
        return cal.getTime();
    }

    public static Date getMonthStartTime() {
        Calendar cal = Calendar.getInstance();
        cal.set(cal.get(1), cal.get(2), cal.get(5), 0, 0, 0);
        cal.set(5, cal.getActualMinimum(5));
        return cal.getTime();
    }

    public static Date getMonthEndTime() {
        Calendar cal = Calendar.getInstance();
        cal.set(cal.get(1), cal.get(2), cal.get(5), 0, 0, 0);
        cal.set(5, cal.getActualMaximum(5));
        cal.set(11, 24);
        return cal.getTime();
    }


}