package com.cs.means;

import java.util.Calendar;
import java.util.Date;

/**
 * 获得当前日期时间的类GetTime
 * @author Miracle_Wong
 *
 */
public class GetTime {
	public GetTime() {
		// TODO Auto-generated constructor stub
	}
	public static String getTime() {
		Date date1 = new Date();					//当前时间
	    Calendar objcalendar;
	    String time = "";
	    objcalendar = Calendar.getInstance();		//初始化
	    int year = objcalendar.get(Calendar.YEAR);	//获取年份
	    int Month = objcalendar.get(Calendar.MONTH);	//获取月份
	    Month += 1;		//为月份加1，因为1月的值为0
	    Integer Month1 = new Integer(Month);
	    String Monthtos;
	    if (Month < 10) {		//如果月份小于10，在前面加0，保证两位
	        Monthtos = "0" + Month1.toString();
	    } else {
	        Monthtos = Month1.toString();
	    }
	    int Date = objcalendar.get(Calendar.DATE);
	    Integer Date1 = new Integer(Date);
	    String Datetos;
	    if (Date < 10) {	//日小于10，前面加0
	        Datetos = "0" + Date1.toString();
	    } else {
	        Datetos = Date1.toString();
	    }
	    String time1 = date1.toString().substring(11, 19);	//获取当前时间
	    time =year + "-" + Monthtos + "-" + Datetos + " " + time1;
	    return time;
	}
}
