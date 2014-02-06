package hib.impl;

import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Driver {

	public static void main(String[] args) {
//		 Configuration cfg=new Configuration();
//		 cfg.configure("hibernate-cfg.xml");
//		 @SuppressWarnings("deprecation")
//		 SessionFactory factory = cfg.buildSessionFactory();
//		 Session session=factory.openSession();
//		 session.close();
//		 System.out.println("Done");
		DataStorImpl dataStorImpl = new DataStorImpl();
		dataStorImpl.inetial();
		try {
			dataStorImpl.configure("Tenant01");
			dataStorImpl.checkConnection("Tenant01");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 

	}

}
