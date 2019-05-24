package com.lzhiy.upms.entity;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

/***********************************************************************
 * @website ：
 * @creator : zhiyingli
 * @create-time : 2019/5/24
 * @email : lizhiying61f@gmail.com
 * @description : 人员角色表
 ***********************************************************************/
@Getter
@Setter
public class SysRoleUser {
    private Integer id;
    private Integer roleId;
    private Integer userId;
    private String operator;
    private LocalDate operateTime;
    private String operateIp;
}
