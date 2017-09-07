/**
 * 
 */
package com.easydirect.easyafya.service.Impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.mockito.internal.util.collections.Iterables;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.easydirect.easyafya.model.EasyAfyaUser;
import com.easydirect.easyafya.service.EasyAfyaUserService;

import scala.annotation.meta.field;

/**
 * @author MGathoka
 *
 */
@Transactional
public class EasyAfyaUserServiceImpl implements EasyAfyaUserService {

	
	@PersistenceContext
	 private EntityManager em;
	
	
	@Override
	public long saveUser(EasyAfyaUser easyAfyaUser){
		em.persist(easyAfyaUser);
		return easyAfyaUser.getEasyafya_user_id();
	}
	
	
	

	@Override
	public EasyAfyaUser findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<EasyAfyaUser> findAll() {
		Query query = (Query) em.createNamedQuery(
				"query_find_all_users", EasyAfyaUser.class);
		return ((TypedQuery<EasyAfyaUser>) query).getResultList();
	}


	@Override
	public boolean exists(Long id) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public Iterable<EasyAfyaUser> findAll(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(EasyAfyaUser entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends EasyAfyaUser> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

}
