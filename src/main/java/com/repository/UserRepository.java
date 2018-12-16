package com.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.UserInfo;

/**
 * @author suganapa
 *
 */
@Repository
public interface UserRepository extends JpaRepository<UserInfo, UUID> {


	UserInfo findByEmailAddress(String emailAddress);

	UserInfo findByIdAndIsActiveTrue(String userId);
	
	List<UserInfo> findAll();

}

