/**
 * 
 */
package com.easydirect.easyafya.service;

import java.util.List;

import org.springframework.data.repository.Repository;
import com.easydirect.easyafya.model.EasyAfyaCategory;


/**
 * @author MGathoka
 *
 */
public interface EasyAfyaCategoryService extends Repository<EasyAfyaCategory, Long>{

	long addCategory(EasyAfyaCategory easyAfyaCategory);

	List<EasyAfyaCategory> findAllEasyAfyaCategories();
	
	

}