package com.uapom.easycomms.serviceImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.uapom.easycomms.model.SMS;
import com.uapom.easycomms.service.SMSService;


@Transactional
public class SMSServiceImpl implements SMSService {
	
	@PersistenceContext
	 private EntityManager em;
	
	@Override
	public long saveSMS(SMS sms){
		em.persist(sms);
		return sms.getId();
	}
	
	@Override
	public SMS findOne(long id) {	
		return null;
	}
	
	@Override
	public List<SMS> findAllPageable(){
		return null;
	}
	
	@Override
	public List<SMS> findAllByUser(long user_id){
		return null;
	}

}