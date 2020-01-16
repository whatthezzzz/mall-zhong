package com.zhong.mall.tiny.service;

import com.zhong.mall.tiny.nosql.mongodb.document.MemberReadHistory;

import java.util.List;

/**
 * @author zlyj
 * @Date: 2020/1/16 14:13
 * @Description 会员浏览记录管理Service
 * @Package com.zhong.mall.tiny.service
 */
public interface MemberReadHistoryService {
    /**
     * 生成浏览记录
     */
    int create(MemberReadHistory memberReadHistory);

    /**
     * 批量删除浏览记录
     */
    int delete(List<String> ids);

    /**
     * 获取用户浏览历史记录
     */
    List<MemberReadHistory> list(Long memberId);
}
