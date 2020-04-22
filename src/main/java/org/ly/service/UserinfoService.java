package org.ly.service;

import com.github.pagehelper.PageInfo;

import org.ly.pojo.Parames;
import org.ly.pojo.Userinfo;

import java.util.List;

/**
 * 底层接口
 */
public interface UserinfoService {
    public List<Userinfo> all();

    public int insert(Userinfo user);

    public int update(Userinfo user);

    public int delete(int id);

    public Userinfo findById(int id);

    //分页
    public PageInfo<Userinfo> getPageInfo(Parames parames);


    //分页根据条件查找
    public PageInfo<Userinfo>  findName(Userinfo userinfo, Parames parames);
}
