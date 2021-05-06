# OneToMany_Hibernate_Mapping


OneToMany_Hibernate_Mapping


mysql> show tables;
+-----------------------------+
| Tables_in_hibernate_mapping |
+-----------------------------+
| laptop                      |
| student                     |
| student_laptop              |
+-----------------------------+
3 rows in set (0.00 sec)

mysql> select * from laptop;
+-----------+-------------+
| laptop_id | laptop_name |
+-----------+-------------+
|     51231 | Asus        |
|     51232 | Dell        |
|     51233 | HP          |
|     51234 | Acer        |
|     51235 | Lenovo      |
+-----------+-------------+
5 rows in set (0.00 sec)

mysql> select * from student;
+--------+-------+-------+
| rollno | marks | name  |
+--------+-------+-------+
|    101 |    50 | Rahul |
|    102 |    50 | Ankit |
+--------+-------+-------+
2 rows in set (0.00 sec)


// This table Represent OneToMany relationship between Student and Laptop
where one student have many laptops
mysql> select * from student_laptop;
+----------------+--------------------+
| Student_rollno | lap_list_laptop_id |
+----------------+--------------------+
|            101 |              51231 |
|            101 |              51232 |
|            102 |              51233 |
|            102 |              51234 |
|            102 |              51235 |
+----------------+--------------------+
5 rows in set (0.00 sec)
