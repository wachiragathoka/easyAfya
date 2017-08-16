/**
 * 
 */
package com.easydirect.easyafya.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author MGathoka
 *
 * Hold the afyaImara categories
 * @AfyaImara
 * @AfyaImara Junior
 * @AfyaImara County
 * @AfyaImara Seniors
 */

@Entity
@Table(name="easyafya_categories")
public class EasyAfyaCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer easyafya_category_id;
	
	private String description;
	
	@Temporal(TemporalType.DATE)
	private String dateCreated;
	
	private int user_Id;
}
