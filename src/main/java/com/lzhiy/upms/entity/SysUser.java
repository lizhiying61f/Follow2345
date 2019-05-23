package com.lzhiy.upms.entity;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

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
