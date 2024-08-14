package com.gk.study.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gk.study.entity.Thing;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ThingMapper extends BaseMapper<Thing> {
//    List<Thing> getList();
//    boolean update(Thing thing);
}
