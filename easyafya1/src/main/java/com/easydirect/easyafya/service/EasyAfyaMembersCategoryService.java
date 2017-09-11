/**
 * 
 */
package com.easydirect.easyafya.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import com.easydirect.easyafya.model.EasyAfyaMembersCategory;

/**
 * @author MGathoka
 *
 */
public interface EasyAfyaMembersCategoryService extends Repository<EasyAfyaMembersCategory, Long>{

	long addMemberCategory(EasyAfyaMembersCategory easyAfyaMembersCategory);

	List<EasyAfyaMembersCategory> findAll();

}
