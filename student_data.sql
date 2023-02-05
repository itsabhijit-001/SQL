create table student(
id int not null auto_increment,
name varchar(255),
age int,
address varchar(255),
courseId int not null,
primary key (id),
foreign key (courseId) references courses(courseId));

select * from student;

insert into student (id,name,age,address,courseId)
values (1001,"Abhijit",21,"Durgapur",4004);
insert into student (name,age,address,courseId)
values ("Rohit",22,"Kolkata",4002);
insert into student (name,age,address,courseId)
values ("Aman",23,"Delhi",4008);
insert into student (name,age,address,courseId)
values ("Ronit",32,"Mumbai",4009);
insert into student (name,age,address,courseId)
values ("Rahul",42,"Chennai",4007);
insert into student (name,age,address,courseId)
values ("Manoj",20,"London",4010);
insert into student (name,age,address,courseId)
values ("Nishant",35,"Noida",4005);
insert into student (name,age,address,courseId)
values ("Pranit",27,"Delhi",4006);
insert into student (name,age,address,courseId)
values ("Samar",29,"Kolkata",4009);
insert into student (name,age,address,courseId)
values ("Sameer",54,"Kolkata",4001);
select * from student;