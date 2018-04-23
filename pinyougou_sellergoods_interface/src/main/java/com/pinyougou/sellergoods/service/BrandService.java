package com.pinyougou.sellergoods.service;

import com.pinyougou.entity.PageResult;
import com.pinyougou.pojo.TbBrand;

import java.util.List;

public interface BrandService {
    public List<TbBrand> findAll();

    //品牌分页查询
    public PageResult findPage(int pageNum,int pageSize);

    public void add(TbBrand brand);
}
