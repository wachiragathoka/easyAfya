package com.easydirect.easyafya;

import static org.assertj.core.api.Assertions.assertThat;

import java.lang.reflect.Array;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.easydirect.easyafya.admin.controller.EasyAfyaProductsController;
import com.easydirect.easyafya.model.EasyAfyaCategory;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Easyafya1ApplicationTests {

	@Autowired
	public EasyAfyaProductsController easyAfyaProductsController;
	
	
	@Test
	public void contextLoads() throws Exception{
		assertThat(easyAfyaProductsController).isNotNull();
		
	}
	
	@Test
	public void testSaveEasyAfyaCategory() throws Exception{
		
		
		
		
		
		
	}
	
}