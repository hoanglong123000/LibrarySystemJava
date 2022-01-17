/*
Created		4/11/2021
Modified		4/12/2021
Project		
Model			
Company		
Author		
Version		
Database		MS SQL 2005 
*/


Create table [Docgia]
(
	[Hoten] Nvarchar(150) NOT NULL,
	[Email] Nvarchar(100) NULL,
	[Gioitinh] Bit NULL,
	[Dotuoi] Integer NULL,
	[Sdt] Char(10) NULL,
Primary Key ([Hoten])
) 
go

Create table [DauSach]
(
	[Madausach] Char(4) NOT NULL,
	[Namxb] Integer NULL,
	[Tieude] Nvarchar(100) NULL,
	[Theloai] Nvarchar(100) NULL,
	[Hoten] Nvarchar(150) NOT NULL,
Primary Key ([Madausach],[Hoten])
) 
go

Create table [Nhaxuatban]
(
	[Manhaxb] Char(10) NOT NULL,
	[Diachi] Nvarchar(100) NULL,
	[Sodt] Char(10) NULL,
Primary Key ([Manhaxb])
) 
go

Create table [Thedocgia]
(
	[Mathedogia] Char(6) NOT NULL,
	[Giotinh] Bit NULL,
	[Diachi] Nvarchar(100) NULL,
	[Hansudung] Datetime NULL,
	[Tuoi] Integer NULL,
	[Email] Nvarchar(100) NULL,
Primary Key ([Mathedogia])
) 
go

Create table [LoanSlip]
(
	[Maphieu] Char(6) NOT NULL,
	[ngaymuon] Smalldatetime NULL,
	[Ngaytra] Datetime NULL,
	[soluongsach] Integer NULL,
	[Hoten] Nvarchar(150) NOT NULL,
Primary Key ([Maphieu],[Hoten])
) 
go

Create table [Thongtindausach]
(
	[Madausach] Char(4) NOT NULL,
	[Manhaxb] Char(10) NOT NULL,
	[Hotennhaxb] Nvarchar(200) NOT NULL,
	[Tieudesach] Char(4) NULL,
	[Gioitinhnhaxb] Bit NULL,
	[Hoten] Nvarchar(150) NOT NULL,
Primary Key ([Madausach],[Manhaxb],[Hotennhaxb],[Hoten])
) 
go

Create table [DetailReceipt]
(
	[Hoten] Nvarchar(150) NOT NULL,
	[Mathedogia] Char(6) NOT NULL,
	[Ngaylapphieumuon] Datetime NULL,
	[Gia] Integer NULL,
	[Ngaylapthedocgia] Datetime NULL,
Primary Key ([Hoten],[Mathedogia])
) 
go


Alter table [DauSach] add  foreign key([Hoten]) references [Docgia] ([Hoten])  on update cascade on delete cascade
go
Alter table [DetailReceipt] add  foreign key([Hoten]) references [Docgia] ([Hoten]) on update cascade on delete cascade
go
Alter table [LoanSlip] add  foreign key([Hoten]) references [Docgia] ([Hoten])  on update cascade on delete cascade
go
Alter table [Thongtindausach] add  foreign key([Madausach],[Hoten]) references [DauSach] ([Madausach],[Hoten])  on update cascade on delete cascade
go
Alter table [Thongtindausach] add  foreign key([Manhaxb]) references [Nhaxuatban] ([Manhaxb])  on update cascade on delete cascade
go
Alter table [DetailReceipt] add  foreign key([Mathedogia]) references [Thedocgia] ([Mathedogia])  on update cascade on delete cascade
go


Set quoted_identifier on
go


Set quoted_identifier off
go


