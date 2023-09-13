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
create table memberlist( 
	mno int auto_increment not null, 
	mcategory varchar(10) not null, 
    mname varchar(10) not null, 
    mid varchar(10) not null unique, 
    mpw varchar(15) not null,
	primary key (mno) ,
    clevel int,
    foreign key (clevel) references companyLevel(clevel)
);
select * from memberlist;
# 회원가입 
insert memberlist(mcategory, mname , mid , mpw , clevel ) values('test','test','test','test',1);
insert memberlist(mcategory, mname , mid , mpw , clevel ) values('경영지원','김규리','admin','1234',6);

# 로그인
select * from memberlist where mid = 'test' and mpw = 'test';

#제품 카테고리목록
drop table if exists category;
create table category (
	cno int auto_increment not null, 
    cname varchar(20) not null unique ,
    cprice int not null,
    primary key(cno) 
);
#제품 카테고리 샘플
insert category(cname, cprice) values ('무지반팔티셔츠' , 15000);
insert category(cname, cprice) values ('프린트반팔티셔츠' , 29000);
insert category(cname, cprice) values ('옥스포드셔츠' , 42000);
insert category(cname, cprice) values ('린넨긴팔셔츠' , 35000);

select * from category order by cno asc;

#제품 컬러
drop table if exists color;
create table color (
	colorno int auto_increment not null,
    colorname varchar(10) not null unique ,
    primary key(colorno)
);
# 컬러 샘플
insert color(colorname) values('흰색');
insert color(colorname) values('검정');
insert color(colorname) values('빨강');
insert color(colorname) values('오렌지');
insert color(colorname) values('마린블루');
insert color(colorname) values('퍼플');

select * from color order by colorno asc;


#제품 사이즈
drop table if exists size;
create table size (
	sno int auto_increment not null, 
    ssize varchar(15) not null unique,
    primary key(sno)
);
#제품 샘플
insert size(ssize) values('85(xs)');
insert size(ssize) values('90(S)');
insert size(ssize) values('95(M)');
insert size(ssize) values('100(L)');
insert size(ssize) values('105(XL)');
insert size(ssize) values('110(2XL)');

select * from size order by sno asc;

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
#재고 샘플
insert stock(scode, scount ) values('AA001' , 100);
insert stock(scode, scount ) values('AA002' , 100);
insert stock(scode, scount ) values('AB001' , 100);
insert stock(scode, scount ) values('AB002' , 100);
insert stock(scode, scount , cno , colorno , sno , mno ) 
values('AC002' , 99 , 2 , 3 , 4 , 1 );

select * from stock;


