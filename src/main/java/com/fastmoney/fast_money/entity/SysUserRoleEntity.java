package com.fastmoney.fast_money.entity;

/**
 * 系统用户角色表
 */
public class SysUserRoleEntity {
    /**
     * 主键
     */
    private Long id;
    /**
     * 角色ID
     */
    private Long role_id;
    /**
     * 用户ID
     */
    private Long user_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRole_id() {
        return role_id;
    }

    public void setRole_id(Long role_id) {
        this.role_id = role_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }
}
