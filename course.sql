create table courses(
courseId int not null auto_increment,
courseName varchar(255),
primary key (courseId));
select * from courses;
insert into courses (courseId,courseName)
values (4001,"mathematics");

insert into courses (courseName)
values ("english");
insert into courses (courseName)
values ("Science");
insert into courses (courseName)
values ("physics");
insert into courses (courseName)
values ("computers");
insert into courses (courseName)
values ("hindi");
insert into courses (courseName)
values ("history");
insert into courses (courseName)
values ("chemistry");
insert into courses (courseName)
values ("Economics");
insert into courses (courseName)
values ("Biology");
select * from courses;