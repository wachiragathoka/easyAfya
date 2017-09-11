/**
 * 
 */
package com.easydirect.easyafya.service.Impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;


import org.springframework.transaction.annotation.Transactional;

import com.easydirect.easyafya.model.EasyAfyaUser;
import com.easydirect.easyafya.service.EasyAfyaUserService;

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
		Query query = em.createNamedQuery(
				"EasyAfyaUser.findAll", EasyAfyaUser.class);
		
		return query.getResultList();		 
	}


	@Override
	public boolean exists(Long id) {
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
	public List<EasyAfyaUser> findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EasyAfyaUser> findByFirstName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}
}
