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
 * member Categories
 * @Principal members
 * @Spouse
 * @Children
 */

@Entity
@NamedQueries({
	@NamedQuery(name="EasyAfyaMembersCategory.findAll",
			query="select m from EasyAfyaMembersCategory m"),
	
	@NamedQuery(name="EasyAfyaMembersCategory.findById",
			query="select m from EasyAfyaMembersCategory m where m.id=:id"),
	
	@NamedQuery(name="EasyAfyaMembersCategory.findByName",
			query="select m from EasyAfyaMembersCategory m where m.easyafya_category_name=:easyafya_category_name")
	
})
@Table(name="easyafya_members_categories")
public class EasyAfyaMembersCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="easyafya_category_name")
	private String easyafya_category_name;
	
	@Column(name="description")
	private String description;
		
	@Temporal(TemporalType.DATE)
	@Column(name="date_created",columnDefinition="TIMESTAMP")
	private Date dateCreated;
	
	
	public EasyAfyaMembersCategory(){
		
	}
	
	
	/**
	 * @return the easyafya_members_category_id
	 */
	public long getEasyafya_members_category_id() {
		return id;
	}

	/**
	 * @param easyafya_members_category_id the easyafya_members_category_id to set
	 */
	public void setEasyafya_members_category_id(long easyafya_members_category_id) {
		this.id = easyafya_members_category_id;
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
	 * @return the easyafya_category_name
	 */
	public String getEasyafya_category_name() {
		return easyafya_category_name;
	}


	/**
	 * @param easyafya_category_name the easyafya_category_name to set
	 */
	public void setEasyafya_category_name(String easyafya_category_name) {
		this.easyafya_category_name = easyafya_category_name;
	}

	
}
