/**
 * 
 */
package com.easydirect.easyafya.service.Impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import com.easydirect.easyafya.model.EasyAfyaBenefitsCategory;
import com.easydirect.easyafya.service.EasyAfyaBenefitsCategoryService;

/**
 * @author MGathoka
 *
 */
@Transactional
public class EasyAfyaBenefitsCategoryServiceImpl implements EasyAfyaBenefitsCategoryService {
	
	@PersistenceContext
	 private EntityManager em;

	@Override
	public List <EasyAfyaBenefitsCategory> findAllEasyAfyaBenefitsCategories(){
		Query query=em.createNamedQuery("EasyAfyaBenefitsCategory.findAllEasyAfyaBenefitsCategories", EasyAfyaBenefitsCategory.class);
		return query.getResultList();
	}
	
	@Override
	public long addEasyAfyaBenefitCategory(EasyAfyaBenefitsCategory easyAfyaBenefitsCategory){
		em.persist(easyAfyaBenefitsCategory);
		return easyAfyaBenefitsCategory.getEasyafya_benefit_category_id();
	}

}
