package com.ydproject.mapper;

import com.ydproject.entity.VipLevel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

// 注解将该接口注册为bean组件
//@Component
public interface VipLevelMapper {

    VipLevel selectById(@Param("id") Integer id);

    List<VipLevel> selectAll();
}
