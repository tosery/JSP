DROP TABLE member;
CREATE TABLE member(
	id VARCHAR(10) NOT NULL,
	password VARCHAR(20) NOT NULL,
	name VARCHAR(20) NOT NULL,
	gender VARCHAR(20) NOT NULL,
	birth VARCHAR(10),
   	mail VARCHAR(30),
	phone VARCHAR(20),
	address VARCHAR(90),
	regist_day VARCHAR(50),
	PRIMARY KEY (id)
);