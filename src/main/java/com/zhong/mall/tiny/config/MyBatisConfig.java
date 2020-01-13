package com.zhong.mall.tiny.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author zlyj
 * @Date: 2020/1/10 9:38
 * @Description MyBatis配置类
 * @Package com.zhong.mall.tiny.config
 */
@Configuration
@MapperScan({"com.zhong.mall.tiny.mbg.mapper","com.zhong.mall.tiny.dao"})
public class MyBatisConfig {
}
