package com.bookBlog.mapper;

import com.bookBlog.domain.BoardVO;

import java.util.List;

public interface BoardMapper {
//    @Select("select * from tbl_board where bno > 0")
    public List<BoardVO> getList();
}
