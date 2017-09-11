/**
 * 
 */
package com.easydirect.easyafya.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import com.easydirect.easyafya.model.EasyAfyaBenefitsCategory;

/**
 * @author MGathoka
 *
 */
public interface EasyAfyaBenefitsCategoryService extends Repository<EasyAfyaBenefitsCategory, Long> {

	List<EasyAfyaBenefitsCategory> findAllEasyAfyaBenefitsCategories();

	long addEasyAfyaBenefitCategory(EasyAfyaBenefitsCategory easyAfyaBenefitsCategory);

}
