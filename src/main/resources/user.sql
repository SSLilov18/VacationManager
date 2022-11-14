CREATE TABLE Roles
(
    id int NOT NULL,
    role_name varchar(50) NOT NULL,
    PRIMARY KEY(id)
);
CREATE TABLE Projects
(
    id int NOT NULL,
    name varchar(50) NOT NULL,
    description varchar(500) NOT NULL,
    PRIMARY KEY(id)
);
CREATE TABLE Teams
(
    id int NOT NULL,
    TeamName varchar(50) NOT NULL,
    Workers varchar(50) NULL,
    Leader  varchar(50) NULL,
    PRIMARY KEY(id)

);
CREATE TABLE Users
(
    userid int NOT NULL,
    username varchar(50) NOT NULL,
    password varchar(50) NOT NULL,
    firstname varchar(50) NOT NULL,
    lastname varchar(50) NOT NULL,
    role_id int NULL,
    team_id int NULL,
    PRIMARY KEY(userid),
    foreign key(role_id) references Roles(id)

);
CREATE TABLE UserInTeam
(
    userid int NOT NULL,
    team_id int NOT NULL,
    foreign key(team_id) references Teams(id),
    foreign key(userid) references Users(userid)

);