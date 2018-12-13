CREATE TABLE department (
  id   INTEGER PRIMARY KEY,
  name VARCHAR(30)
);

CREATE TABLE employee (
  id INTEGER PRIMARY KEY,
  name varchar(45) DEFAULT NULL,
  last_name varchar(45) DEFAULT NULL,
  id_department int(11) DEFAULT NULL,
  CONSTRAINT fk_empleado_dpt FOREIGN KEY (id_department) REFERENCES department (id) ON DELETE NO ACTION ON UPDATE NO ACTION
);

insert into department VALUES(-1, 'human resources');
insert into department VALUES(-2, 'development');
insert into department VALUES(-3, 'quality assurance');

insert into employee VALUES(-1, 'jhon', 'doe', -1);
insert into employee VALUES(-2, 'peter', 'parker', -1);
insert into employee VALUES(-3, 'tony', 'stark', -2);
insert into employee VALUES(-4, 'thork', 'ragnarok', -2);

insert into employee VALUES(-5, 'steve', 'rogers', -3);
insert into employee VALUES(-6, 'hannibal', 'lecter', -3);
