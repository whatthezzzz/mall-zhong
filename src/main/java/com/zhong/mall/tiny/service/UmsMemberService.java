package com.zhong.mall.tiny.service;

import com.zhong.mall.tiny.common.api.CommonResult;

/**
 * @author zlyj
 * @Date: 2020/1/9 15:28
 * @Description 会员管理
 * @Package com.zhong.mall.tiny.service
 */
public interface UmsMemberService {
    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String authCode);
}
