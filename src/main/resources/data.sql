CREATE TABLE IF NOT EXISTS customer(
    id INTEGER IDENTITY PRIMARY KEY ,
    name varchar(100)
);
CREATE TABLE IF NOT EXISTS my_transaction(
    id INTEGER IDENTITY PRIMARY KEY ,
    description varchar(1000),
    total DOUBLE,
    save_date DATETIME,
    customer_id INTEGER
);
insert into customer(id, name) values (100, 'Customer 1');
insert into customer(id, name) values (101, 'Customer 2');
insert into customer(id, name) values (102, 'Customer 3');

insert into my_transaction(id, description, total, save_date, customer_id) values (111, 'Purchase 1', 100, '2020-10-25 10:20:10', 100);
insert into my_transaction(id, description, total, save_date, customer_id) values (112, 'Purchase 2', 50, '2020-10-24 10:20:10', 100);
insert into my_transaction(id, description, total, save_date, customer_id) values (113, 'Purchase 3', 120, '2020-10-24 10:20:10', 100);
insert into my_transaction(id, description, total, save_date, customer_id) values (114, 'Purchase 10', 175.32, '2020-10-26 10:20:10', 100);
insert into my_transaction(id, description, total, save_date, customer_id) values (115, 'Purchase 20', 65.75, '2020-10-26 10:20:10', 100);
insert into my_transaction(id, description, total, save_date, customer_id) values (116, 'Purchase 30', 210.50, '2020-10-26 10:20:10', 100);
insert into my_transaction(id, description, total, save_date, customer_id) values (117, 'Purchase 31', 42.80, '2020-10-25 17:10:10', 100);

insert into my_transaction(id, description, total, save_date, customer_id) values (118, 'Purchase 200', 25.60, '2020-10-17 12:20:10', 102);
insert into my_transaction(id, description, total, save_date, customer_id) values (120, 'Purchase 201', 80.50, '2020-10-19 15:00:10', 102);
insert into my_transaction(id, description, total, save_date, customer_id) values (122, 'Purchase 202', 116.14, '2020-10-22 11:30:10', 102);

insert into my_transaction(id, description, total, save_date, customer_id) values (102, 'Purchase 5', 200, '2020-10-24 10:20:10', 101);