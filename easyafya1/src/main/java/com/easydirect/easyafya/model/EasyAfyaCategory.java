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
 * Hold the afyaImara categories
 * @Description AfyaImara, AfyaImara Junior, @AfyaImara County, AfyaImara Seniors
 * 
 * 
 */

@Entity
@Table(name="easyafya_categories")
public class EasyAfyaCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long easyafya_category_id;
	
	
	@Column(name="description" )
	private String description;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATECREATED_TIMESTAMP", columnDefinition="TIMESTAMP")
	private Date dateCreated;
	
	@ManyToOne
	private EasyAfyaUsers easyAfyaUsers;

	/**
	 * @return the easyafya_category_id
	 */
	public long getEasyafya_category_id() {
		return easyafya_category_id;
	}

	/**
	 * @param easyafya_category_id the easyafya_category_id to set
	 */
	public void setEasyafya_category_id(Long easyafya_category_id) {
		this.easyafya_category_id = easyafya_category_id;
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
	 * @return the easyAfyaUsers
	 */
	public EasyAfyaUsers getEasyAfyaUsers() {
		return easyAfyaUsers;
	}

	/**
	 * @param easyAfyaUsers the easyAfyaUsers to set
	 */
	public void setEasyAfyaUsers(EasyAfyaUsers easyAfyaUsers) {
		this.easyAfyaUsers = easyAfyaUsers;
	}
}
