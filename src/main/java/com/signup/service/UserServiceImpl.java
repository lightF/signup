package com.signup.service;

import com.signup.dao.UserDAO;
import com.signup.model.UserVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Inject
	private UserDAO userDAO;

	/*@Autowired
	private UserMapper userMapper;*/

	@Override
	public List<UserVO> getUserList() throws Exception {
		// TODO Auto-generated method stub
		return userDAO.getUserList();
	}

	@Override
	public UserVO getUserInfo(String uid) throws Exception {
		// TODO Auto-generated method stub
		return userDAO.getUserInfo(uid);
	}

	@Override
	public void insertUser(UserVO userVO) throws Exception {
		// TODO Auto-generated method stub
		userDAO.insertUser(userVO);
		
	}

	@Override
	public void updateUser(UserVO userVO) throws Exception {
		// TODO Auto-generated method stub
		userDAO.updateUser(userVO);
		
	}

	@Override
	public void deleteUser(String uid) throws Exception {
		// TODO Auto-generated method stub
		userDAO.deleteUser(uid);
		
	}

}
