-- MySQL dump 10.13  Distrib 5.7.27, for Linux (x86_64)
--
-- Host: localhost    Database: project
-- ------------------------------------------------------
-- Server version	5.7.27-0ubuntu0.18.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `BLOOD_DONATION`
--

DROP TABLE IF EXISTS `BLOOD_DONATION`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `BLOOD_DONATION` (
  `Event_id` int(11) DEFAULT NULL,
  `Record_No` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(90) DEFAULT NULL,
  `HB` float DEFAULT NULL,
  `blood_group` varchar(20) DEFAULT NULL,
  `fit` varchar(20) DEFAULT NULL,
  `Ph_No` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`Record_No`)
) ENGINE=InnoDB AUTO_INCREMENT=61 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `BLOOD_DONATION`
--

LOCK TABLES `BLOOD_DONATION` WRITE;
/*!40000 ALTER TABLE `BLOOD_DONATION` DISABLE KEYS */;
INSERT INTO `BLOOD_DONATION` VALUES (2,1,'SHWETA MACHE',12.5,'B-ve','Y',3456765670),(2,2,'PRISHITA KUMAR',12.78,'B+ve','Y',3456765675),(2,3,'SHABISTA SHAIKH',13.78,'AB+ve','Y',9856765675),(2,4,'SAI MORE',13,'A+ve','Y',9850765675),(2,5,'TANMAY NIGADE',13.56,'A-ve','Y',9850765670),(2,7,'SHRINIWAS GENGE',12.56,'AB-ve','Y',9850765671),(2,8,'ROHAN BHATIYA',12.56,'AB+ve','Y',9850765674),(2,9,'SAHIL ABHANG',12,'A+ve','Y',9850005674),(2,10,'AMOL SAWANT',13,'B+ve','Y',9950005674),(2,11,'SHIVAM PANDEY',14,'B+ve','Y',9950005670),(2,12,'VAISHNAVI PATIL',14.67,'A+ve','Y',9950005600),(2,13,'SWAPNIL PAWAR',14.67,'A-ve','Y',9950115600),(2,14,'ONKAR SHINDE',13.67,'B-ve','Y',9150115600),(2,15,'GAYATRI KAYUTE',13,'B-ve','Y',9180115600),(2,16,'GAYATRI SHINDE',13,'B+ve','Y',9190115600),(2,17,'AYUSH CHAJR',15,'AB+ve','Y',8190115600),(2,18,'VARSHA KUMARI',12.45,'O+ve','Y',8190119600),(2,19,'SONALI KUMARI',12,'O-ve','Y',8190119601),(2,20,'PIYUSH DESAI',12,'O-ve','Y',8190139601),(2,21,'JAGRUTI PATOLE',13,'AB-ve','Y',8190139609),(2,22,'JAGRUTI SHINDE',14,'AB+ve','Y',8190739609),(2,23,'KOYAL PAUL',14,'AB-ve','Y',8190739609),(2,24,'PATRICK DESOUZA',14,'A-ve','Y',9790739609),(2,25,'TOM THOMAS',13.5,'B-ve','Y',9791739609),(2,26,'AMAN GOENKA',14,'B-ve','Y',9790739600),(2,27,'HIMANSHUN DESHMUKH',12,'B-ve','Y',9790639600),(2,28,'MAYURI AMALE',12,'A-ve','Y',9790639600),(2,29,'SHAHARUKH KHAN',14,'AB-ve','Y',9790339600),(2,30,'SHUBHAM MAHULKAR',15,'A+ve','Y',9790338600),(2,31,'ROHIT BADGUJAR',16,'AB+ve','Y',9790338611),(2,32,'ROHIT PAWAR',13,'A-ve','Y',9190338611),(2,33,'VAISHNAVI PATIL',12,'A+ve','Y',9190338612),(2,34,'VAIBHAVI PATIL',12.99,'A+ve','Y',9190338611),(2,35,'AKASH KAMAL',12,'A-ve','Y',9190338612),(2,36,'VAISHALI BHAVISKAR',12.4,'O-ve','Y',9190399612),(2,37,'NILESH DEOTALE',13.4,'O+ve','Y',9190879612),(2,38,'DISHA DEOTALE',13,'O+ve','Y',9190009612),(2,39,'PRANJALI NIKAM',13.6,'AB+ve','Y',9190009456),(2,40,'PRIYANKA RAUT',13,'AB+ve','Y',9180009456),(2,41,'ANIRUDH DESHMUKH',12,'A+ve','Y',9180009451),(2,42,'RAHUL SINGH',12.9,'B+ve','Y',9180089451),(2,43,'ANIKET SHINDE',12,'AB+ve','Y',9280089451),(2,44,'SHRADHA RAUT',12,'O+ve','Y',9280089450),(2,45,'MOIN KHAN',13,'O-ve','Y',9280089459),(2,46,'SALMAN KHAN',13,'O+ve','Y',9980089459),(2,47,'MAKRAND LOKHANDE',13,'AB+ve','Y',9980089457),(2,48,'MAKRAND GAWALI',13,'AB+ve','Y',9970089457),(2,49,'PRIYA GAWALI',12,'A+ve','Y',9970089400),(2,50,'PRANAV JEURKAR',12,'A+ve','Y',9970089411),(2,51,'AKASH KAMAL',13,'A-ve','Y',9170089411),(2,52,'AKASH SHINDE',12,'B-ve','Y',9170089410),(2,53,'ARAV DESHMUKH',12,'B-ve','Y',9198089410),(2,54,'APARNA RAUT',13,'B+ve','Y',9198079410),(2,55,'PRIYA SAWANT',14,'B-ve','Y',9198079411),(2,56,'RUCHI YADAV',13,'B+ve','Y',9198079410),(2,57,'NEHA YADAV',13,'B-ve','Y',9298079410),(2,58,'ANKIT TIWARI',12,'A-ve','Y',9298079411),(2,59,'ANKIT SHUKLA',13,'A+ve','Y',9298077411),(2,60,'VISHAL BHARDWAJ',12.5,'AB+ve','Y',9298077400);
/*!40000 ALTER TABLE `BLOOD_DONATION` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Event`
--

DROP TABLE IF EXISTS `Event`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Event` (
  `Event_id` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(20) DEFAULT NULL,
  `Attendedby` int(11) DEFAULT NULL,
  `Date` date DEFAULT NULL,
  `Guest` varchar(80) DEFAULT NULL,
  `Pos` varchar(80) DEFAULT NULL,
  PRIMARY KEY (`Event_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Event`
--

LOCK TABLES `Event` WRITE;
/*!40000 ALTER TABLE `Event` DISABLE KEYS */;
INSERT INTO `Event` VALUES (1,'PYTHON',60,'2019-08-27','Mr.',NULL),(2,'ARTIFICAL INTE.',30,'2019-07-13','Suneet Gupta',NULL);
/*!40000 ALTER TABLE `Event` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 trigger t1 after insert on Event for each row begin insert into Session(Session_Name,Id) values (new.Name,new.Event_id); end */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `FIRST`
--

DROP TABLE IF EXISTS `FIRST`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `FIRST` (
  `Record_Number` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(90) DEFAULT NULL,
  `Class` varchar(30) DEFAULT NULL,
  `Phone_No` varchar(10) DEFAULT NULL,
  `Email_ID` varchar(80) DEFAULT NULL,
  `Event_Id` int(11) DEFAULT NULL,
  PRIMARY KEY (`Record_Number`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `FIRST`
--

LOCK TABLES `FIRST` WRITE;
/*!40000 ALTER TABLE `FIRST` DISABLE KEYS */;
INSERT INTO `FIRST` VALUES (1,'SHAB','UHQDO','28793','SADB',NULL),(2,'SHAU','UHQDO','28793','SADB',NULL);
/*!40000 ALTER TABLE `FIRST` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PROGRAM_OUTCOME1`
--

DROP TABLE IF EXISTS `PROGRAM_OUTCOME1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `PROGRAM_OUTCOME1` (
  `PO_NO` int(11) NOT NULL AUTO_INCREMENT,
  `Keyword` varchar(90) DEFAULT NULL,
  `weightage` int(11) DEFAULT NULL,
  PRIMARY KEY (`PO_NO`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PROGRAM_OUTCOME1`
--

LOCK TABLES `PROGRAM_OUTCOME1` WRITE;
/*!40000 ALTER TABLE `PROGRAM_OUTCOME1` DISABLE KEYS */;
INSERT INTO `PROGRAM_OUTCOME1` VALUES (1,'Engineering Knowlege',20),(2,'Problem Analysis',10),(3,'Design and Development Solution',10),(4,'Conduct Investigation of Problem Complex',5),(5,'Modern Tool Usage',10),(6,'The Engineer and Society',5),(7,'Environmental and Sustainability',5),(8,'Ethics',5),(9,'Individual and Team Work',10),(10,'Communication',10),(11,'Project Management and Finance',5),(12,'Life Long Journey',5);
/*!40000 ALTER TABLE `PROGRAM_OUTCOME1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PYTHON`
--

DROP TABLE IF EXISTS `PYTHON`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `PYTHON` (
  `R_no` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(90) DEFAULT NULL,
  `Date` date DEFAULT NULL,
  `Phone_No` bigint(20) DEFAULT NULL,
  `Event_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`R_no`)
) ENGINE=InnoDB AUTO_INCREMENT=61 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PYTHON`
--

LOCK TABLES `PYTHON` WRITE;
/*!40000 ALTER TABLE `PYTHON` DISABLE KEYS */;
INSERT INTO `PYTHON` VALUES (1,'AKSHAY TOSHNIWAL','2019-08-27',8998889990,1),(2,'AMAR SAYYAD','2019-08-27',8998889991,1),(3,'CHARAN INGALE','2019-08-27',8998889992,1),(4,'CHITTRANJAN GIRI','2019-08-27',8998889978,1),(5,'DARSHAN SHEWALE','2019-08-27',9998889978,1),(6,'MANGESH BHISE','2019-08-27',9198889978,1),(7,'NIKHIL GUMASHTHI','2019-08-27',9298889978,1),(8,'OMKAR GAWALI','2019-08-27',9598889978,1),(9,'PRAGYA CHANDRA','2019-08-27',9698889978,1),(10,'PRATHMESH GHAN','2019-08-27',9798889978,1),(11,'PRATIKSHA REPSWAL','2019-08-27',9098889978,1),(12,'PRISHITA  KUMAR','2019-08-27',9098989978,1),(13,'RUTUJA DESHMUKH','2019-08-27',9598989978,1),(14,'RUCHIKA BANKAR','2019-08-27',9348989978,1),(15,'SHASHANK NAIK','2019-08-27',9308989978,1),(16,'SHIVLING KHARADE','2019-08-27',9318989978,1),(17,'SAURABH JADHAV','2019-08-27',9118989978,1),(18,'SHWETA MACHE','2019-08-27',9218989978,1),(19,'SNEHAL JADHAV','2019-08-27',9318989978,1),(20,'SUSHANT ROLE','2019-08-27',9418989978,1),(21,'VAIBHAV DOND','2019-08-27',9518989978,1),(22,'VAIBHAVI PADMWAR','2019-08-27',9618989978,1),(23,'VRUSHTI PATIL','2019-08-27',9718989978,1),(24,'YASH PATTEWAR','2019-08-27',9818989978,1),(25,'JINU SAM','2019-08-27',9918989978,1),(26,'PIYUSH PATKAL','2019-08-27',9788989978,1),(27,'RITU MAHAJAN','2019-08-27',9088989978,1),(28,'SHABISTA SHAIKH','2019-08-27',9188989978,1),(29,'SAI MORE','2019-08-27',9288989978,1),(30,'PALLLAVI SAKHORE','2019-08-27',9388989978,1),(31,'PUJA GHODKE','2019-08-27',9488989978,1),(32,'VARAD DESHPANDE','2019-08-27',9588989978,1),(33,'KISAN DEKATE','2019-08-27',9548989978,1),(34,'SANJANA KARMALKR','2019-08-27',9648989978,1),(35,'AJAY BHARSAKALE','2019-08-27',9048989978,1),(36,'SHREYA MANDLECHA','2019-08-27',9248989978,1),(37,'DIPALI RAKHUNDE','2019-08-27',9348989978,1),(38,'SUSHANT PARAB','2019-08-27',9340989978,1),(39,'SOHAIL KAZI','2019-08-27',9840989978,1),(40,'ONKAR PAWAR','2019-08-27',9740989978,1),(41,'BABAN GADADE','2019-08-27',9640989978,1),(42,'GITESH JAIN','2019-08-27',9540989978,1),(43,'MAURYA LALIT','2019-08-27',9440989978,1),(44,'SANKET KAUSAL','2019-08-27',9340989978,1),(45,'SNEHAL SARADE','2019-08-27',9240989978,1),(46,'SHLOK KHANDELWAL','2019-08-27',9140989978,1),(47,'PIYUSH SABLE','2019-08-27',9040989978,1),(48,'SAKLEN PATEL','2019-08-27',9040989970,1),(49,'SIYONA RAHANE','2019-08-27',9040989971,1),(50,'CHANDRAKANT RAUT','2019-08-27',9040989972,1),(51,'POOJA KADAM','2019-08-27',9040989973,1),(52,'CHANDRAKALA KALE','2019-08-27',9040939973,1),(53,'SANYUKTA OSWAL','2019-08-27',9140939973,1),(54,'JYOTI CHAVAN','2019-08-27',9740939973,1),(55,'PANKAJ KHAMBARE','2019-08-27',9746939973,1),(56,'SHUBHANGI SURYAWANSHI','2019-08-27',9750939973,1),(57,'SONALI SONAWANE','2019-08-27',9750609973,1),(58,'VANITA RAUT','2019-08-27',9750607073,1),(59,'PARAG KULKARNI','2019-08-27',9050607073,1),(60,'SUNIT GUPTA','2019-08-27',9011607073,1);
/*!40000 ALTER TABLE `PYTHON` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `REGISTRATION`
--

DROP TABLE IF EXISTS `REGISTRATION`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `REGISTRATION` (
  `R_no` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(50) DEFAULT NULL,
  `Branch` varchar(50) DEFAULT NULL,
  `Year` varchar(20) DEFAULT NULL,
  `DOB` date DEFAULT NULL,
  `Gender` varchar(10) DEFAULT NULL,
  `Ph_No` bigint(20) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `Email` varchar(90) DEFAULT NULL,
  `Designation` varchar(90) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`R_no`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `REGISTRATION`
--

LOCK TABLES `REGISTRATION` WRITE;
/*!40000 ALTER TABLE `REGISTRATION` DISABLE KEYS */;
INSERT INTO `REGISTRATION` VALUES (1,'SHWETA','Computer Engineering','T.E','1999-12-07','F',7769957507,'Ahemdnagar','shweta.mache@raisoni.net','Admin','ghriet123'),(2,'PRISHITA','Computer Engineering','T.E','1999-08-27','F',9561673611,'Pune','prishita.kumar@raisoni.net','Admin','ghriet123'),(3,'SHABISTA','Computer Engineering','T.E','1999-08-27','F',7030546467,'Pune','shabista.shaikh@raisoni.net','Admin','ghriet123');
/*!40000 ALTER TABLE `REGISTRATION` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Session`
--

DROP TABLE IF EXISTS `Session`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Session` (
  `S_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Session_Name` varchar(40) DEFAULT NULL,
  `Id` int(11) DEFAULT NULL,
  PRIMARY KEY (`S_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Session`
--

LOCK TABLES `Session` WRITE;
/*!40000 ALTER TABLE `Session` DISABLE KEYS */;
INSERT INTO `Session` VALUES (1,'PYTHON',1),(2,'ARTIFICIAL INTE',2),(3,'BLOOD_DONATION',1),(4,'POSTER_COMPETITION',2);
/*!40000 ALTER TABLE `Session` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Workshop`
--

DROP TABLE IF EXISTS `Workshop`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Workshop` (
  `W_Id` int(11) DEFAULT NULL,
  `Name` varchar(90) DEFAULT NULL,
  `Attendedby` int(11) DEFAULT NULL,
  `Pos` varchar(80) DEFAULT NULL,
  `Guest` varchar(80) DEFAULT NULL,
  `Date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Workshop`
--

LOCK TABLES `Workshop` WRITE;
/*!40000 ALTER TABLE `Workshop` DISABLE KEYS */;
INSERT INTO `Workshop` VALUES (1,'BLOOD_DONATION',60,NULL,'Mr.','2019-09-05'),(2,'POSTER_COMPETITON',60,NULL,'Mr.','2019-09-22');
/*!40000 ALTER TABLE `Workshop` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 trigger t2 after insert on Workshop for each row begin insert into Session(Session_Name,Id) values (new.Name,new.W_id); end */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `feedback`
--

DROP TABLE IF EXISTS `feedback`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `feedback` (
  `Record_No` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(40) DEFAULT NULL,
  `Designation` varchar(20) DEFAULT NULL,
  `rating` varchar(40) DEFAULT NULL,
  `feedback` varchar(200) DEFAULT NULL,
  `Session` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Record_No`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `feedback`
--

LOCK TABLES `feedback` WRITE;
/*!40000 ALTER TABLE `feedback` DISABLE KEYS */;
INSERT INTO `feedback` VALUES (1,'Prishita','Student','Outstanding','nice','PYTHON'),(2,'Shweta','Student','Good','Best','BLOOD_DONATION'),(3,'Shabista','Student','Good','Nice','ARTIFICIAL INTE'),(4,'Suryamani','Student','Outstanding','nice','ARTIFICIAL INTE'),(5,'Sumaiyah','Student','Outstanding','Best','ARTIFICIAL INTE'),(6,'Suraj','Student','Good','Can be Better','PYTHON');
/*!40000 ALTER TABLE `feedback` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `main`
--

DROP TABLE IF EXISTS `main`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `main` (
  `M_id` int(11) NOT NULL AUTO_INCREMENT,
  `Components` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`M_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `main`
--

LOCK TABLES `main` WRITE;
/*!40000 ALTER TABLE `main` DISABLE KEYS */;
INSERT INTO `main` VALUES (1,'EVENT'),(2,'WORKSHOP'),(3,'PROGRAM_OUTCOME');
/*!40000 ALTER TABLE `main` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trial`
--

DROP TABLE IF EXISTS `trial`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `trial` (
  `Name` varchar(80) DEFAULT NULL,
  `Attendedby` int(11) DEFAULT NULL,
  `Date` date DEFAULT NULL,
  `Guest` varchar(70) DEFAULT NULL,
  `Pos` varchar(60) DEFAULT NULL,
  `Event_id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`Event_id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trial`
--

LOCK TABLES `trial` WRITE;
/*!40000 ALTER TABLE `trial` DISABLE KEYS */;
INSERT INTO `trial` VALUES ('shabista',123,'2018-09-18','COK','60.0',1),('SHAISTA',12,'2019-02-17','DBKW','45.0',2),('sbsaudi',90,'2017-05-19','bvdi','70.0',3),('bwiu',29,'2019-01-29','bvwiu','65.0',4),('shabist',97,'2019-07-18','shubca','55.0',5),('shsb',7182,'2019-02-19','cbdpu','30.0',6),('shabus',98,'2019-01-16','bvw','70.0',7),('shab',780,'2019-09-18','bsuw','30.0',8),('good',12,'2019-09-18','cdno','45.0',9),('sbu',123,'2019-08-10','nehi','45.0',10),('bad',123,'2019-09-19','cbiu','80.0',11),('SHA',780,'2019-11-14','CBOWHD','100.0',12),('shai',2837,'2019-10-19','c','30.0',13),('shabi',12,'2019-08-19','cnwoi','70.0',14),('dflu',9,'2019-07-16','fdwhg','30.0',15),('bdvuip',123,'2019-01-12','cjeb','30.0',16),('sh',12,'2019-01-19','jh','70.0',17),('sbsjk',12,'2019-08-19','wklnefh','30.0',18),('hilsacx',19,'2019-09-19','csb','70.0',19),('HJSBV',76,'2019-09-12','dgq','10.0',20),('FIRST',12,'2018-01-10','DNHI','45.0',21);
/*!40000 ALTER TABLE `trial` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trial1`
--

DROP TABLE IF EXISTS `trial1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `trial1` (
  `W_Id` int(11) DEFAULT NULL,
  `Name` varchar(20) DEFAULT NULL,
  `Attendedby` int(11) DEFAULT NULL,
  `Pos` float DEFAULT NULL,
  `Guest` varchar(80) DEFAULT NULL,
  `Date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trial1`
--

LOCK TABLES `trial1` WRITE;
/*!40000 ALTER TABLE `trial1` DISABLE KEYS */;
INSERT INTO `trial1` VALUES (NULL,'india',789,70,'sbdiuwO','2019-08-19');
/*!40000 ALTER TABLE `trial1` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-10-18 15:54:11
