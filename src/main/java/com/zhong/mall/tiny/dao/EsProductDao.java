package com.zhong.mall.tiny.dao;

import com.zhong.mall.tiny.nosql.elasticsearch.document.EsProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface EsProductDao {
    List<EsProduct> getAllEsProductList(@Param("id") Long id);
}
