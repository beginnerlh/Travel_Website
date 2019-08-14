package cn.lh.travel.dao;

import cn.lh.travel.domain.RouteImg;

import java.util.List;


public interface RouteImgDao {
    List<RouteImg> findByRid(int id);
}
