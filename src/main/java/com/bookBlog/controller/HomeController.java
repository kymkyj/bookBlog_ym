package com.bookBlog.controller;

import com.bookBlog.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    private BoardService boardService;

    @RequestMapping("/")
    public String Home(Model model){
//        List<BoardVO> selectList = boardService.selectList();
//        model.addAttribute("selectList", selectList);

        return "login";
    }
}
