package com.ydproject.mapper;

import com.ydproject.entity.Costomer;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;


public interface CostomerMapper {


    Costomer selectById(@Param("id") String id);

    List<Costomer> selectByVid(@Param("id") Integer vid);
}
