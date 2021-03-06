USE [Librarydata]
GO
/****** Object:  Table [dbo].[Book]    Script Date: 6/3/2021 6:25:32 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Book](
	[Idbook] [char](4) NOT NULL,
	[pubyear] [int] NULL,
	[title] [nvarchar](100) NULL,
	[type] [nvarchar](100) NULL,
	[ammount] [int] NULL,
	[datepub] [datetime] NULL,
PRIMARY KEY CLUSTERED 
(
	[Idbook] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Book_info]    Script Date: 6/3/2021 6:25:32 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Book_info](
	[Idbook] [char](4) NOT NULL,
	[Idpublisher] [char](10) NOT NULL,
	[PubFullName] [nvarchar](200) NOT NULL,
	[Gender] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[Idbook] ASC,
	[Idpublisher] ASC,
	[PubFullName] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[DetailReceipt]    Script Date: 6/3/2021 6:25:32 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DetailReceipt](
	[Fullname] [nvarchar](150) NOT NULL,
	[ididencard] [char](6) NOT NULL,
	[FoundedLoanSlipDate] [char](4) NULL,
	[Cost] [int] NULL,
	[FoundedIdencardDate] [datetime] NULL,
PRIMARY KEY CLUSTERED 
(
	[Fullname] ASC,
	[ididencard] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Employee]    Script Date: 6/3/2021 6:25:32 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Employee](
	[Name] [nvarchar](250) NOT NULL,
	[gender] [bit] NOT NULL,
	[jobtitle] [nvarchar](250) NOT NULL,
	[age] [int] NOT NULL,
	[email] [nchar](100) NULL,
 CONSTRAINT [PK_Employee] PRIMARY KEY CLUSTERED 
(
	[Name] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Finecard]    Script Date: 6/3/2021 6:25:32 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Finecard](
	[Idfinecard] [char](6) NOT NULL,
	[Contents] [nvarchar](200) NOT NULL,
	[Cost] [int] NOT NULL,
 CONSTRAINT [PK_Finecard] PRIMARY KEY CLUSTERED 
(
	[Idfinecard] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Identitycard]    Script Date: 6/3/2021 6:25:32 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Identitycard](
	[ididencard] [char](6) NOT NULL,
	[gender] [bit] NULL,
	[address] [nvarchar](100) NULL,
	[Expdate] [datetime] NULL,
	[age] [int] NULL,
	[email] [nvarchar](100) NULL,
PRIMARY KEY CLUSTERED 
(
	[ididencard] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[LoanSlip]    Script Date: 6/3/2021 6:25:32 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LoanSlip](
	[idloanslip] [char](6) NOT NULL,
	[loandate] [smalldatetime] NULL,
	[paydate] [datetime] NULL,
	[numofbook] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[idloanslip] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Publisher]    Script Date: 6/3/2021 6:25:32 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Publisher](
	[Idpublisher] [char](10) NOT NULL,
	[address] [nvarchar](100) NULL,
	[phonenum] [char](10) NULL,
PRIMARY KEY CLUSTERED 
(
	[Idpublisher] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Reader]    Script Date: 6/3/2021 6:25:32 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Reader](
	[Fullname] [nvarchar](150) NOT NULL,
	[Email] [nvarchar](100) NULL,
	[Gender] [bit] NULL,
	[Age] [int] NULL,
	[Phonenum] [char](10) NULL,
PRIMARY KEY CLUSTERED 
(
	[Fullname] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[Book_info]  WITH CHECK ADD FOREIGN KEY([Idbook])
REFERENCES [dbo].[Book] ([Idbook])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[Book_info]  WITH CHECK ADD FOREIGN KEY([Idpublisher])
REFERENCES [dbo].[Publisher] ([Idpublisher])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[DetailReceipt]  WITH CHECK ADD FOREIGN KEY([Fullname])
REFERENCES [dbo].[Reader] ([Fullname])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[DetailReceipt]  WITH CHECK ADD FOREIGN KEY([ididencard])
REFERENCES [dbo].[Identitycard] ([ididencard])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
