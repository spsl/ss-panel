# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table task (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  pass_word                     varchar(255),
  done                          tinyint(1) default 0,
  due_date                      datetime(6),
  constraint pk_task primary key (id)
);

create table user (
  id                            bigint auto_increment not null,
  user_name                     varchar(255),
  email                         varchar(255),
  pass                          varchar(255),
  passwd                        varchar(255),
  t                             integer,
  u                             bigint,
  d                             bigint,
  transfer_enable               bigint,
  port                          integer,
  switch                        integer,
  enable                        integer,
  type                          integer,
  last_get_gift_time            integer,
  last_check_in_time            integer,
  last_rest_pass_time           integer,
  reg_date                      datetime(6),
  invite_num                    integer,
  is_admin                      integer,
  ref_by                        integer,
  expire_time                   integer,
  method                        varchar(255),
  is_email_verify               integer,
  reg_ip                        varchar(255),
  constraint pk_user primary key (id)
);


# --- !Downs

drop table if exists task;

drop table if exists user;

