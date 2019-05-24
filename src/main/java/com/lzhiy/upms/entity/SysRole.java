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
public class SysRole {
    private Integer id;
    private String name;
    private Integer type;
    private Integer status;
    private String remark;
    private String operator;
    private LocalDate operateTime;
    private String operateIp;
}
