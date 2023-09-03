drop database if exists portfolio;
create database portfolio;
use portfolio;

#직급 테이블
drop table if exists companyLevel;
create table companyLevel( 
	clevel int auto_increment not null ,
	cname varchar(10) not null,
	primary key (clevel) 
);
insert into companyLevel(cname) values('사원');
insert into companyLevel(cname) values('주임');
insert into companyLevel(cname) values('대리');
insert into companyLevel(cname) values('과장');
insert into companyLevel(cname) values('팀장');
insert into companyLevel(cname) values('부장');
insert into companyLevel(cname) values('사장');

select * from companyLevel;

#회원 테이블
drop table if exists memberlist;
create table memberlist( mno int auto_increment not null, 
	mcategory varchar(10) not null, 
    mname varchar(10) not null, 
    mid varchar(10) not null unique, 
    mpw varchar(15) not null,
	primary key (mno) ,
    clevel int,
    foreign key (clevel) references companyLevel(clevel)
);

#제품 카테고리목록
drop table if exists category;
create table category (
	cno int auto_increment not null, 
    cname varchar(20) not null unique ,
    cprice int not null,
    primary key(cno) 
);

#제품 컬러
drop table if exists color;
create table color (
	colorno int auto_increment not null,
    colorname varchar(10) not null unique ,
    primary key(colorno)
);

#제품 사이즈
drop table if exists size;
create table size (
	sno int auto_increment not null, 
    ssize varchar(15) not null unique,
    primary key(sno)
);

#재고 목록
drop table if exists stock;
create table stock (
	scode varchar(10) unique not null,
    scount int default 0 not null,
    primary key(scode),
    cno int , 
    foreign key(cno) references category(cno) ,
    colorno int , 
    foreign key(colorno) references color(colorno) ,
    sno int , 
    foreign key(sno) references size(sno) ,
    mno int ,
    foreign key(mno) references memberlist(mno)
);