package com.lzhiy.upms.entity;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SysDept {
    private Integer id;
    private String name;
    private String level;//当前部门所处层级
    private Integer seq;//部门在当前层级的排序
    private String remark;
    private Integer parentId;
    private String operator;
    private LocalDate operateTime;
    private String operateIp;
}
