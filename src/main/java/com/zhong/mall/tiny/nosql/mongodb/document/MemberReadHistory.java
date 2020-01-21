package com.zhong.mall.tiny.nosql.mongodb.document;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * @author zlyj
 * @Date: 2020/1/15 16:14
 * @Description 用户商品浏览历史记录
 * @Package com.zhong.mall.tiny.nosql.elasticsearch.document
 */
@Data
@Document
public class MemberReadHistory {
    @Id
    private String id;

    private Long memberId;
    private String memberNickname;
    private String memberIcon;

    private Long productId;
    private String productName;
    private String productPic;
    private String productSubTitle;
    private String productPrice;
    private Date createTime;
}
