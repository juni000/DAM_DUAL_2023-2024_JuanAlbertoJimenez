select * from mysql.user;
show grants for root@localhost;

create user "usuario1"@"localhost" identified by "pass123";
create user "usuario2@localhost" identified by "pass123";
grant all privileges on *.* to usuario1@localhost with grant option;
flush privileges;