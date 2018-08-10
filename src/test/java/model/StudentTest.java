package model;


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
	public void test() {
		
		//执行数据库增加操作
//		Student stu = new Student("lisi",20,01);
//		session.save(stu);
		
		//执行数据库增加操作查询操作（get/load）
//		System.out.println(session.get(Student.class, 3));
//		System.out.println(session.load(Student.class, 3));
		
		
	}

}
