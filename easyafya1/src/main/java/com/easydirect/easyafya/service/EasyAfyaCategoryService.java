/**
 * 
 */
package com.easydirect.easyafya.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.easydirect.easyafya.model.EasyAfyaCategory;


/**
 * @author MGathoka
 *
 */
public interface EasyAfyaCategoryService extends CrudRepository<EasyAfyaCategory, Long>{
	
	public void populateDummy();

}