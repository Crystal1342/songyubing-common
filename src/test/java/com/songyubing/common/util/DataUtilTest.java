package com.songyubing.common.util;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DataUtilTest {

	@Test//月初
	public void testGetDateByInitMonth() {
		Calendar c = Calendar.getInstance();
		c.set(2019, 02, 27, 15, 35, 55);
		
		
		
		Date date = DataUtil.getDateByInitMonth(c.getTime());
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(date));
	}

	@Test//月末
	public void testGetDateByFullMonth() {
		Calendar c = Calendar.getInstance();
		c.set(2019, 12, 23, 14, 35, 55);
		
		Date date = DataUtil.getDateByFullMonth(c.getTime());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(date));
	}
	@Test
	public void testSQL(){
		//月初
		Date initMonth = DataUtil.getDateByInitMonth(new Date());
		//月末
		Date fullMonth = DataUtil.getDateByFullMonth(new Date());
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String sql = "select * from t_order where create_time>='{1}' and create_time<='{2}'";
		//替换后的结果
		String sql2 = sql.replace("{1}",df.format(initMonth)).replace("{2}", df.format(fullMonth));
	
		System.out.println(sql2);
	}

	
	
}
