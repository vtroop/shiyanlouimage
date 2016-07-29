package com.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Evilina on 2016/7/29.
 */
@RequestMapping("/test")
@Controller
public class HelloWorld {

    private final String SUCCESS = "success";
    /*
    * 1.使用RequsetMapping映射请求的url
    * 2.返回值解析成物理视图
    *  */
    @RequestMapping("/hello")
    public String hello() {
        System.out.println("hello world");
        return "success";
    }

    @RequestMapping(value = "/hello_post",method = RequestMethod.POST)
    public String helloPost() {
        System.out.println("post");
        return SUCCESS;
    }

    @RequestMapping(value = "/rest/{id}",method = RequestMethod.GET)
    public String helloRest(@PathVariable Integer id) {
        System.out.println("testRest get"+id );
        return SUCCESS;
    }
}

