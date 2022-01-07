DROP TABLE IF EXISTS child;
DROP TABLE IF EXISTS application;
DROP TABLE IF EXISTS passport_office;
DROP TABLE IF EXISTS register_office;
DROP TABLE IF EXISTS street;
DROP TABLE IF EXISTS country_structure;

CREATE TABLE country_structure (
	id char(12) not null primary key,
	name varchar(255)
);

CREATE TABLE street (
	code integer primary key,
	name varchar(255)
);

CREATE TABLE passport_office (
	id serial primary key,
	name varchar(255),
	area char(12) not null references country_structure(id)	
);

CREATE TABLE register_office (
	id serial primary key,
	name varchar(255),
	area char(12) not null references country_structure(id)
);

CREATE TABLE application (
	id serial primary key,

	husband_surname varchar(255) not null,
	husband_givename varchar(255) not null,
	husband_patronymicname varchar(255) not null,
	husband_datebirth date not null,

	husband_passportseria varchar(10) not null,
	husband_passportnumber varchar(10) not null,
	husband_passportdate date not null,
	husband_passportoffice_id integer references passport_office(id),

	husband_postindex varchar(10),
	husband_streetcode integer not null references street(code),
	husband_building varchar(10) not null,
	husband_extention varchar(10),
	husband_apartment varchar(10),

	wife_surname varchar(255) not null,
	wife_givename varchar(255) not null,
	wife_patronymicname varchar(255) not null,
	wife_datebirth date not null,

	wife_passportseria varchar(10) not null,
	wife_passportnumber varchar(10) not null,
	wife_passportdate date not null,
	wife_passportoffice_id integer references passport_office(id),

	wife_postindex varchar(10),
	wife_streetcode integer not null references street(code),
	wife_building varchar(10) not null,
	wife_extention varchar(10),
	wife_apartment varchar(10),

	certificate_id varchar(10) not null,
	register_office_id integer not null references register_office(id),
	marriage_date date not null
);

CREATE TABLE child (
	id serial primary key,
	order_id integer not null references application(id),

	child_surname varchar(255) not null,
	child_givename varchar(255) not null,
	child_patronymicname varchar(255) not null,
	child_datebirth date not null,

	child_certificatenumber varchar(10) not null,
	child_certificatedate date not null,
	child_registeroffice_id integer references register_office(id),

	child_postindex varchar(10),
	child_streetcode integer not null references street(code),
	child_building varchar(10) not null,
	child_extention varchar(10),
	child_apartment varchar(10)
);