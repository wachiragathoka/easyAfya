/**
 * 
 */
package com.uapom.easycomms.model;

import java.util.Date;

import javax.persistence.Entity;

/**
 * @author MGathoka
 *
 */
@Entity
public class SMS {	
	private long id;
	private String message;
	private String mobile_no;
	private String message_type;
	private boolean is_unicode;
	private Date queue_time;
	private Date sent_time;
	private Date delivery_time;
	private long message_id;
	private long client_sms_no;
	private String delivery_status;
	private String sms_type;
	private String total_sms;
	private String total_sms_units;
	private double total_charge_per_unit;
	private String status;
	private String reason_for_not_delivered;
	private String description_of_reason;
	private String sender_id;
	private String group_name;
	private long user_id;
	private long vender_id;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getMessage_type() {
		return message_type;
	}
	public void setMessage_type(String message_type) {
		this.message_type = message_type;
	}
	public boolean isIs_unicode() {
		return is_unicode;
	}
	public void setIs_unicode(boolean is_unicode) {
		this.is_unicode = is_unicode;
	}
	public Date getQueue_time() {
		return queue_time;
	}
	public void setQueue_time(Date queue_time) {
		this.queue_time = queue_time;
	}
	public Date getSent_time() {
		return sent_time;
	}
	public void setSent_time(Date sent_time) {
		this.sent_time = sent_time;
	}
	public Date getDelivery_time() {
		return delivery_time;
	}
	public void setDelivery_time(Date delivery_time) {
		this.delivery_time = delivery_time;
	}
	public long getMessage_id() {
		return message_id;
	}
	public void setMessage_id(long message_id) {
		this.message_id = message_id;
	}
	public long getClient_sms_no() {
		return client_sms_no;
	}
	public void setClient_sms_no(long client_sms_no) {
		this.client_sms_no = client_sms_no;
	}
	public String getDelivery_status() {
		return delivery_status;
	}
	public void setDelivery_status(String delivery_status) {
		this.delivery_status = delivery_status;
	}
	public String getSms_type() {
		return sms_type;
	}
	public void setSms_type(String sms_type) {
		this.sms_type = sms_type;
	}
	public String getTotal_sms() {
		return total_sms;
	}
	public void setTotal_sms(String total_sms) {
		this.total_sms = total_sms;
	}
	public String getTotal_sms_units() {
		return total_sms_units;
	}
	public void setTotal_sms_units(String total_sms_units) {
		this.total_sms_units = total_sms_units;
	}
	public double getTotal_charge_per_unit() {
		return total_charge_per_unit;
	}
	public void setTotal_charge_per_unit(double total_charge_per_unit) {
		this.total_charge_per_unit = total_charge_per_unit;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getReason_for_not_delivered() {
		return reason_for_not_delivered;
	}
	public void setReason_for_not_delivered(String reason_for_not_delivered) {
		this.reason_for_not_delivered = reason_for_not_delivered;
	}
	public String getDescription_of_reason() {
		return description_of_reason;
	}
	public void setDescription_of_reason(String description_of_reason) {
		this.description_of_reason = description_of_reason;
	}
	public String getSender_id() {
		return sender_id;
	}
	public void setSender_id(String sender_id) {
		this.sender_id = sender_id;
	}
	public String getGroup_name() {
		return group_name;
	}
	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public long getVender_id() {
		return vender_id;
	}
	public void setVender_id(long vender_id) {
		this.vender_id = vender_id;
	}
}