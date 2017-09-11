/**
 * 
 */
package com.easydirect.easyafya.service.Impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import com.easydirect.easyafya.model.EasyAfyaMembersCategory;
import com.easydirect.easyafya.service.EasyAfyaMembersCategoryService;

/**
 * @author MGathoka
 *
 */
@Transactional
public class EasyAfyaMembersCategoryServiceImpl implements EasyAfyaMembersCategoryService {
	
	@PersistenceContext
	 private EntityManager em;

	@Override
	public long addMemberCategory(EasyAfyaMembersCategory easyAfyaMembersCategory){
		em.persist(easyAfyaMembersCategory);
		return easyAfyaMembersCategory.getEasyafya_members_category_id();
	}
	
	@Override
	public List<EasyAfyaMembersCategory> findAll(){
		Query query = em.createNamedQuery("EasyAfyaMembersCategory.findAll", EasyAfyaMembersCategory.class);
		return query.getResultList();
	}
}
