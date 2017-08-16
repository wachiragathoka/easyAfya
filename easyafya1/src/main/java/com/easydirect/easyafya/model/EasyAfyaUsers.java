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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author MGathoka
 *
 */

@Entity
@Table(name="easyafya_users")
public class EasyAfyaUsers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long easyafya_user_id;
	
	private String fisrtName;
	
	private String secondName;
	
	private String lastName;
	
	private String userName;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATECREATED_TIMESTAMP")
	private Date dateCreated;	
}
