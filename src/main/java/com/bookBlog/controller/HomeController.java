package com.bookBlog.controller;

import com.bookBlog.domain.BoardVO;
import com.bookBlog.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private BoardService boardService;

    @RequestMapping("/")
    public String Home(Model model){
        System.out.println("1111");
        List<BoardVO> selectList = boardService.selectList();
        System.out.println("selectList :"+selectList);
        model.addAttribute("selectList", selectList);

        return "login";
    }
}
