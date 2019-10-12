package com.songyubing.common.util;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Test;

public class StreamUtilTest {

	@Test
	public void testCloseAll() {
	}

	@Test
	public void testReadTextFileInputStream() throws FileNotFoundException {
		String string = StreamUtil.readTextFile(new FileInputStream(new File("D:/hello.txt")));
		System.out.println(string);
	}

	@Test
	public void testReadTextFileFile() {
		String string = StreamUtil.readTextFile(new File("D:/hello.txt"));
		System.out.println(string);
	}

}
