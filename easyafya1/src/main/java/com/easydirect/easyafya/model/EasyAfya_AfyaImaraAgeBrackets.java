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
 */

@Entity
@NamedQueries({
	@NamedQuery(name="EasyAfya_AfyaImaraAgeBrackets.FindAll",
			query="select u from EasyAfya_AfyaImaraAgeBrackets u"),
	
	@NamedQuery(name="EasyAfya_AfyaImaraAgeBrackets.findByID",
			query="select u from EasyAfya_AfyaImaraAgeBrackets u where id=:id"),
	
})
@Table(name="easyafya_afyaimara_age_brackets")
public class EasyAfya_AfyaImaraAgeBrackets {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="easyafya_category_name")
	private String easyafya_category_name;
	
	@Column(name="lower_limit")
	private int categoryAgeLowerLimit;
	
	@Column(name="upper_limit")
	private int categoryAgeUpperLimit;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_created", columnDefinition="TIMESTAMP")
	private Date dateCreated;
	
	@Column (name="user_id")
	private int easyafya_user_id=1;

	public EasyAfya_AfyaImaraAgeBrackets(){
		
	}
	

	/**
	 * @return the easyafya_age_bracket_id
	 */
	public long getEasyafya_age_bracket_id() {
		return id;
	}

	/**
	 * @param easyafya_age_bracket_id the easyafya_age_bracket_id to set
	 */
	public void setEasyafya_age_bracket_id(long easyafya_age_bracket_id) {
		this.id = easyafya_age_bracket_id;
	}

	/**
	 * @return the easyafya_category_id
	 */
	public String getEasyafya_category_id() {
		return easyafya_category_name;
	}

	/**
	 * @param easyafya_category_name the easyafya_category_id to set
	 */
	public void setEasyafya_category_id(String easyafya_category_name) {
		this.easyafya_category_name = easyafya_category_name;
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
	public int getEasyafya_user_id() {
		return easyafya_user_id;
	}


	/**
	 * @param easyafya_user_id the easyafya_user_id to set
	 */
	public void setEasyafya_user_id(int easyafya_user_id) {
		this.easyafya_user_id = easyafya_user_id;
	}
}
