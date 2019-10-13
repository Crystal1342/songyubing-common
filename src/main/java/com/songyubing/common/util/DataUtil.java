package com.songyubing.common.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



public class DataUtil {
	/*返回给定日期的月初
	 * 给一个时间对象，返回该时间所在月的1日0时0分0秒。例如一个date对象的值是2019-05-18 11:37:22
	 * 则返回的结果为2019-05-01 00:00:00
	 * */
	public static Date getDateByInitMonth(Date src){
		//获取日历类
		Calendar c = Calendar.getInstance();
		
		//用传入的日期初始化日历类
		c.setTime(src);
		//改变日期,设置为月初 即 1号 的00:00:00
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		
		return c.getTime();
		
	}
	
	/*返回给定日期的月末
	 * 给一个时间对象，返回该时间所在的最后日23时59分59秒，
	 * */
	public static Date getDateByFullMonth(Date src){
		//思路: 让传入的月份+1 ,再把日 小时分秒都设置为0 .最后.让日期减去1秒
		//获取日历类
	   Calendar c = Calendar.getInstance();
	   //用传入的日期初始化日历类
	   c.setTime(src);
	   //让月份加1 
		c.add(Calendar.MONTH, 1);
		//调用月初的工具类返回,月初
		Date date = getDateByInitMonth(c.getTime());
		//用月初初始化日历类
		c.setTime(date);
		//让日期减去1秒
		c.add(Calendar.SECOND, -1);
		
		return c.getTime();
	}
	
	public static Date getDate(Date mindate,Date maxdate){
		//最小毫秒数
		long min = mindate.getTime();
		long max = maxdate.getTime();
		long x = (long)(Math.random()*(max-min+1))+min;
		return new Date(x);
		
	}
	
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(2018, 9,1);
		Date date = DataUtil.getDate(c.getTime(),new Date());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(date));
	}

}
