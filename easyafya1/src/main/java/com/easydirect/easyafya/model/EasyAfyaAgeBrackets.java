/**
 * 
 */
package com.easydirect.easyafya.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author MGathoka
 *
 */

@ Entity
@Table(name="easyafya_age_brackets")
public class EasyAfyaAgeBrackets {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long easyafya_age_bracket_id;
	
	private long easyafya_category_id;
	
	private int age_lower_limit;
	
	private int age_upper_limit;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreated;
	
	@ManyToOne
	private EasyAfyaUsers easyafya_user_id;
}
