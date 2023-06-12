--전체 학생 정보 조회
select * from STUDENT;

select s.std_no, s.std_name, m.major_name, s.std_score from student s, major m
where s.major_no = m.major_no and s.std_no = ?;

--학생정보 등록
insert into STUDENT values(?,?,?,(select major_no from major where major_name = ?));

select * from MAJOR;