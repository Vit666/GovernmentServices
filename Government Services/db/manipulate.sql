DELETE FROM passport_office;
DELETE FROM register_office;
DELETE FROM country_structure;

INSERT INTO country_structure (id, name) values 
	('011001000001', 'New York'),
	('021002000001', 'Los Angeles'),
	('031003000001', 'Chikago'),
	('041004000001', 'Houston');

INSERT INTO passport_office (name, area) values 
	('passport_office1', '011001000001'),
	('passport_office2', '011001000001'),
	('passport_office3', '041004000001'),
	('passport_office4', '021002000001'),
	('passport_office5', '031003000001'),
	('passport_office6', '011001000001'),
	('passport_office7', '011001000001'),
	('passport_office8', '041004000001'),
	('passport_office9', '041004000001');

INSERT INTO register_office (name, area) values 
	('register_office1', '041004000001'),
	('register_office2', '041004000001'),
	('register_office3', '011001000001'),
	('register_office4', '021002000001'),
	('register_office5', '031003000001'),
	('register_office6', '021002000001'),
	('register_office7', '011001000001'),
	('register_office8', '021002000001'),
	('register_office9', '031003000001');	