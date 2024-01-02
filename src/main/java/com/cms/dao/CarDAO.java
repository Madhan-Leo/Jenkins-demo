package com.cms.dao;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


import com.cms.bean.Carz;
import com.cms.util.DBUtil;

public class CarDAO {
	
	Transaction transaction;
	Session session;

	public void insertCar(Carz bean) {
		session = DBUtil.getSession();
		transaction = session.beginTransaction();
		session.save(bean);
		transaction.commit();
		session.close();
	}

}
