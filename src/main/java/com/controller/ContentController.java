package com.controller;

import com.entity.ContentEntity;
import com.gen.entity.Content;
import com.gen.entity.ContentDetailedWithBLOBs;
import com.gen.mapper.ContentDetailedMapper;
import com.service.ContentService;
import com.service.NewContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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
    private NewContentService newContentService;

    @Autowired
    private ContentDetailedMapper contentDetailedMapper;

    @RequestMapping(value = "/query/{id}")
    public ModelAndView query(@PathVariable int id) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        Content contentEntities = newContentService.selectByPrimaryKey(id);
        modelAndView.addObject("contentEntities", contentEntities);
        modelAndView.setViewName("content/queryContentResult");
        return modelAndView;
    }

    @RequestMapping(value = "/edit",method = {RequestMethod.POST,RequestMethod.GET})
    public String edit(Model model, @RequestParam(value = "id")Integer id) {

        model.addAttribute("test", "test");

        return "edit";
    }

    @RequestMapping(value = "/querycontentdetail/{id}")
    public String queryContentDetail(Model model, @PathVariable int id) {

        ContentDetailedWithBLOBs contentDetailedWithBLOBs = contentDetailedMapper.selectByPrimaryKey(id);
        model.addAttribute("detail", contentDetailedWithBLOBs);
        return "content/queryContentDetailResult";
    }
}
