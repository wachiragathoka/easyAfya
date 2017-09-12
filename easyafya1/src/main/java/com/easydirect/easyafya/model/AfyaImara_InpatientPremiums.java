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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;




/**
 * @author MGathoka
 *
 */

@Entity
@NamedQueries({
	@NamedQuery(name="AfyaImara_InpatientPremiums.findAll",
			query="select p from AfyaImara_InpatientPremiums p"),
	
	@NamedQuery(name="AfyaImara_InpatientPremiums.findById",
			query="select p from AfyaImara_InpatientPremiums p where AfyaImara_InpatientPremiums.id=:premiumId")
})
public class AfyaImara_InpatientPremiums {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private double premium_amount;
	
	private String ageLimit;
	
	private String memberCategory;
	
	private double annualCoverLimit;
	
	@Temporal(TemporalType.DATE)
	@Column(name="date_created",columnDefinition="TIMESTAMP")
	private Date dateCreated;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the premium_amount
	 */
	public double getPremium_amount() {
		return premium_amount;
	}

	/**
	 * @param premium_amount the premium_amount to set
	 */
	public void setPremium_amount(double premium_amount) {
		this.premium_amount = premium_amount;
	}

	/**
	 * @return the ageLimit
	 */
	public String getAgeLimit() {
		return ageLimit;
	}

	/**
	 * @param ageLimit the ageLimit to set
	 */
	public void setAgeLimit(String ageLimit) {
		this.ageLimit = ageLimit;
	}

	/**
	 * @return the memberCategory
	 */
	public String getMemberCategory() {
		return memberCategory;
	}

	/**
	 * @param memberCategory the memberCategory to set
	 */
	public void setMemberCategory(String memberCategory) {
		this.memberCategory = memberCategory;
	}

	/**
	 * @return the annualCoverLimit
	 */
	public double getAnnualCoverLimit() {
		return annualCoverLimit;
	}

	/**
	 * @param annualCoverLimit the annualCoverLimit to set
	 */
	public void setAnnualCoverLimit(double annualCoverLimit) {
		this.annualCoverLimit = annualCoverLimit;
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
