package cn.lh.travel.dao;

import cn.lh.travel.domain.Category;

import java.util.List;


public interface CategoryDao {
    List<Category> findAll();
}
