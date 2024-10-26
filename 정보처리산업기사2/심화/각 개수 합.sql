select grade, city, count(*)
from member_tbl_02
group by rollup(grade, city)
order by grade asc;
