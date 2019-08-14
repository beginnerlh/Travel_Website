package cn.lh.travel.service;

import cn.lh.travel.domain.Category;

import java.util.List;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019/7/17
 * Time:16:20
 */
public interface CategoryService {
    List<Category> findAll();
}
