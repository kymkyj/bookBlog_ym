package com.bookBlog.service;

import com.bookBlog.domain.BoardVO;

import java.util.List;

public interface BoardService {
    public List<BoardVO> selectList();
}
