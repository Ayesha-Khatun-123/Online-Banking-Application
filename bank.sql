use  onlinebankingapplication;

create table signup(formno varchar(20),name varchar(20),fname varchar(20),dob varchar(20),gender varchar(20),email varchar(40),marital varchar(20),address varchar(40),city varchar(20),pi varchar(20), state varchar(20));
create table signup2(formno varchar(20),religion varchar(20),category varchar(20),income varchar(20),education varchar(20),occupation varchar(40),seniorcitizen varchar(20),existingaccount varchar(40), adhar varchar(20),pan varchar(20));
create table signup3(formno varchar(20),accountType varchar(20),cardnumber varchar(20),pin varchar(20),facility varchar(20));
create table login(formno varchar(20),cardnumber varchar(20),pin varchar(20));
create table bank(pinnumber varchar(20),date varchar(40),type varchar(20),amount varchar(20));
show tables;

 
select * from signup;
select * from signup2;
select * from signup3; 
select * from bank;
select * from login;