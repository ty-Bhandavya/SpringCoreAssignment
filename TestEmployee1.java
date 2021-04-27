package com.tyss.springCore.SpringCoreAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.springCore.SpringCoreAnnotationBean.Employee;

public class TestEmployee1 
{
	public static void main(String[] args) {
		
	

	ClassPathXmlApplicationContext ctx = null;
	ctx = new ClassPathXmlApplicationContext("com.tyss.springCore.SpringCoreAnnotationBean.springconfig.xml");
	
	Employee emp =  (Employee) ctx.getBean("employee");
	
	System.out.println(emp);
	
	if (ctx != null) {
		ctx.close();
	}
}

}
