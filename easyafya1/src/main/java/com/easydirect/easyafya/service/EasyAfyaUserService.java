/**
 * 
 */
package com.easydirect.easyafya.service;

import org.springframework.data.repository.CrudRepository;

import com.easydirect.easyafya.model.EasyAfyaUsers;

/**
 * @author MGathoka
 *
 */
public interface EasyAfyaUserService extends CrudRepository<EasyAfyaUsers, Long>{
	//List<EasyAfyaUsers> fin
}
