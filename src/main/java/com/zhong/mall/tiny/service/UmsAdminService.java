package com.zhong.mall.tiny.service;

import com.zhong.mall.tiny.mbg.model.UmsAdmin;
import com.zhong.mall.tiny.mbg.model.UmsPermission;

import java.util.List;

/**
 * @author zlyj
 * @Date: 2020/1/10 11:26
 * @Description 用戶管理service
 * @Package com.zhong.mall.tiny.service
 */

public interface UmsAdminService {
    /**
     * 根据用户名获取后台管理员
     */
    UmsAdmin getAdminByUsername(String username);

    /**
     * 注册功能
     */
    UmsAdmin register(UmsAdmin umsAdminParam);

    /**
     * 登录功能
     * @param username 用户名
     * @param password 密码
     * @return 生成的JWT的token
     */
    String login(String username, String password);

    /**
     * 获取用户所有权限（包括角色权限和+-权限）
     */
    List<UmsPermission> getPermissionList(Long adminId);

    /**
     * 登出
     * @return
     */
    void logout();
}
