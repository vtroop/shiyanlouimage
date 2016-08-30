package com.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Evilina on 2016/7/29.
 */
public class HelloController implements Controller {
    private ModelAndView modelAndView;

    /**
     * 这个是在dispatcherServlet.xml里进行映射的，
     * 映射的url是"/hi"
     * 目标返回是modelandview可以包含
     * springmvc会把modelandview中的model中数据放入到request域对象中
     * @param httpServletRequest
     * @param httpServletResponse
     * @return
     * @throws Exception
     */
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        modelAndView = new ModelAndView();
        //向modelandview放置数据
        modelAndView.addObject("message", "hi2");
        //创建视图名
        modelAndView.setViewName("hi");
        return modelAndView;
    }
}
