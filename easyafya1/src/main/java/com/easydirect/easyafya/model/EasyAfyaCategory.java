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
 * Hold the afyaImara categories
 * @Description AfyaImara, AfyaImara Junior, @AfyaImara County, AfyaImara Seniors
 * 
 * 
 */

@Entity
@NamedQueries({
	@NamedQuery(name="EasyAfyaCategory.findAll",
			query="select c from EasyAfyaCategory c"),
	
	@NamedQuery(name="EasyAfyaCategory.findById",
			query="select c from EasyAfyaCategory c where c.category_id=:category_id")
	
})

@Table(name="easyafya_categories")
public class EasyAfyaCategory {

	public EasyAfyaCategory() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long category_id;
	
	@Column(name="category_name")
	private String categoryName;
	
	@Column(name="description" )
	private String description;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATECREATED_TIMESTAMP", columnDefinition="TIMESTAMP")
	private Date dateCreated;
	
	
	/**
	 * @return the categoryName
	 */
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * @param categoryName the categoryName to set
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	/**
	 * @param easyafya_category_id the easyafya_category_id to set
	 */
	public void setEasyafya_category_id(long easyafya_category_id) {
		this.category_id = easyafya_category_id;
	}

	/**
	 * @return the easyafya_category_id
	 */
	public long getEasyafya_category_id() {
		return category_id;
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

}