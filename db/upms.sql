create table sys_dept(
  `id` int not null auto_increment,
  `name` varchar(20) not null comment '部门名称',
  `level` varchar(20) not null comment '部门层级',
  `seq` int not null comment '部门在当前层级的排序',
  `remark` varchar(36) ,
  `parent_id` int not null,
  `operator` varchar(20) not null comment '操作者',
  `operate_time` date not null comment '最后一次操作时间',
  `operate_ip` varchar(20) comment '最后一次操作的ip',
  primary key (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 comment '部门表';

create table sys_user(
  `id` int not null auto_increment,
  `username` varchar(20) not null ,
  `telephone` varchar(20) not null ,
  `mail` varchar(100) ,
  `password` varchar(32) not null ,
  `remark` varchar(100),
  `deptId` int ,
  `status` int ,
  `operator` varchar(20) not null comment '操作者',
  `operate_time` date not null comment '最后一次操作时间',
  `operate_ip` varchar(20) comment '最后一次操作的ip',
  primary key (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 comment '人员表';