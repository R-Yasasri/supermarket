CREATE DATABASE  IF NOT EXISTS `coopcity_homagama` /*!40100 DEFAULT CHARACTER SET latin1 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `coopcity_homagama`;
-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: coopcity_homagama
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `attendance`
--

DROP TABLE IF EXISTS `attendance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `attendance` (
  `idattendance` int NOT NULL AUTO_INCREMENT,
  `clock_in` datetime DEFAULT NULL,
  `clock_out` datetime DEFAULT NULL,
  `date` date DEFAULT NULL,
  `employee_idemployee` int NOT NULL,
  PRIMARY KEY (`idattendance`),
  KEY `fk_attendance_employee1_idx` (`employee_idemployee`),
  CONSTRAINT `fk_attendance_employee1` FOREIGN KEY (`employee_idemployee`) REFERENCES `employee` (`idemployee`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attendance`
--

LOCK TABLES `attendance` WRITE;
/*!40000 ALTER TABLE `attendance` DISABLE KEYS */;
INSERT INTO `attendance` VALUES (1,'2022-07-20 01:00:00','2022-07-20 12:00:00','2022-07-20',3),(2,'2022-07-22 01:00:00','2022-07-22 12:00:00','2022-07-22',3),(8,'2022-07-23 08:00:00','2022-07-23 10:00:00','2022-07-23',3),(9,'2022-07-23 08:00:00','2022-07-23 10:00:00','2022-07-23',4),(10,'2022-06-10 08:00:00','2022-06-10 10:00:00','2022-06-10',3);
/*!40000 ALTER TABLE `attendance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bill`
--

DROP TABLE IF EXISTS `bill`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bill` (
  `idbill` int NOT NULL AUTO_INCREMENT,
  `type` varchar(45) DEFAULT NULL,
  `provider` varchar(100) DEFAULT NULL,
  `description` text,
  `amount` double DEFAULT NULL,
  `date` date DEFAULT NULL,
  `paid_by` varchar(45) DEFAULT NULL,
  `payment_centre` varchar(45) DEFAULT NULL,
  `payment_centre_address` text,
  `payment_method` varchar(45) DEFAULT NULL,
  `shop_idshop` int NOT NULL DEFAULT '1',
  PRIMARY KEY (`idbill`),
  KEY `fk_bill_shop1_idx` (`shop_idshop`),
  CONSTRAINT `fk_bill_shop1` FOREIGN KEY (`shop_idshop`) REFERENCES `shop` (`idshop`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bill`
--

LOCK TABLES `bill` WRITE;
/*!40000 ALTER TABLE `bill` DISABLE KEYS */;
INSERT INTO `bill` VALUES (1,'Water','Water board','Late payment',2500,'2022-07-22','Kamal','Meegoda','Water board counter, Trade plazza, Meegoda','Cash',1),(2,'Electricity','SLEB','On time',4500,'2022-07-24','Kamal','Homagama','SLEB Building, Homagama','Cash',1),(3,'Water','Water board','on time',2000,'2022-06-27','Kamal','Meegoda','Water board counter, Trade plazza, Meegoda','Cash',1);
/*!40000 ALTER TABLE `bill` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `disciplinary_history`
--

DROP TABLE IF EXISTS `disciplinary_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `disciplinary_history` (
  `iddisciplinary_history` int NOT NULL AUTO_INCREMENT,
  `description` text,
  `action_taken` varchar(45) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `employee_idemployee` int NOT NULL,
  PRIMARY KEY (`iddisciplinary_history`),
  KEY `fk_disciplinary_history_employee1_idx` (`employee_idemployee`),
  CONSTRAINT `fk_disciplinary_history_employee1` FOREIGN KEY (`employee_idemployee`) REFERENCES `employee` (`idemployee`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `disciplinary_history`
--

LOCK TABLES `disciplinary_history` WRITE;
/*!40000 ALTER TABLE `disciplinary_history` DISABLE KEYS */;
INSERT INTO `disciplinary_history` VALUES (1,'Late attendance','warning given','2022-07-15',3);
/*!40000 ALTER TABLE `disciplinary_history` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `idemployee` int NOT NULL AUTO_INCREMENT,
  `nic` varchar(45) DEFAULT NULL,
  `fname` varchar(45) DEFAULT NULL,
  `lname` varchar(45) DEFAULT NULL,
  `img` text,
  `dob` date DEFAULT NULL,
  `gender` varchar(6) DEFAULT NULL,
  `email` varchar(200) DEFAULT NULL,
  `mobile1` varchar(10) DEFAULT NULL,
  `mobile2` varchar(10) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `civil_status` varchar(45) DEFAULT NULL,
  `status` int DEFAULT NULL,
  `shop_idshop` int NOT NULL DEFAULT '1',
  PRIMARY KEY (`idemployee`),
  KEY `fk_employee_shop1_idx` (`shop_idshop`),
  CONSTRAINT `fk_employee_shop1` FOREIGN KEY (`shop_idshop`) REFERENCES `shop` (`idshop`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (3,'124002947V','Sunil','Perera','C:/Users/User/Documents/Images/man1.jpg','1998-10-26','Male','rajitha@gmail.com','0702115634','0705642381','10/2, Main street, Thalangama','Unmarried',1,1),(4,'122635214V','Kamal','Perera','C:/Users/User/Documents/Images/man2.jpeg','1997-07-09','Male','kamal@gmail.com','0702356894','','15,Artigala mawatha,Meegoda','Married',1,1);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `furniture`
--

DROP TABLE IF EXISTS `furniture`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `furniture` (
  `idfurniture` int NOT NULL AUTO_INCREMENT,
  `type` varchar(45) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `color` varchar(45) DEFAULT NULL,
  `material` varchar(45) DEFAULT NULL,
  `seller` varchar(100) DEFAULT NULL,
  `seller_address` varchar(100) DEFAULT NULL,
  `warranty_no` text,
  `warranty` text,
  `price` double DEFAULT NULL,
  `bought_date` date DEFAULT NULL,
  `other` text,
  `status` int DEFAULT NULL,
  `shop_idshop` int NOT NULL DEFAULT '1',
  PRIMARY KEY (`idfurniture`),
  KEY `fk_furniture_shop1_idx` (`shop_idshop`),
  CONSTRAINT `fk_furniture_shop1` FOREIGN KEY (`shop_idshop`) REFERENCES `shop` (`idshop`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `furniture`
--

LOCK TABLES `furniture` WRITE;
/*!40000 ALTER TABLE `furniture` DISABLE KEYS */;
INSERT INTO `furniture` VALUES (1,'Rack','SBC Rack 1023','White','Metal','ABC stores','23,Near bus stand, Homagama','ks-12354','C:/Users/User/Documents/Images/warranty1.jpg',10000,'2021-07-15','repair date----2021-10-05,,,,service time----one day',1,1),(2,'Desk','Large size office desk','Light Brown','Plastic','XYZ stores','38, Galagedara','dd5698','C:/Users/User/Documents/Images/warranty2.png',25000,'2021-07-14','Size----2*2',1,1);
/*!40000 ALTER TABLE `furniture` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `grn`
--

DROP TABLE IF EXISTS `grn`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `grn` (
  `idgrn` int NOT NULL AUTO_INCREMENT,
  `supplier_idsupplier` int DEFAULT NULL,
  `datetime` date DEFAULT NULL,
  `payment` double DEFAULT NULL,
  `discount` double DEFAULT NULL,
  `status` int DEFAULT '1',
  PRIMARY KEY (`idgrn`),
  KEY `fk_grn_supplier1` (`supplier_idsupplier`),
  CONSTRAINT `fk_grn_supplier1` FOREIGN KEY (`supplier_idsupplier`) REFERENCES `supplier` (`idsupplier`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grn`
--

LOCK TABLES `grn` WRITE;
/*!40000 ALTER TABLE `grn` DISABLE KEYS */;
INSERT INTO `grn` VALUES (2,1,'2022-04-23',1800,23,1),(3,3,'2022-04-08',100,0,1),(4,1,'2022-05-04',400,25,1),(5,3,'2022-05-08',46,0,1),(6,3,'2022-05-08',500,0,1),(7,1,'2022-05-08',30,0,1),(8,1,'2022-05-13',3000,3.4,1),(9,1,'2022-07-19',3000,1.6,1),(10,1,'2022-07-19',200,0,1),(11,1,'2022-07-20',2500,0,1),(12,4,'2022-02-16',8000,6,1),(13,1,'2022-02-16',34000,13,1),(14,1,'2022-08-11',1700000,4,1),(15,1,'2022-08-21',2500,5,1),(16,1,'2022-08-22',1000,5,1),(17,1,'2022-10-07',1000,0,1),(18,3,'2022-10-07',1550,0,1);
/*!40000 ALTER TABLE `grn` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `grnitem`
--

DROP TABLE IF EXISTS `grnitem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `grnitem` (
  `idgrnitem` int NOT NULL AUTO_INCREMENT,
  `item_iditem` int NOT NULL,
  `grn_idgrn` int NOT NULL,
  `qty` double DEFAULT NULL,
  `unit_price` double DEFAULT NULL,
  `unit` varchar(30) DEFAULT NULL,
  `returning_container_details` varchar(45) DEFAULT NULL,
  `status` int DEFAULT '1',
  PRIMARY KEY (`idgrnitem`),
  KEY `fk_item_has_grn_grn1` (`grn_idgrn`),
  KEY `fk_item_has_grn_item1` (`item_iditem`),
  CONSTRAINT `fk_item_has_grn_grn1` FOREIGN KEY (`grn_idgrn`) REFERENCES `grn` (`idgrn`),
  CONSTRAINT `fk_item_has_grn_item1` FOREIGN KEY (`item_iditem`) REFERENCES `item` (`iditem`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grnitem`
--

LOCK TABLES `grnitem` WRITE;
/*!40000 ALTER TABLE `grnitem` DISABLE KEYS */;
INSERT INTO `grnitem` VALUES (1,1,2,10,100,'kg','1 container',1),(4,5,2,12,110,'500 g packets','2 boxes',1),(5,3,3,10,10,'kg','Red basket',1),(6,1,4,20,20,'boxes','Blue container',1),(7,2,5,2,23,'unit','3 Blue basktets',1),(8,1,6,1,450,'unit','2 Corrugated boxes',1),(9,3,7,2,13,'unit','Cardboard boxes',1),(10,2,8,12,200,'kg','',1),(11,3,8,5,100,'unit','',1),(12,1,9,12,100,'kg','blue basket',1),(13,1,10,15,10,'kg','container',1),(14,6,11,20,100,'litres','',1),(15,7,12,25,150,'kg','',1),(16,6,12,5,900,'litres','Wooden Barrel',1),(17,1,13,30,940,'units','2 brown corrugated boxes',1),(18,2,13,10,1000,'units','',1),(19,8,14,2500,450,'litres','5 bottles',1),(20,7,14,100,250,'kg','',1),(21,2,15,5,100,'kg','',1),(22,3,15,10,200,'kg','',1),(23,10,16,10,100,'units','',1),(24,5,17,10,100,'kg','',1),(25,5,18,10,150,'kg','',1);
/*!40000 ALTER TABLE `grnitem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `invoice`
--

DROP TABLE IF EXISTS `invoice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `invoice` (
  `idinvoice` int NOT NULL AUTO_INCREMENT,
  `datetime` date DEFAULT NULL,
  `payment_method` varchar(45) DEFAULT NULL,
  `status` int DEFAULT '1',
  `discount` double DEFAULT NULL,
  `payment` double DEFAULT NULL,
  PRIMARY KEY (`idinvoice`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `invoice`
--

LOCK TABLES `invoice` WRITE;
/*!40000 ALTER TABLE `invoice` DISABLE KEYS */;
INSERT INTO `invoice` VALUES (2,'2022-05-20','Cash',1,0,750),(3,'2022-07-19','Cash',1,20,460),(4,'2022-07-19','Credit Card',1,9,400),(5,'2022-07-19','Cash',1,5,100),(6,'2022-07-19','Cash',1,100,1000),(7,'2022-07-19','Cash',1,0,150),(8,'2022-07-20','Cash',1,0,125),(9,'2022-07-20','Cash',1,0,125),(10,'2022-07-20','Cash',1,0,600),(11,'2022-07-20','Cash',1,0,30),(12,'2022-07-25','Cash',1,0,500),(13,'2022-02-16','Cash',1,50,5000),(14,'2022-08-11','Cash',1,1000,59000),(15,'2022-08-22','Cash',1,0,1000);
/*!40000 ALTER TABLE `invoice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `invoiceitem`
--

DROP TABLE IF EXISTS `invoiceitem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `invoiceitem` (
  `invoiceitemid` int NOT NULL AUTO_INCREMENT,
  `item_iditem` int NOT NULL,
  `invoice_idinvoice` int NOT NULL,
  `qty` double DEFAULT NULL,
  `unit_price` double DEFAULT NULL,
  `unit` varchar(30) DEFAULT NULL,
  `discount` double DEFAULT NULL,
  `status` int DEFAULT '1',
  `stock_idstock` int DEFAULT NULL,
  PRIMARY KEY (`invoiceitemid`),
  KEY `fk_item_has_invoice_item` (`item_iditem`),
  KEY `fk_invoice_idx` (`invoice_idinvoice`),
  KEY `fk_stock_idx` (`stock_idstock`),
  CONSTRAINT `fk_invoice` FOREIGN KEY (`invoice_idinvoice`) REFERENCES `invoice` (`idinvoice`),
  CONSTRAINT `fk_item_has_invoice_item` FOREIGN KEY (`item_iditem`) REFERENCES `item` (`iditem`),
  CONSTRAINT `fk_stock` FOREIGN KEY (`stock_idstock`) REFERENCES `stock` (`idstock`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `invoiceitem`
--

LOCK TABLES `invoiceitem` WRITE;
/*!40000 ALTER TABLE `invoiceitem` DISABLE KEYS */;
INSERT INTO `invoiceitem` VALUES (1,1,2,1,500,'kg',0,1,1),(2,2,2,2,123,'units',10,1,2),(3,1,3,1,500,'kg',20,1,3),(4,2,4,3,123,'units',10,1,4),(5,3,4,1,20,'kg',0,1,3),(6,3,5,2,20,'kg',0,1,7),(7,1,5,3,25,'litres',10,1,10),(8,3,6,1,105,'units',5,1,9),(9,1,6,2,500,'kg',0,1,1),(10,2,7,1,123,'units',0,1,2),(11,1,9,5,25,'500 g packets',0,1,1),(12,6,10,5,120,'litres',0,1,12),(13,3,11,1,20,'kg',0,1,3),(14,1,12,1,500,'kg',20,1,1),(15,1,13,5,945,'units',100,1,16),(16,7,13,1,170,'kg',0,1,14),(17,7,14,50,300,'kg',5000,1,19),(18,8,14,100,500,'litres',0,1,18),(19,10,15,3,250,'units',0,1,22);
/*!40000 ALTER TABLE `invoiceitem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item`
--

DROP TABLE IF EXISTS `item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `item` (
  `iditem` int NOT NULL AUTO_INCREMENT,
  `category` varchar(45) DEFAULT NULL,
  `brand` varchar(45) DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL,
  `status` int DEFAULT '1',
  PRIMARY KEY (`iditem`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item`
--

LOCK TABLES `item` WRITE;
/*!40000 ALTER TABLE `item` DISABLE KEYS */;
INSERT INTO `item` VALUES (1,'Food','Maliban','milk',1),(2,'Biscuits','Maliban','Associated Biscuits',1),(3,'Biscuits','Munchee','Tiffin biscuit',1),(4,'Food','Anchor','Butter',1),(5,'Food','Maliban','Milk powder',1),(6,'Oil','Marina','Pure coconut oil',1),(7,'Food','Araliya','Red Kakulu',1),(8,'Beverages','Coca cola','Lite',1),(9,'Books','Atlas','Square Rules A4 180 pgs',1),(10,'Food','Wijaya Products','Coriander Seeds 1 Kg',1);
/*!40000 ALTER TABLE `item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `leave`
--

DROP TABLE IF EXISTS `leave`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `leave` (
  `idleave` int NOT NULL AUTO_INCREMENT,
  `type` varchar(45) DEFAULT NULL,
  `begin_date` date DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  `employee_idemployee` int NOT NULL,
  PRIMARY KEY (`idleave`),
  KEY `fk_leave_employee1_idx` (`employee_idemployee`),
  CONSTRAINT `fk_leave_employee1` FOREIGN KEY (`employee_idemployee`) REFERENCES `employee` (`idemployee`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `leave`
--

LOCK TABLES `leave` WRITE;
/*!40000 ALTER TABLE `leave` DISABLE KEYS */;
INSERT INTO `leave` VALUES (1,'Medical','2022-07-21','2021-07-23',3),(2,'Emergency','2022-08-25','2021-08-27',3),(3,'Emergency','2022-07-04','2021-07-05',4);
/*!40000 ALTER TABLE `leave` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `performance_feedback`
--

DROP TABLE IF EXISTS `performance_feedback`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `performance_feedback` (
  `idperformance_feedback` int NOT NULL AUTO_INCREMENT,
  `description` text,
  `date` date DEFAULT NULL,
  `employee_idemployee` int NOT NULL,
  PRIMARY KEY (`idperformance_feedback`),
  KEY `fk_performance_feedback_employee1_idx` (`employee_idemployee`),
  CONSTRAINT `fk_performance_feedback_employee1` FOREIGN KEY (`employee_idemployee`) REFERENCES `employee` (`idemployee`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `performance_feedback`
--

LOCK TABLES `performance_feedback` WRITE;
/*!40000 ALTER TABLE `performance_feedback` DISABLE KEYS */;
INSERT INTO `performance_feedback` VALUES (1,'Good Improvement','2022-07-14',3);
/*!40000 ALTER TABLE `performance_feedback` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `petty_cash`
--

DROP TABLE IF EXISTS `petty_cash`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `petty_cash` (
  `idpetty_cash` int NOT NULL AUTO_INCREMENT,
  `type` varchar(45) DEFAULT NULL,
  `amount` double DEFAULT NULL,
  `date` date DEFAULT NULL,
  `description` text,
  `shop_idshop` int NOT NULL DEFAULT '1',
  PRIMARY KEY (`idpetty_cash`),
  KEY `fk_petty_cash_shop1_idx` (`shop_idshop`),
  CONSTRAINT `fk_petty_cash_shop1` FOREIGN KEY (`shop_idshop`) REFERENCES `shop` (`idshop`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `petty_cash`
--

LOCK TABLES `petty_cash` WRITE;
/*!40000 ALTER TABLE `petty_cash` DISABLE KEYS */;
INSERT INTO `petty_cash` VALUES (1,'Outcome',200,'2022-06-15','Travelling',1),(2,'Income',300,'2022-07-15','minor income',1),(3,'Outcome',100,'2022-08-23','Stamps',1);
/*!40000 ALTER TABLE `petty_cash` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `quicknote`
--

DROP TABLE IF EXISTS `quicknote`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `quicknote` (
  `idquicknote` int NOT NULL AUTO_INCREMENT,
  `topic` varchar(200) DEFAULT NULL,
  `note` text,
  `img` text,
  `datetaken` date DEFAULT NULL,
  `user_nic` varchar(13) NOT NULL,
  PRIMARY KEY (`idquicknote`),
  KEY `fk_quicknote_user1_idx` (`user_nic`),
  CONSTRAINT `fk_quicknote_user1` FOREIGN KEY (`user_nic`) REFERENCES `user` (`nic`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `quicknote`
--

LOCK TABLES `quicknote` WRITE;
/*!40000 ALTER TABLE `quicknote` DISABLE KEYS */;
INSERT INTO `quicknote` VALUES (3,'Loan','The loan due date is 2022/02/15 with amount of Rs. 25000','C:/Users/User/Documents/Images/loan application form 1.png','2022-02-13','123456789V'),(4,'Salary advance','Employees are requesting salary advances for March. Request was recieved in day before yesterday.','','2022-02-13','123456789V');
/*!40000 ALTER TABLE `quicknote` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `removed_stock`
--

DROP TABLE IF EXISTS `removed_stock`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `removed_stock` (
  `idremoved_stock` int NOT NULL AUTO_INCREMENT,
  `qty` double DEFAULT NULL,
  `reason` text,
  `date` date DEFAULT NULL,
  `stock_idstock` int NOT NULL,
  PRIMARY KEY (`idremoved_stock`),
  KEY `fk_removed_stock_stock1_idx` (`stock_idstock`),
  CONSTRAINT `fk_removed_stock_stock1` FOREIGN KEY (`stock_idstock`) REFERENCES `stock` (`idstock`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `removed_stock`
--

LOCK TABLES `removed_stock` WRITE;
/*!40000 ALTER TABLE `removed_stock` DISABLE KEYS */;
INSERT INTO `removed_stock` VALUES (1,13,'Can not be returned to supplier','2022-07-21',13),(2,1,'Cannot be returned to the supplier','2022-07-21',13),(3,1,'Could not sell','2022-07-21',4);
/*!40000 ALTER TABLE `removed_stock` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `return_from_customer`
--

DROP TABLE IF EXISTS `return_from_customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `return_from_customer` (
  `idreturn_from_customer` int NOT NULL AUTO_INCREMENT,
  `reason` text,
  `qty` double DEFAULT NULL,
  `payment_paid` double DEFAULT NULL,
  `date` date DEFAULT NULL,
  `invoiceitem_invoiceitemid` int DEFAULT NULL,
  PRIMARY KEY (`idreturn_from_customer`),
  KEY `fk_invoiceitem_idx` (`invoiceitem_invoiceitemid`),
  CONSTRAINT `fk_invoiceitem` FOREIGN KEY (`invoiceitem_invoiceitemid`) REFERENCES `invoiceitem` (`invoiceitemid`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `return_from_customer`
--

LOCK TABLES `return_from_customer` WRITE;
/*!40000 ALTER TABLE `return_from_customer` DISABLE KEYS */;
INSERT INTO `return_from_customer` VALUES (1,'Expired',1,20,'2022-07-20',13),(2,'Expired',1,0,'2022-07-20',13),(3,'Expired',1,20,'2022-07-20',13),(4,'Expird',1,20,'2022-07-20',13),(5,'1',1,30,'2022-07-20',13),(6,'Expired',1,22,'2022-07-20',13),(7,'Expired',1,0,'2022-07-20',13),(8,'1',1,32,'2022-07-20',1);
/*!40000 ALTER TABLE `return_from_customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `return_to_supplier`
--

DROP TABLE IF EXISTS `return_to_supplier`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `return_to_supplier` (
  `idreturn_to_supplier` int NOT NULL AUTO_INCREMENT,
  `reason` text,
  `payment_received` double DEFAULT NULL,
  `qty` double DEFAULT NULL,
  `date` date DEFAULT NULL,
  `grnitem_idgrnitem` int NOT NULL,
  PRIMARY KEY (`idreturn_to_supplier`),
  KEY `fk_return_to_supplier_grnitem1_idx` (`grnitem_idgrnitem`),
  CONSTRAINT `fk_return_to_supplier_grnitem1` FOREIGN KEY (`grnitem_idgrnitem`) REFERENCES `grnitem` (`idgrnitem`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `return_to_supplier`
--

LOCK TABLES `return_to_supplier` WRITE;
/*!40000 ALTER TABLE `return_to_supplier` DISABLE KEYS */;
INSERT INTO `return_to_supplier` VALUES (1,'broken carton',0,5,'2022-07-20',4),(2,'Expired',0,2,'2022-07-20',5),(3,'Expired',0,1,'2022-06-10',1);
/*!40000 ALTER TABLE `return_to_supplier` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salary`
--

DROP TABLE IF EXISTS `salary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `salary` (
  `idsalary` int NOT NULL AUTO_INCREMENT,
  `month` date DEFAULT NULL,
  `salary` double DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `employee_idemployee` int NOT NULL,
  PRIMARY KEY (`idsalary`),
  KEY `fk_salary_employee1_idx` (`employee_idemployee`),
  CONSTRAINT `fk_salary_employee1` FOREIGN KEY (`employee_idemployee`) REFERENCES `employee` (`idemployee`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salary`
--

LOCK TABLES `salary` WRITE;
/*!40000 ALTER TABLE `salary` DISABLE KEYS */;
INSERT INTO `salary` VALUES (4,'2022-07-23',10000,'1',3),(5,'2022-08-11',20000,'1',3),(6,'2022-07-29',30000,'1',4);
/*!40000 ALTER TABLE `salary` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shop`
--

DROP TABLE IF EXISTS `shop`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `shop` (
  `idshop` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `reg_no` varchar(45) DEFAULT NULL,
  `other` text,
  `phone` varchar(10) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idshop`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shop`
--

LOCK TABLES `shop` WRITE;
/*!40000 ALTER TABLE `shop` DISABLE KEYS */;
INSERT INTO `shop` VALUES (1,'Meegoda Supermarket','Meegoda','BCS/1234','awards won----2,,,,awards----merit and silver','0114572365','supermarketmeegoda@gmail.com');
/*!40000 ALTER TABLE `shop` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stock`
--

DROP TABLE IF EXISTS `stock`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stock` (
  `idstock` int NOT NULL AUTO_INCREMENT,
  `item_iditem` int NOT NULL,
  `qty` double DEFAULT NULL,
  `selling_price` double DEFAULT NULL,
  `expiredate` date DEFAULT NULL,
  `grnitem_idgrnitem` int DEFAULT '1',
  `status` int DEFAULT '1',
  PRIMARY KEY (`idstock`),
  KEY `fk_stock_item1` (`item_iditem`),
  KEY `fk_grnitem` (`grnitem_idgrnitem`),
  CONSTRAINT `fk_grnitem` FOREIGN KEY (`grnitem_idgrnitem`) REFERENCES `grnitem` (`idgrnitem`),
  CONSTRAINT `fk_stock_item1` FOREIGN KEY (`item_iditem`) REFERENCES `item` (`iditem`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stock`
--

LOCK TABLES `stock` WRITE;
/*!40000 ALTER TABLE `stock` DISABLE KEYS */;
INSERT INTO `stock` VALUES (1,1,5,500,'2022-10-26',1,1),(2,2,6,123,'2022-04-09',7,0),(3,3,7,20,'2022-05-06',5,0),(4,1,1,25,'2022-05-08',4,0),(5,1,2,25,'2022-05-08',8,0),(6,1,0,500,'2022-05-31',6,0),(7,3,2,15,'2022-05-06',9,0),(8,2,12,210,'2022-05-07',10,0),(9,3,4,105,'2022-05-03',11,0),(10,1,12,120,'2022-07-21',12,0),(11,1,15,20,'2022-07-21',13,0),(12,6,15,120,'2022-07-22',14,0),(13,3,0,20,'2022-05-06',5,-1),(14,7,24,170,'2023-02-16',15,1),(15,6,5,980,'2030-07-24',16,1),(16,1,25,945,'2022-03-24',17,0),(17,2,10,1500,'2023-08-21',18,1),(18,8,2400,500,'2024-08-09',19,1),(19,7,50,300,'2022-10-19',20,0),(20,2,5,250,'2022-08-31',21,0),(21,3,10,300,'2022-08-31',22,0),(22,10,7,250,'2022-10-09',23,0),(23,5,10,120,'2022-10-29',24,1),(24,5,10,200,'2022-10-31',25,1);
/*!40000 ALTER TABLE `stock` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `supplier`
--

DROP TABLE IF EXISTS `supplier`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `supplier` (
  `idsupplier` int NOT NULL AUTO_INCREMENT,
  `name` varchar(200) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `street` varchar(45) DEFAULT NULL,
  `no` varchar(45) DEFAULT NULL,
  `mobile` int DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `status` int DEFAULT '1',
  PRIMARY KEY (`idsupplier`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `supplier`
--

LOCK TABLES `supplier` WRITE;
/*!40000 ALTER TABLE `supplier` DISABLE KEYS */;
INSERT INTO `supplier` VALUES (1,'Rajitha ','Kandy','hill street 123','12312',701234567,'rajithayassas@gmail.com',1),(2,'Amal','Gampaha','Main street','01',751234567,'amal@yahoo.com',0),(3,'Nilaksha','Padukka','Arukwaththa','36',711234567,'pradeep18@gmail.com',1),(4,'Eshan','Piliyandala','Main rd.','12',771234567,'eshan@gmail.com',1);
/*!40000 ALTER TABLE `supplier` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `time_off_requests`
--

DROP TABLE IF EXISTS `time_off_requests`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `time_off_requests` (
  `idtime_off_requests` int NOT NULL AUTO_INCREMENT,
  `reason` text,
  `begin_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  `employee_idemployee` int NOT NULL,
  PRIMARY KEY (`idtime_off_requests`),
  KEY `fk_time_off_requests_employee1_idx` (`employee_idemployee`),
  CONSTRAINT `fk_time_off_requests_employee1` FOREIGN KEY (`employee_idemployee`) REFERENCES `employee` (`idemployee`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `time_off_requests`
--

LOCK TABLES `time_off_requests` WRITE;
/*!40000 ALTER TABLE `time_off_requests` DISABLE KEYS */;
INSERT INTO `time_off_requests` VALUES (1,'Family Emergency','2022-07-23 11:58:00','2022-07-23 13:00:00',4),(2,'Family Emergency extended time off request','2022-07-23 13:00:00','2022-07-23 15:00:00',3),(3,'Emergency','2022-08-02 10:00:00','2022-08-02 12:00:00',4);
/*!40000 ALTER TABLE `time_off_requests` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `nic` varchar(13) NOT NULL,
  `password` varchar(45) DEFAULT NULL,
  `fname` varchar(45) DEFAULT NULL,
  `lname` varchar(45) DEFAULT NULL,
  `img` text,
  `dob` varchar(45) DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `mobile1` varchar(45) DEFAULT NULL,
  `mobile2` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `civil_status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`nic`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('123456789V','1234','Manel','Silva','C:/Users/User/Documents/Images/man1.jpg','1912-11-21','male','manel@gmail.com','0112345689','0701234567','colombo','Married');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-10-22 23:27:47
