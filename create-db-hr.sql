DROP DATABASE IF EXISTS `sql_hr`;
CREATE DATABASE `sql_hr`;
USE `sql_hr`;

CREATE TABLE `employees` (
  `employee_id` int(11) NOT NULL,
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `job_title` varchar(50) NOT NULL,
  `salary` int(11) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`employee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


INSERT INTO `employees` VALUES (37270,'Yovonnda','Magrannell','Executive Secretary');
INSERT INTO `employees` VALUES (33391,'D\'arcy','Nortunen','Account Executive');
INSERT INTO `employees` VALUES (37851,'Sayer','Matterson','Statistician III');
INSERT INTO `employees` VALUES (40448,'Mindy','Crissil','Staff Scientist');
INSERT INTO `employees` VALUES (56274,'Keriann','Alloisi','VP Marketing');
INSERT INTO `employees` VALUES (63196,'Alaster','Scutchin','Assistant Professor');
INSERT INTO `employees` VALUES (67009,'North','de Clerc','VP Product Management');
INSERT INTO `employees` VALUES (67370,'Elladine','Rising','Social Worker');
INSERT INTO `employees` VALUES (68249,'Nisse','Voysey','Financial Advisor');
INSERT INTO `employees` VALUES (72540,'Guthrey','Iacopetti','Office Assistant I');
INSERT INTO `employees` VALUES (72913,'Kass','Hefferan','Computer Systems Analyst IV');
INSERT INTO `employees` VALUES (75900,'Virge','Goodrum','Information Systems Manager');
INSERT INTO `employees` VALUES (76196,'Mirilla','Janowski','Cost Accountant');
INSERT INTO `employees` VALUES (80529,'Lynde','Aronson','Junior Executive');
INSERT INTO `employees` VALUES (80679,'Mildrid','Sokale','Geologist II');
INSERT INTO `employees` VALUES (84791,'Hazel','Tarbert','General Manager');
INSERT INTO `employees` VALUES (95213,'Cole','Kesterton','Pharmacist');
INSERT INTO `employees` VALUES (96513,'Theresa','Binney','Food Chemist');
INSERT INTO `employees` VALUES (98374,'Estrellita','Daleman','Staff Accountant IV');
INSERT INTO `employees` VALUES (115357,'Ivy','Fearey','Structural Engineer');



