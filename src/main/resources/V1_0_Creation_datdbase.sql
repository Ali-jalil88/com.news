
create table authors(
id bigserial primary key,
first_name varchar(50),
last_name varchar(50)
);

create table news(
id bigserial primary key ,
author_id integer references authors(id) on delete set null,
title varchar (50),
short_text varchar (100),
full_text varchar (1000),
published_in date default CURRENT_DATE ,
created_in date default CURRENT_DATE
);

create table tags(
id bigserial primary key ,
news_id integer references news(id) on delete set null,
name varchar (50)
);

create table users (
id bigserial primary key ,
name varchar (50),
last_name varchar (50),
login varchar (255),
password varchar (255),
email varchar (50),
unique (email)
);

create table roles(
id integer references users (id) on delete  set null,
role varchar (50),
unique (id)
);
