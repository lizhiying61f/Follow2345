package com.lzhiy.upms.entity;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

/***********************************************************************
 * @website ：
 * @creator : zhiyingli
 * @create-time : 2019/5/24
 * @email : lizhiying61f@gmail.com
 * @description : 权限相关更新记录表
 ***********************************************************************/
@Getter
@Setter
public class SysLog {
    private Integer id;
    private Integer type;
    private Integer targetId;
    private String oldValue;
    private String newValue;
    private String operator;
    private LocalDate operateTime;
    private String operateIp;
}
