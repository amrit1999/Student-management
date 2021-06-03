# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table students (
  id                            integer auto_increment not null,
  name                          varchar(255),
  age                           integer,
  branch                        varchar(255),
  marks                         integer,
  constraint pk_students primary key (id)
);


# --- !Downs

drop table if exists students;

