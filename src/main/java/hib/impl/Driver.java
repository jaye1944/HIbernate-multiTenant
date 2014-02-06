package hib.impl;

import hib.dao.Tenant;

import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
//		 Configuration cfg=new Configuration();
//		 cfg.configure("hibernate-cfg.xml");
//		 @SuppressWarnings("deprecation")
//		 SessionFactory factory = cfg.buildSessionFactory();
//		 Session session=factory.openSession();
//		 session.close();
//		 System.out.println("Done");
		
//		DataStorImpl dataStorImpl = new DataStorImpl();
//		
//		dataStorImpl.inetial();
//		try {
//			dataStorImpl.checkConnection("Master_H");
//			dataStorImpl.configure("Tenant01");
//			dataStorImpl.checkConnection("Tenant01");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		 
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:beans.xml");
		//SessionFactory sessionFac = (SessionFactory) context.getBean("sessionFactory");
		ServiceEngineMasterDao dao = context.getBean(ServiceEngineMasterDao.class);
		System.out.println(dao.getClass());
//		Tenant createT = dao.createT("tenant_1");
//		System.out.println(createT.getId());
		

	}

}
