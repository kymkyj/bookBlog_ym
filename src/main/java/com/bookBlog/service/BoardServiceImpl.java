package com.bookBlog.service;

import com.bookBlog.domain.BoardVO;
import com.bookBlog.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("boardService")
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardMapper boardMapper;

    public List<BoardVO> selectList(){
        return boardMapper.getList();
    }
}
