package com.signup.mapper;

import com.signup.model.UserVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<UserVO> getUserList();

    UserVO getUserInfo(String uid);

    void insertUser(UserVO userVO);

    void updateUser(UserVO userVO);

    void deleteUser(String uid);
}
