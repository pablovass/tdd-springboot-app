package com.pablovass.service;

import com.fasterxml.jackson.databind.ObjectMapper;
//import com.pablovass.ApplicationTests;
import com.pablovass.ApplicationTests;
import com.pablovass.dao.UserRepository;
import com.pablovass.model.User;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.jupiter.api.Assertions.*;


import java.util.List;

public class UserServiceTest extends ApplicationTests {
    @InjectMocks
    @Autowired
    private UserServiceImpl userService;
    @InjectMocks
    @Autowired
   static UserRepository userRepository;

    @BeforeAll
    static public void saveUser() {


        String userList = "[{\n" +
                "\t\"name\" : \"Bhanuka\",\n" +
                "\t\"age\" : \"27\",\n" +
                "\t\"gender\": \"Male\",\n" +
                "\t\"country\" : \"Srilanka\"\n" +
                "},{\n" +
                "\t\"name\" : \"Ravindu\",\n" +
                "\t\"age\" : \"28\",\n" +
                "\t\"gender\": \"Male\",\n" +
                "\t\"country\" : \"India/**/\"\n" +
                "}]";


        try {
            User user[] = new ObjectMapper().readValue(userList, User[].class);

            for (User users1 : user) {
            userRepository.save(users1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void saveTest1() throws Exception{
        String user = "{\n" +
                "\t\"name\" : \"Sajith\",\n" +
                "\t\"age\" : \"27\",\n" +
                "\t\"gender\": \"Male\",\n" +
                "\t\"country\" : \"Srilanka\"\n" +
                "}";
        User user1=new ObjectMapper().readValue(user,User.class);
        userService.save(user1);

        assertEquals(2, userService.search().size());

    }

    @Test
    public void searchTest2() {
        List<User> user = userService.search();

        assertTrue("Bhanuka".equals(user.get(0).getName()));

    }

}
