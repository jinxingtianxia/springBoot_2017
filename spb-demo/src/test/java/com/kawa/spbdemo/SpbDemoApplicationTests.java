package com.kawa.spbdemo;

import com.kawa.pojo.Brian;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpbDemoApplicationTests {

	@Autowired
	Brian brian;

	@Test
	public void contextLoads() {
		System.out.println(brian);
	}

}
