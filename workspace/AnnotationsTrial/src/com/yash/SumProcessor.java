package com.yash;
import java.lang.reflect.Method;

public class SumProcessor {
	public static void processSum (Sum sum){
		Class = sum.getClass(); 
		try{
			Method method= clazz.getDeclaredMethod("add");
			AnnotationForSum sumannotation= method.getAnnotation(AnnotationForSum.class);
			int addvalues= sumannotation.value1()+sumannotation.value2(); 
			System.out.println(addvalues);
		}
		catch (Exception e){
		}
	}

}
