CREATE TABLE IF NOT EXISTS REPORT (
	id INT AUTO_INCREMENT PRIMARY KEY,
	name_surname VARCHAR(100),
	social_security_number VARCHAR(11),
	diagnosis VARCHAR(250),
	diagnosis_detail VARCHAR(250),
	date_of_Report datetime,
	Laborant VARCHAR(50),
	image VARBINARY(MAX)	
);
