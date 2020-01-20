//创建超级用户  
CREATE ROLE liuxiao superuser PASSWORD 'liuxiao' login;  
//创建用户  
create user username with password 'pwd';  
grant all on database dbname to username;