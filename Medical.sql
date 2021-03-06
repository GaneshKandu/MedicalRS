
CREATE TABLE if not EXISTS Setting(
	Owner varchar NOT NULL,
	MediName varchar NOT NULL,
	Address varchar  NOT NULL,
	Tel varchar NOT NULL,
	DLN varchar NOT NULL,
	ST varchar NOT NULL,
	MUser varchar NOT NULL
);

CREATE TABLE if not EXISTS Orders(
	Product varchar NOT NULL,
	Package varchar NOT NULL,
	Quantity int NOT NULL,
	Containt varchar NOT NULL,
	Company varchar NOT NULL
);

CREATE TABLE if not EXISTS Prod2(
	Product varchar NOT NULL,
	DMF datetime NOT NULL,
	DOE datetime NOT NULL,
	Batch varchar NOT NULL,
	Package varchar NOT NULL,
	Quantity int NOT NULL,
	Price double NOT NULL,
	SID varchar NOT NULL,
	Date datetime NOT NULL
);

CREATE TABLE if not EXISTS Supp(
	SName varchar NOT NULL,
	SID varchar NOT NULL,
	SCont varchar NOT NULL,
	SEID varchar NOT NULL
);

CREATE TABLE if not EXISTS Prod1(
	Product varchar(500) NOT NULL,
	Containt varchar NOT NULL,
	Company varchar NOT NULL,
);

CREATE TABLE if not EXISTS Report(
	date smalldatetime NOT NULL,
	sold double NULL,
	buy double NULL,
	Profite double NULL
);

insert into Setting values('Ganesh Kandu','Medical Name','Address','9876543210','1234556','Thane','Admin');