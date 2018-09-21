create database Sesion;
use Sesion;
create table Usuario(
nombre varchar(50),
contraseña varchar(50)
);
insert into Usuario values('Fernando','Torres');
select * from Usuario