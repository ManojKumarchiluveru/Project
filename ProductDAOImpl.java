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
public class ProductDAOImpl implements ProductDAO {
	
	@Autowired
	SessionFactory sessionfactory;
	
	public ProductDAOImpl() {
		System.out.println("ProductDAOImpl --One");
	}
	public ProductDAOImpl(SessionFactory sessionfactory){
		this.sessionfactory=sessionfactory;
	}
		
		@Transactional
		public void saveOrUpdate(Product pd){
			
			Session s=sessionfactory.getCurrentSession();
			Transaction t=s.beginTransaction();
			System.out.println("User dao impl" +  pd);
			s.saveOrUpdate(pd);
			t.commit();	
			
			
			
		//	Transaction t=sessionfactory.getCurrentSession().beginTransaction();
			
		//	sessionfactory.getCurrentSession().saveOrUpdate(product);
		//t.commit();
		
		}
		
	    @Transactional
		public Product get(int pid) {
	    	Session s=sessionfactory.getCurrentSession();
			Transaction t=s.beginTransaction();
			String hql = "from Product where id=" + "'"+ pid +"'";
			//  from supplier where id = '101'
			Query query =  sessionfactory.getCurrentSession().createQuery(hql);
			@SuppressWarnings("unchecked")
			List<Product> listproduct = (List<Product>) query.list();
			
			if (listproduct != null && !listproduct.isEmpty()) {
				return listproduct.get(0);
			}
			t.commit();	
			return null;
		}
	    @Transactional
		public Product getProductByName(String pname) {
			// TODO Auto-generated method stub
			
				System.out.println("getting data in dao based on name");
				Session session=this.sessionfactory.getCurrentSession();
				Product product=(Product) session.get(Product.class,pname);
				System.out.println("data of user by name="+product);
				return product;	

		}
		
		@Transactional
		public void delete(int pid) {
			
			System.out.println("Id in deleteProduct(int pid):"+pid);
			
		    Session session=sessionfactory.getCurrentSession();
		    Transaction tx=session.beginTransaction();
		    Product product = (Product)session.load(Product.class, pid);
		 //   Query query=session.createQuery("delete from Product  where pid=:status");
		  //  query.setInteger("status",pid);
		  //  int rowsDeleted=query.executeUpdate();
		    session.delete(product);
		  tx.commit();
		   // System.out.println("Rows deleted:"+rowsDeleted);
		    System.out.println("deleted");
			
		
		}
			
		
		@Transactional
			public List<Product> list() {
			Session s = sessionfactory.getCurrentSession();
			Transaction tx = s.beginTransaction();
			List<Product> listProduct = s.createCriteria(Product.class).list();
			
				return listProduct;
			}

}
