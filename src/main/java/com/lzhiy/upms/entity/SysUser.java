package com.lzhiy.upms.entity;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
/***********************************************************************
 * @website ：
 * @creator : zhiyingli
 * @create-time : 2019/5/23
 * @email : lizhiying61f@gmail.com
 * @description :
 ***********************************************************************/
@Getter
@Setter
public class SysUser {
    private Integer id;
    private String username;
    private String telephone;
    private String mail;
    private String password;
    private String remark;
    private Integer deptId;
    private Integer status;
    private String operator;
    private LocalDate operateTime;
    private String operateIp;
}
