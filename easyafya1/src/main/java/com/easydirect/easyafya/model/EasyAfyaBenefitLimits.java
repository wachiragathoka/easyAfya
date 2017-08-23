/**
 * 
 */
package com.easydirect.easyafya.model;

import java.util.Date;

import javax.persistence.Column;
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
 * @description the benefit figures
 */

@Entity
@Table(name="easyafya_benefits_limits")
public class EasyAfyaBenefitLimits {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long easyafya_benefits_limit_id;
	
	@ManyToOne
	private EasyAfyaCategory easyafya_category_id;
	
	@ManyToOne
	private EasyAfyaBenefitsCategory easyafya_benefit_category_id;
	
	@ManyToOne
	private EasyAfyaAgeBrackets easyafya_age_bracket_id;
	
	@ManyToOne
	private EasyAfyaMembersCategory easyafya_member_category_id;
		
	@Column(precision=10, scale=2) 
	private Double easyafya_benefit_limit_amount;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreated;
	
	@ManyToOne
	private EasyAfyaUsers easyafya_user_id;
}
