package com.game.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.game.model.Category;


@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public CategoryDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory=sessionFactory;
	}
	
	@Transactional
    public void saveOrUpdate(Category category) {
		Transaction t = sessionFactory.getCurrentSession().beginTransaction();

		sessionFactory.getCurrentSession().saveOrUpdate(category);
		t.commit();
	}

	@Transactional
	public void delete(int id) {
		Category category=new Category();
		
		sessionFactory.getCurrentSession().delete(category);
		
	}
	
	public Category get(int id){
		String hql="from where Category id=" +"'"+ id +"'";
		Query query=(Query) sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Category> listcategory=(List<Category>)  ((Criteria) query).list();
		
		if(listcategory !=null && !listcategory.isEmpty()){
			return listcategory.get(0);
		}
		return null;
	}
	
	

	@Transactional
	public List<Category> list() {
		@SuppressWarnings({ "unchecked" })
		List<Category> listCategory=(List<Category>) sessionFactory.getCurrentSession()
				                     .createCriteria(Category.class)
				                     .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listCategory;
		
	}


	@Transactional
	public Category getByName(String cname) {

	   String hql = "from Category where cname=" + "'"+ cname +"'";
	
		Query query = (Query) sessionFactory.openSession().createQuery(hql);
		List<Category> listCategory = (List<Category>)  query.list();
		
		if  (listCategory != null && !listCategory.isEmpty()){
			return listCategory.get(0);
			
		}
   		return null;

}
}