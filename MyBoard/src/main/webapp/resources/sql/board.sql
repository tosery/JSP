drop table board;
CREATE TABLE board (
       num number not null,
       id varchar(10) not null,
       name varchar(10) not null,
       subject varchar(100) not null,
       content varchar(1000) not null,
       regist_day varchar(30),
       hit number,
       ip varchar(20),
       PRIMARY KEY (num)
);

select * from board;
desc board;
drop table board;
