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
	public void test() throws ParseException {
		
		//执行数据库增加操作
//		Student stu = new Student();
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		Date d = sdf.parse("2000-12-21");
//		stu.setBirthday(d);
//		stu.setName("lisi");
//		System.out.println("dd-----------------------"+d);
//		stu.setStudynumber(0001);
//		session.save(stu);
//		
		
		
		
		//执行数据库增加操作查询操作（get/load）
		Student s = session.get(Student.class, 1);
		System.out.println(s.getAge());
//		Student stu = session.load(Student.class, 3);
//		System.out.println(stu);
	
	    //flush使缓存和数据库中查询出来的数据保持一致如果不一致将改数据库
//		stu.setName("事情2");
//		session.flush();  
		
		//refresh使缓存和数据库中查询出来的数据保持一致如果不一致将改缓存
//		session.refresh(stu);
		
		//清空缓存
//		session.clear();
	}

}
