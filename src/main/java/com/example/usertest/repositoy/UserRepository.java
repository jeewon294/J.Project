package com.example.usertest.repositoy;

import com.example.usertest.dto.UserDTO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class UserRepository {
    //db연동하는 코드... !
    //JAP
    static public ArrayList<UserDTO> users;

    static {
        users = new ArrayList<>();
        users.add(new UserDTO("kang","test1","1234"));
        users.add(new UserDTO("park","test2","1234"));
        users.add(new UserDTO("kim","test3","1234"));
    }

}
