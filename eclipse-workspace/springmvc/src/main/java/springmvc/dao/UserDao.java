package springmvc.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import springmvc.model.User;


@Repository
public class UserDao {
	
	@Autowired
	private HibernateTemplate hibernateTempalte;
	
	@Transactional
	public int saveUser(User user) {
		
		int id = (Integer)this.hibernateTempalte.save(user);
		
		return id;
	}

}
