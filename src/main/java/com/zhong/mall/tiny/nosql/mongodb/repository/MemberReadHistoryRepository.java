package com.zhong.mall.tiny.nosql.mongodb.repository;


import com.zhong.mall.tiny.nosql.mongodb.document.MemberReadHistory;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author zlyj
 * @Date: 2020/1/15 16:14
 * @Description 会员商品浏览历史repository
 * @Package com.zhong.mall.tiny.nosql.elasticsearch.document
 */
public interface MemberReadHistoryRepository extends MongoRepository<MemberReadHistory,String> {
    /**
     * 根据会员id按时间倒序获取浏览记录
     * @param memberId 会员id
     */
    List<MemberReadHistory> findByMemberIdOrderByCreateTimeDesc(Long memberId);
}
