/**
 * 
 */
package com.easydirect.easyafya.repoImpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.easydirect.easyafya.model.EasyAfyaAgeBrackets;
import com.easydirect.easyafya.repo.EasyAfyaAgeBracketsRepo;

/**
 * @author MGathoka
 *
 */

@Transactional
public class EasyAfyaAgeBracketsRepoImpl implements EasyAfyaAgeBracketsRepo{

	 @PersistenceContext
	 private EntityManager em;
	 
	 @Autowired
	 private EasyAfyaAgeBracketsRepo easyAfyaAgeBracketsRepo;
	 
	@Override
	public <S extends EasyAfyaAgeBrackets> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends EasyAfyaAgeBrackets> Iterable<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EasyAfyaAgeBrackets findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<EasyAfyaAgeBrackets> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<EasyAfyaAgeBrackets> findAll(Iterable<Long> ids) {
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
	public void delete(EasyAfyaAgeBrackets entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends EasyAfyaAgeBrackets> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

}
