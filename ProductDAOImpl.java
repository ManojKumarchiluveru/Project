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

import com.game.model.Product;




@Repository("productDAO")
public class ProductDAOImpl implements ProductDAO{
	
	@Autowired
	private SessionFactory sessionFactory;


	public ProductDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	
	}

    @Transactional
	public List<Product> list() {
    	List<Product> listProduct = (List<Product>) 
		          sessionFactory.getCurrentSession()
				.createCriteria(Product.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listProduct;
	}

	@Transactional
	public Product get(int id) {
		String hql = "from Product where uid=" + "'"+ id +"'";
		Query query =  sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Product> listProduct = (List<Product>) query.list();
		
		if (listProduct != null && !listProduct.isEmpty()) {
			return listProduct.get(0);
		}
		return null;
	}

	@Transactional
	public void saveOrUpdate(Product product) {
		Transaction t=sessionFactory.getCurrentSession().beginTransaction();

		sessionFactory.getCurrentSession().saveOrUpdate(product);
		t.commit();

	}

	@Transactional
	public void delete(int id) {
		Product product=new Product();
		product.setId(id);
		sessionFactory.getCurrentSession().delete(product);		
	}
	
	
	@Transactional
	public Product getProductByName(String name) {
		System.out.println("getting data in dao based on name");
		Session session=this.sessionFactory.getCurrentSession();
		Product product=(Product) session.get(Product.class,name);
		System.out.println("data of user by name="+product);
		return product;	


	}

	@Transactional
     public boolean isValidCredentials(String product,Boolean isAdmin, String password) {
		Transaction t=sessionFactory.getCurrentSession().beginTransaction();
		String hql = "from product where uid= '" + product + "' and upassword = '" + password + "'";
		//String hql = "from Product where id= '" + user + "' and " + " password ='" + password+"'";
		Query q = sessionFactory.getCurrentSession().createQuery(hql);
		List list = q.list();
		System.out.println("productDAOIMPL");
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

/*	public Product get1(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void saveOrUpdate1(Product product) {
		// TODO Auto-generated method stub
		
	}

	public Product getProductByName1(String name) {
		// TODO Auto-generated method stub
		return null;
	}
*/
	

}
