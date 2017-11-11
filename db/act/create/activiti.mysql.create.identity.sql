create table act_id_group (
    id_ varchar(64),
    rev_ integer,
    name_ varchar(255),
    type_ varchar(255),
    primary key (id_)
) engine=innodb default charset=utf8 collate utf8_bin;

create table act_id_membership (
    user_id_ varchar(64),
    group_id_ varchar(64),
    primary key (user_id_, group_id_)
) engine=innodb default charset=utf8 collate utf8_bin;

create table act_id_user (
    id_ varchar(64),
    rev_ integer,
    first_ varchar(255),
    last_ varchar(255),
    email_ varchar(255),
    pwd_ varchar(255),
    picture_id_ varchar(64),
    primary key (id_)
) engine=innodb default charset=utf8 collate utf8_bin;

create table act_id_info (
    id_ varchar(64),
    rev_ integer,
    user_id_ varchar(64),
    type_ varchar(64),
    key_ varchar(255),
    value_ varchar(255),
    password_ longblob,
    parent_id_ varchar(255),
    primary key (id_)
) engine=innodb default charset=utf8 collate utf8_bin;

alter table act_id_membership
    add constraint act_fk_memb_group
    foreign key (group_id_)
    references act_id_group (id_);

alter table act_id_membership
    add constraint act_fk_memb_user
    foreign key (user_id_)
    references act_id_user (id_);
