# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table ss_config (
  id                            bigint auto_increment not null,
  key                           varchar(255),
  value                         varchar(255),
  constraint pk_ss_config primary key (id)
);

create table invite_code (
  id                            bigint auto_increment not null,
  code                          varchar(255),
  user_id                       integer,
  constraint pk_invite_code primary key (id)
);

create table log (
  id                            bigint auto_increment not null,
  type                          varchar(255),
  msg                           varchar(255),
  constraint pk_log primary key (id)
);

create table node (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  type                          varchar(255),
  server                        varchar(255),
  method                        varchar(255),
  custom_method                 varchar(255),
  traffic_rate                  double,
  info                          varchar(255),
  status                        varchar(255),
  offset                        integer,
  sort                          integer,
  constraint pk_node primary key (id)
);

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

drop table if exists ss_config;

drop table if exists invite_code;

drop table if exists log;

drop table if exists node;

drop table if exists task;

drop table if exists user;

