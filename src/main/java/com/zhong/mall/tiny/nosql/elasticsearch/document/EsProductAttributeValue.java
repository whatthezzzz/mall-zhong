package com.zhong.mall.tiny.nosql.elasticsearch.document;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;
/**
 * @author zlyj
 * @Date: 2020/1/15 16:14
 * @Description 搜索商品中的属性
 * @Package com.zhong.mall.tiny.nosql.elasticsearch.document
 */
@Data
public class EsProductAttributeValue implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private Long productAttributeId;
    //属性值
    @Field(type = FieldType.Keyword)
    private String value;
    //属性参数：0->规格；1->参数
    private Integer type;
    //属性名称
    @Field(type=FieldType.Keyword)
    private String name;

}
