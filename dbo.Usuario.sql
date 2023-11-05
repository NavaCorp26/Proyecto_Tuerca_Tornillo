CREATE TABLE [dbo].[Usuario] (
    [Id]                INT           IDENTITY (1, 1) NOT NULL,
    [Nombre]            VARCHAR (50)  NOT NULL,
    [CorreoElectronico] VARCHAR (100) NOT NULL,
    [Contrasena]        VARCHAR (128) NOT NULL,
    PRIMARY KEY CLUSTERED ([Id] ASC),
    UNIQUE NONCLUSTERED ([CorreoElectronico] ASC)
);

