package hib.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//import com.isa.test.hibernate.domain.App;
import hib.dao.Tenant;

@Repository
public class ServiceEngineMasterDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Tenant createT(String code) {
		Session session = sessionFactory.openSession();
		Tenant tenant = new Tenant();
		tenant.setName(code);
		session.save(tenant);
		session.close();
		return tenant;
	}
	
//	public App createApp(String code) {
//		Session session = sessionFactory.openSession();
//		App app = new App();
//		app.setName(code);
//		session.save(app);
//		session.close();
//		return app;
//	}

}
