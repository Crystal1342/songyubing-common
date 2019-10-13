package com.songyubing.common.util;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class PersonTest {
	@Test
	public void testPerson(){
		for (int i = 0; i < 100; i++) {
			
		
		
		// 姓名
		String name = StringUtil.generateChineseName();
		//年龄
		int age = RandomUtil.random(1, 120);
		//介绍
		String about = StringUtil.randomChineseString(140);
		//注册日期
		Calendar c = Calendar.getInstance();
		c.set(2010, 1,1);
		Date created = DataUtil.getDate(c.getTime(),new Date());
		Person p = new Person(name,age,about,created);
		System.out.println(p);
		
		}
		
	}

}
