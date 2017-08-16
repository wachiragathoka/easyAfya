/**
 * 
 */
package com.easydirect.easyafya.repo.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.easydirect.easyafya.model.EasyAfyaUsers;

/**
 * @author MGathoka
 *
 */
public interface EasyAfyaUserRepo extends CrudRepository<EasyAfyaUsers, Long>{



}
