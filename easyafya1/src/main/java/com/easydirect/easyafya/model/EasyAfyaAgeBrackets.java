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
 *
 */

@Entity
@Table(name="easyafya_age_brackets")
public class EasyAfyaAgeBrackets {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long easyafya_age_bracket_id;
	
	@ManyToOne
	private EasyAfyaCategory easyafya_category_id;
	
	@Column(name="lower_limit")
	private int categoryAgeLowerLimit;
	
	@Column(name="upper_limit")
	private int categoryAgeUpperLimit;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_created", columnDefinition="TIMESTAMP")
	private Date dateCreated;
	
	@ManyToOne
	private EasyAfyaUsers easyafya_user_id;

	
	
	/**
	 * @return the easyafya_age_bracket_id
	 */
	public long getEasyafya_age_bracket_id() {
		return easyafya_age_bracket_id;
	}

	/**
	 * @param easyafya_age_bracket_id the easyafya_age_bracket_id to set
	 */
	public void setEasyafya_age_bracket_id(long easyafya_age_bracket_id) {
		this.easyafya_age_bracket_id = easyafya_age_bracket_id;
	}

	/**
	 * @return the easyafya_category_id
	 */
	public EasyAfyaCategory getEasyafya_category_id() {
		return easyafya_category_id;
	}

	/**
	 * @param easyafya_category_id the easyafya_category_id to set
	 */
	public void setEasyafya_category_id(EasyAfyaCategory easyafya_category_id) {
		this.easyafya_category_id = easyafya_category_id;
	}

	/**
	 * @return the categoryAgeLowerLimit
	 */
	public int getCategoryAgeLowerLimit() {
		return categoryAgeLowerLimit;
	}

	/**
	 * @param categoryAgeLowerLimit the categoryAgeLowerLimit to set
	 */
	public void setCategoryAgeLowerLimit(int categoryAgeLowerLimit) {
		this.categoryAgeLowerLimit = categoryAgeLowerLimit;
	}

	/**
	 * @return the categoryAgeUpperLimit
	 */
	public int getCategoryAgeUpperLimit() {
		return categoryAgeUpperLimit;
	}

	/**
	 * @param categoryAgeUpperLimit the categoryAgeUpperLimit to set
	 */
	public void setCategoryAgeUpperLimit(int categoryAgeUpperLimit) {
		this.categoryAgeUpperLimit = categoryAgeUpperLimit;
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
	public EasyAfyaUsers getEasyafya_user_id() {
		return easyafya_user_id;
	}

	/**
	 * @param easyafya_user_id the easyafya_user_id to set
	 */
	public void setEasyafya_user_id(EasyAfyaUsers easyafya_user_id) {
		this.easyafya_user_id = easyafya_user_id;
	}
}
