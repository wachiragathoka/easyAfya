/**
 * 
 */
package com.easydirect.easyafya.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author MGathoka
 *
 */

@Entity
@NamedQueries({
@NamedQuery( name = "EasyAfyaUser.findAll",
			  query = "select u from EasyAfyaUser u"),
})

@Table(name="easyafya_users")
public class EasyAfyaUser {	
	
	
	public EasyAfyaUser() {
		
	}
	
	public EasyAfyaUser(String firstname, String sname, String lname, String ldapname){
		super();
		this.fisrtName=firstname;
		this.secondName=sname;
		this.lastName=lname;
		this.userName=ldapname;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private long easyafya_user_id;
	
	@Column(name="firstname")
	private String fisrtName;
	
	@Column(name="secondnames")
	private String secondName;
	
	@Column(name="lastname")
	private String lastName;
	
	@Column(name="ldap_username")
	private String userName;
		
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATECREATED_TIMESTAMP", columnDefinition="TIMESTAMP")
	private Date dateCreated;
		
	//@OneToMany(mappedBy="easyAfyaUsers")
	//private Set<EasyAfyaCategory> user = new HashSet<EasyAfyaCategory>();
	
	
	/**
	 * @return the easyafya_user_id
	 */
	public long getEasyafya_user_id() {
		return easyafya_user_id;
	}

	/**
	 * @return the fisrtName
	 */
	public String getFisrtName() {
		return fisrtName;
	}

	/**
	 * @param fisrtName the fisrtName to set
	 */
	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}

	/**
	 * @return the secondName
	 */
	public String getSecondName() {
		return secondName;
	}

	/**
	 * @param secondName the secondName to set
	 */
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
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
	 * @return the persons
	 */
	//public Set<EasyAfyaCategory> getPersons() {
	//	return user;
	//}

	/**
	 * @param persons the persons to set
	 */
	//public void setPersons(Set<EasyAfyaCategory> persons) {
	//	this.user = persons;
	//}

	/**
	 * @param easyafya_user_id the easyafya_user_id to set
	 */
	public void setEasyafya_user_id(Long easyafya_user_id) {
		this.easyafya_user_id = easyafya_user_id;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EasyAfyaUsers [easyafya_user_id=" + easyafya_user_id + ", fisrtName=" + fisrtName + ", secondName="
				+ secondName + ", lastName=" + lastName + ", userName=" + userName + ", dateCreated=" + dateCreated
				+ "]";
	}
}
