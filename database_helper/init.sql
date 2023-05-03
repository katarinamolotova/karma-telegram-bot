create table messages(
    id int,
    msg_id int not null,
    user_name varchar not null,
    user_id int not null,
    chat_id int not null
);

create table using_chat (
    id integer,
    chat_id integer
);