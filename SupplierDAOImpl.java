package com.game.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.game.model.Supplier;


@Repository("supplierDAO")
public class SupplierDAOImpl implements SupplierDAO {
	@Autowired
	private SessionFactory sessionfactory;
	public SupplierDAOImpl(SessionFactory sessionfactory){
		this.sessionfactory=sessionfactory;
	}
		
		@Transactional
		public void saveOrUpdate(Supplier supplier){
		sessionfactory.getCurrentSession().saveOrUpdate(supplier);
		}
		
		
		
		
		@Transactional
		public void delete(int id) {
			Supplier supplier=new Supplier();
			supplier.setId(id);
			sessionfactory.getCurrentSession().delete(supplier);
			
		
		}
			
		
		
			public Supplier get(int id) {
				String hql = "from Supplier where id=" + "'"+ id +"'";
				//  from supplier where id = '101'
				Query query =  sessionfactory.getCurrentSession().createQuery(hql);
				@SuppressWarnings("unchecked")
				List<Supplier> listsupplier = (List<Supplier>) query.list();
				
				if (listsupplier != null && !listsupplier.isEmpty()) {
					return listsupplier.get(0);
				}
				return null;
			}
			
			@Transactional
			public List<Supplier> list() {
				@SuppressWarnings("unchecked")
				List<Supplier> listSupplier = (List<Supplier>) 
				          sessionfactory.getCurrentSession()
						.createCriteria(Supplier.class)
						.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
				return listSupplier;
			}
		








}
