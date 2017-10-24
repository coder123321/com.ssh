package com.ssh.controller;

import com.ssh.entity.Person;
import com.ssh.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;


@Controller
public class TestController {
    @Resource
    private TestService testService;
    @RequestMapping("/test")
    public String test(){
//        实际返回的是views/test.jsp ,spring-mvc.xml中配置过前后缀
        return "test";
    }

    @RequestMapping("/springtest")
    public String springTest(){
        return testService.test();
    }

    @RequestMapping("/savePerson")
    public String savePerson(){
        Person p = new Person();
        p.setId(1);
        p.setAge(10);
        p.setName("abc");
        p.setSex("women");
        Integer a = testService.savePerson(p);
        return "success";
    }

}
