--전체 학생 정보 조회
select * from STUDENT;

select s.std_no, s.std_name, m.major_name, s.std_score from student s, major m
where s.major_no = m.major_no and s.std_no = ?;