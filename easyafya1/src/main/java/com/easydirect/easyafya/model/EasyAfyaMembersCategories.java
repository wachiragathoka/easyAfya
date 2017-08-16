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
 * member Categories
 * @Principal members
 * @Spouse
 * @Children
 */

@Entity
@Table(name="easyafya_members_categories")
public class EasyAfyaMembersCategories {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long easyafya_members_category_id;
	
	private String description;
	
	@Temporal(TemporalType.DATE)
	private Date dateCreated;
	
	@ManyToOne
	private EasyAfyaUsers easyafya_user_id;
		
}
