package com.solarwind.controller;

import com.solarwind.SnowService;
import com.solarwind.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author Zhongyang MA
 * @Date Dec/10/2020
 */
@RestController
@RequestMapping(value = "/api")
public class SnowController {

    @Autowired
    private SnowService snowService;

    @RequestMapping(method = RequestMethod.GET, value = "/users")
    public List<User> getUsers() {

        User user1 = new User();
        user1.setName("Stephen Hawking");
        user1.setGender("Male");
        user1.setOccupation("Scientist");

        User user2 = new User();
        user2.setName("Donald Trump");
        user2.setGender("Male");
        user2.setOccupation("President of the US");

        List list = new ArrayList();
        list.add(user1);
        list.add(user2);
        System.out.println(list);
        System.out.println(snowService.getConfigValue());

        return list;
    }

}
