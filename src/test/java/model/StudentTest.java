package model;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {
	
	
	SessionFactory sessionFactory = null;
	Session session=null;
	Transaction transaction = null;
	@Before
	public void init(){
		//创建一个SessionFactory工厂类；通过它建立一个与数据库链接会话
		
		//SessionFactory又需要另一个类 配置类，里面封装了链接数据库的配置信息
		Configuration configuration = new Configuration().configure();
		ServiceRegistry serviceRegistry = configuration.getStandardServiceRegistryBuilder().build();
				
		sessionFactory = new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();
			
		//通过工厂类开启session对象
		session = sessionFactory.openSession();
				
		//开启事务处理
				
		transaction = session.beginTransaction();
		
	}
	
	@After
	public void after(){
		//提交事务
		transaction.commit();
				
		//关闭会话
		session.close();
				
		//关闭工厂
				
		sessionFactory.close();
		
		
	}
	

	@Test
	public void test(){
		//增加
//		Teacher t = new Teacher();
//		t.setName("张三");
//		
//		Student stu1 = new Student();
//		stu1.setName("zhang");
//		stu1.setTeacher(t);
//
//		Student stu2 = new Student();
//		stu2.setName("san");
//		stu2.setTeacher(t);
//		
//		session.save(t);
//		session.save(stu1);
//		session.save(stu2);
		
		
		//查询
//		System.out.println(session.get(Student.class, 14).getTeacher().getName());
		//删除 只能先删除多的一方
		Student s = session.get(Student.class, 12);
		session.delete(s);
	}

}
