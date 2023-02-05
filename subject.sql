drop table subject;
create table subject( 
					subId int auto_increment primary key,
                    subName varchar(255),
                    profId int,
                    foreign key (profId) references professor(id));
select * from subject;
insert into subject(subId,subName,profId) 
values(2001,"English",1003);
insert into subject(subName,profId) 
values("Hindi",1007);

insert into subject(subName,profId) 
values("Science",1004);

insert into subject(subName,profId) 
values("physics",1001);

insert into subject(subName,profId) 
values("chemistry",1001);

insert into subject(subName,profId) 
values("History",1003);

insert into subject(subName,profId) 
values("Geography",1003);

insert into subject(subName,profId) 
values("Economics",1002);

insert into subject(subName,profId) 
values("Civics",1009);

insert into subject(subName,profId) 
values("Sociology",1010);

select * from subject;

select profName,subName from professor as p , subject as s 
where s.profId=p.id;
select * from dual;
