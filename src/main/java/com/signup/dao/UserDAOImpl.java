package com.signup.dao;

import com.signup.model.UserVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

	@Inject
	private SqlSession SqlSession;
	
	@Override
	public List<UserVO> getUserList() throws Exception {
		return SqlSession.selectList("com.signup.mapper.UserMapper.getUserList");
	}

	@Override
	public UserVO getUserInfo(String uid) throws Exception {
		return SqlSession.selectOne("com.signup.UserMapper.getUserInfo",uid);
	}

	@Override
	public int insertUser(UserVO userVO) throws Exception {
		return SqlSession.insert("com.signup.UserMapper.insertUser",userVO);
	}

	@Override
	public int updateUser(UserVO userVO) throws Exception {
		return SqlSession.update("com.signup.UserMapper.updateUser",userVO);
	}

	@Override
	public int deleteUser(String uid) throws Exception {
		return SqlSession.delete("com.signup.UserMapper.deleteUser",uid);
	}
	

}
