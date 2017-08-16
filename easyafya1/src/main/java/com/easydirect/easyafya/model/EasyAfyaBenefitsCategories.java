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
 * @category Inpatient, outpatient,
 *
 */

@Entity
@Table(name="easyafya_benefits_category")
public class EasyAfyaBenefitsCategories {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long easyafya_benefit_category_id;
	
	private String description;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreated;
	
	@ManyToOne
	private EasyAfyaUsers easyafya_user_id;
	
}
