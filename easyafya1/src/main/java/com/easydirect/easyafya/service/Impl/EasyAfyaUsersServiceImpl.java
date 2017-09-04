/**
 * 
 */
package com.easydirect.easyafya.repoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.easydirect.easyafya.model.EasyAfyaUsers;
import com.easydirect.easyafya.repo.EasyAfyaUserRepo;

/**
 * @author MGathoka
 *
 */

@Transactional
public class EasyAfyaUsersRepoImpl  implements EasyAfyaUserRepo{

	  @PersistenceContext
	  private EntityManager em;
	  
	 @Autowired
	 private EasyAfyaUserRepo easyafyaUsersRepo;
	  
	 
	@Override
	public <S extends EasyAfyaUsers> Iterable<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EasyAfyaUsers findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<EasyAfyaUsers> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<EasyAfyaUsers> findAll(Iterable<Long> ids) {
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
	public void delete(EasyAfyaUsers entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends EasyAfyaUsers> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends EasyAfyaUsers> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}
	  

}
