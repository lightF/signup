package com.signup.dao;

import com.signup.model.UserVO;

import java.util.List;

public interface UserDAO {
	public List<UserVO> getUserList() throws Exception;

	public UserVO getUserInfo(String uid) throws Exception;

	public int insertUser(UserVO userVO) throws Exception;

	public int updateUser(UserVO userVO) throws Exception;

	public int deleteUser(String uid) throws Exception;

}

