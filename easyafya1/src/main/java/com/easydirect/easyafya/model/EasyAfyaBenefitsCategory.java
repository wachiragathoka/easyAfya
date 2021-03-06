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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@NamedQueries({
	
	@NamedQuery(name="EasyAfyaBenefitsCategory.findAllEasyAfyaBenefitsCategories",
			query="select b from EasyAfyaBenefitsCategory b")
})
@Table(name="easyafya_benefits_category")
public class EasyAfyaBenefitsCategory {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long easyafya_benefit_category_id;
	
	@Column(name="description")
	private String description;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_created",columnDefinition="TIMESTAMP")
	private Date dateCreated;
	
	@ManyToOne
	private EasyAfyaUser easyafya_user_id;

	
	public EasyAfyaBenefitsCategory(){
		
	}
	
	
	/**
	 * @return the easyafya_benefit_category_id
	 */
	public long getEasyafya_benefit_category_id() {
		return easyafya_benefit_category_id;
	}

	/**
	 * @param easyafya_benefit_category_id the easyafya_benefit_category_id to set
	 */
	public void setEasyafya_benefit_category_id(long easyafya_benefit_category_id) {
		this.easyafya_benefit_category_id = easyafya_benefit_category_id;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the dateCreated
	 */
	public Date getDateCreated() {
		return dateCreated;
	}

	/**
	 * @param dateCreated the dateCreated to set
	 */
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	/**
	 * @return the easyafya_user_id
	 */
	public EasyAfyaUser getEasyafya_user_id() {
		return easyafya_user_id;
	}

	/**
	 * @param easyafya_user_id the easyafya_user_id to set
	 */
	public void setEasyafya_user_id(EasyAfyaUser easyafya_user_id) {
		this.easyafya_user_id = easyafya_user_id;
	}	
}