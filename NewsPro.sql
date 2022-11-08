
Create table Status(
	StatusId bit PRIMARY KEY NOT NULL,
	StatusName nvarchar(50)
)
Create table Category(
	CategoryId bit PRIMARY KEY NOT NULL ,
	categoryName nvarchar(50),
	StatusId bit,
	FOREIGN KEY(StatusId) REFERENCES dbo.Status(StatusId)
)
Create table Accept(
	AcceptId bit PRIMARY KEY NOT NULL,
	name nvarchar(50)

)
Create table Active(
	ActiveID bit PRIMARY KEY NOT NULL,
	ActiveName nvarchar(50)
)
Create table Gender(
	GenderId bit PRIMARY KEY NOT NULL,
	GenderName nvarchar(50),
)
Create table News (
	NewId int  PRIMARY KEY NOT NULL ,
	Title text,
	Sumary text,
	urlImage text,
	TimePost text,
	TimeAccept text,
	Content text,
	CategoryId bit,
	UserName nvarchar(50),
	StatusId bit,
	AcceptId bit,
	FOREIGN KEY(StatusId) REFERENCES dbo.Status(StatusId),
	FOREIGN KEY(CategoryId) REFERENCES dbo.Category(CategoryId),
	FOREIGN KEY(AcceptId) REFERENCES dbo.Accept(AcceptId),
	
	
)
Create table Detail(
	UserName nvarchar(50) PRIMARY KEY NOT NULL,
	FirstName nvarchar(50),
	MiddleName nvarchar(50),
	LastName nvarchar(50),
	Phone nvarchar(11),
	Email text,
	GenderId bit,
	TimeStart text,
	NewId int,
	FOREIGN KEY(GenderId) REFERENCES dbo.Gender(GenderId),
	FOREIGN KEY(NewId) REFERENCES dbo.News(NewId),
)
Create table Comment(
	commentId int PRIMARY KEY NOT NULL,
	comment text,
	TimeComment text,
	UserName nvarchar(50),
	StatusId bit,
	FOREIGN KEY(StatusId) REFERENCES dbo.Status(StatusId),
	FOREIGN KEY(UserName) REFERENCES dbo.Detail(UserName)
)

Create table Role(
	RoleId int PRIMARY KEY NOT NULL,
	RoleName nvarchar(50),
	

)

Create table Account(
	AccountId int PRIMARY KEY NOT NULL,
	UserName nvarchar(50) ,
	Password text , 
	RoleId int,
	ActiveId bit,
	FeedBackId int
	FOREIGN KEY(ActiveId) REFERENCES dbo.Active(ActiveId),
	FOREIGN KEY(UserName) REFERENCES dbo.Detail(UserName),
	FOREIGN KEY(RoleId) REFERENCES dbo.Role(RoleId),
	
)
Create table FeedBack(
	Feedback text,
	timeFeedback text,
	email text ,
	AccountId int
	FOREIGN KEY(AccountId) REFERENCES dbo.Account(AccountId),
	
)
Create table Permission(
	PerId int PRIMARY KEY NOT NULL,
	PerName nvarchar,

)

Create table Pole_Per(
	Pole_Perid int PRIMARY KEY NOT NULL,
	RoleId int,
	PerId int,
	FOREIGN KEY(RoleId) REFERENCES dbo.Role(RoleId),
	FOREIGN KEY(PerId) REFERENCES dbo.Permission(PerId),
	
)


