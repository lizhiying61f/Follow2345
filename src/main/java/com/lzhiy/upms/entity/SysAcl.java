package com.lzhiy.upms.entity;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SysAcl {
    private Integer id;
    private String code;
    private String name;
    private Integer aclModuleId;
    private String url;
    private Integer type;
    private Integer status;
    private Integer seq;
    private String remark;
    private String operator;
    private LocalDate operateTime;
    private String operateIp;
}
