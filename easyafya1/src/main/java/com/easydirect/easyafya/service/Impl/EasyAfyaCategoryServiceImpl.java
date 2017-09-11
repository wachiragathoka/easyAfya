/**
 * 
 */
package com.easydirect.easyafya.service.Impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import com.easydirect.easyafya.model.EasyAfyaCategory;
import com.easydirect.easyafya.service.EasyAfyaCategoryService;

/**
 * @author MGathoka
 *
 */

@Transactional
public class EasyAfyaCategoryServiceImpl implements EasyAfyaCategoryService {

	@PersistenceContext
	 private EntityManager em;
	
	@Override
	public long addCategory(EasyAfyaCategory easyAfyaCategory){
		em.persist(easyAfyaCategory);
		return easyAfyaCategory.getEasyafya_category_id();
		
	}
	
	@Override
	public List<EasyAfyaCategory> findAllEasyAfyaCategories(){
		
		Query query = em.createNamedQuery("EasyAfyaCategory.findAllEasyAfyaCategories", EasyAfyaCategory.class);		
		return query.getResultList();
	}
	
}
