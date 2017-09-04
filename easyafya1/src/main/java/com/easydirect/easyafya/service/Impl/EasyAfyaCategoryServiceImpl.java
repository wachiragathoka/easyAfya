/**
 * 
 */
package com.easydirect.easyafya.service.Impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.easydirect.easyafya.model.EasyAfyaCategory;
import com.easydirect.easyafya.service.EasyAfyaCategoryService;

/**
 * @author MGathoka
 *
 */

@Transactional
public class EasyAfyaCategoryServiceImpl implements EasyAfyaCategoryService{
	
	@PersistenceContext
	 private EntityManager em;

	@Override
	public <S extends EasyAfyaCategory> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends EasyAfyaCategory> Iterable<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EasyAfyaCategory findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<EasyAfyaCategory> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Iterable<EasyAfyaCategory> findAll(Iterable<Long> ids) {
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
	public void delete(EasyAfyaCategory entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends EasyAfyaCategory> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

}
