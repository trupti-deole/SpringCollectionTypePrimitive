package com.test.dependency;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ap=new ClassPathXmlApplicationContext("bean.xml");
		Student s=ap.getBean(Student.class); //there is only one bean so no need to write bean id
		System.out.println(s.getRollno());
		System.out.println(s.getName());
		System.out.println("Books are:");
		List<String> li=s.getBooklist();
		for(String book:li)
		{
		   System.out.println(book);	
		}
		System.out.println("Phne No");
		Set<Long> set=s.getPhno();
		for(Long phno:set)
		{
			System.out.println(phno);
		}
		System.out.println("Courses available");
		Map<String,Double> map=s.getCourses();
		Set<String> keys = map.keySet();
		for(String key:keys)
		{
			Double val = map.get(key);//it returns value for given keys
			System.out.println(key + " "+val);
		}
		
		
		

	}

}
