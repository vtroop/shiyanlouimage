package com.controller;

import com.entity.ContentEntity;
import com.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Evilina on 2016/8/23.
 */
@Controller
@RequestMapping(value = "/content")
public class ContentController {
    @Autowired
    private ContentService contentServiceImpl;

    @RequestMapping(value = "/query")
    public ModelAndView query() throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        List<ContentEntity> contentEntities = contentServiceImpl.findContentByName(null);
        modelAndView.addObject("contentEntities", contentEntities);
        modelAndView.setViewName("content/contentList");
        return modelAndView;
    }

    @RequestMapping(value = "/edit",method = {RequestMethod.POST,RequestMethod.GET})
    public String edit(Model model, @RequestParam(value = "id")Integer id) {

        model.addAttribute("test", "test");

        return "edit";
    }
}
