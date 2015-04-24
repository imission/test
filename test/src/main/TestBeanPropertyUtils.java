package main;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.junit.Test;

import domain.Check;

public class TestBeanPropertyUtils {
	
	
	@Test
	public void test1() {
		
		Check c = new Check();

		try {
			
			
			Map describe2 = BeanUtils.describe(c);
			
			Map describe = PropertyUtils.describe(c);
			
			
			
			
			System.out.println(describe2);
			System.out.println(describe);
			
			
			
			
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}

	}

}
