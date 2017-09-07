/**
 * 
 */
package com.easydirect.easyafya.service;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.easydirect.easyafya.model.EasyAfyaUser;

/**
 * @author MGathoka
 *
 */

public interface EasyAfyaUserService extends Repository<EasyAfyaUser, Long>{

	long saveUser(EasyAfyaUser easyAfyaUser);
	
	public boolean exists(Long id);
	public long count();
	
	public EasyAfyaUser findOne(Long id);
	public List<EasyAfyaUser> findByLastName(String lastName);
	public List<EasyAfyaUser> findByFirstName(String lastName);
	public List<EasyAfyaUser> findAll();
	public Iterable<EasyAfyaUser> findAll(Iterable<Long> ids);
	
	
	
	
	void delete(Long id);
	void delete(EasyAfyaUser entity);
	void delete(Iterable<? extends EasyAfyaUser> entities);
	void deleteAll();
	
	//List<EasyAfyaUsers> findAll();
}
