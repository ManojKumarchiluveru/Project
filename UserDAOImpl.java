package com.game.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.game.model.User;
import com.game.model.UserRole;


@Repository("userDAO")
public class UserDAOImpl implements UserDAO{
	
	@Autowired
	private SessionFactory sessionFactory;


	public UserDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	
	}

    @Transactional
	public List<User> list() {
    	List<User> listUser = (List<User>) 
		          sessionFactory.getCurrentSession()
				.createCriteria(User.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listUser;
	}

	@Transactional
	public User get(int uid) {
		String hql = "from User where uid=" + "'"+ uid +"'";
		Query query =  sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<User> listUser = (List<User>) query.list();
		
		if (listUser != null && !listUser.isEmpty()) {
			return listUser.get(0);
		}
		return null;
	}

	@Transactional
	public void saveOrUpdate(User user) {
	Session session=sessionFactory.getCurrentSession();
	Transaction tx=session.beginTransaction();
	user.setIsenabled(true);
	session.save(user);
	UserRole userRole=new UserRole();
	userRole.setId(user.getId());
	userRole.setAuthority("ROLE_USER");
	session.save(userRole);
	System.out.println("Done saving user");
	tx.commit();
	}

	

	@Transactional
	public void delete(int uid) {
		User user=new User();
		user.setId(uid);
		sessionFactory.getCurrentSession().delete(user);		
	}
	
	
	@Transactional
	public User getUserByName(String uname) {
		System.out.println("getting data in dao based on name");
		Session session=this.sessionFactory.getCurrentSession();
		User user=(User) session.get(User.class,uname);
		System.out.println("data of user by name="+user);
		return user;	


	}

	@Transactional
     public boolean isValidCredentials(String user,Boolean isAdmin, String pass) {
		Transaction t=sessionFactory.getCurrentSession().beginTransaction();
		String hql = "from user where uid= '" + user + "' and upassword = '" + pass + "'";
		//String hql = "from User where uid= '" + user + "' and " + " upassword ='" + pass+"'";
		Query q = sessionFactory.getCurrentSession().createQuery(hql);
		List list = q.list();
		System.out.println("userDAOIMPL");
		t.commit();
		return true;
		
		
		/*if(list == null || list.isEmpty())
		{
			return false;
		}
		
		else
		{
			return true;
		}
		
		*/
		
	}

	

}
