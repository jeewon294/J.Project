package com.example.usertest.service;

import com.example.usertest.dto.UserDTO;
import com.example.usertest.repositoy.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    // 회원가입
    public UserDTO insertUser(UserDTO user){
        return userRepository.insertUser(user);
    }

    //모든 회원정보
    public List<UserDTO> getAllUsers(){
        return userRepository.getAllUsers();
    }

    //한명의 회원
    public UserDTO getUserByUserId(String userId){
        return userRepository.getUsersByUserId(userId);
    }

    //비밀번호 수정
    public void updateUserPw(String userId, UserDTO user){
        userRepository.updateUserPw(userId, user);
    }

    //정보 삭제제
    public void deleteUser(String userId){
        userRepository.deleteUser(userId);
    }
}
