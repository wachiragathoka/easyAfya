/**
 * 
 */
package com.uapom.easycomms.service;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.uapom.easycomms.model.SMS;

/**
 * @author MGathoka
 *
 */

public interface SMSService extends Repository<SMS, Long>{

	long saveSMS(SMS sms);
	SMS findOne(long id);
	List<SMS> findAllPageable();
	List<SMS> findAllByUser(long user_id);
}