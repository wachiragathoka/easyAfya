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
 * 500,000
 * 1000,0000
 *
 */
@Entity
@NamedQueries({
	@NamedQuery(name="AfyaImara_AnualCoverLimits.findAll",
			query="select l from AfyaImara_AnualCoverLimits l"),
	
	@NamedQuery(name="AfyaImara_AnualCoverLimits.findByLimitValue",
			query="select v from AfyaImara_AnualCoverLimits v where v.annualLimitValue=:annualLimitValue")	
	
})
public class AfyaImara_AnualCoverLimits {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private long id;
	
	@Column(name="annual_cover_limit")
	private String annualLimitValue;
	
	@Temporal(TemporalType.DATE)
	@Column(name="date_created", columnDefinition="TIMESTAMP")
	private Date dateCreated;
	
	public AfyaImara_AnualCoverLimits(){
		
	}

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
	 * @return the annualLimit
	 */
	public String getAnnualLimitValue() {
		return annualLimitValue;
	}

	/**
	 * @param annualLimit the annualLimit to set
	 */
	public void setAnnualLimitValue(String annualLimit) {
		this.annualLimitValue = annualLimit;
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
