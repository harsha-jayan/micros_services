DROP DATABASE IF EXISTS springbootassgnmntdb;
CREATE DATABASE springbootassgnmntdb; 
USE springbootassgnmntdb;

DROP TABLE IF EXISTS customer;
CREATE TABLE IF NOT EXISTS customer (
  customerId int(11) unsigned NOT NULL AUTO_INCREMENT,
  customerName varchar(20) DEFAULT NULL,
  bill double DEFAULT NULL,
  billingDate DATE,
  PRIMARY KEY (customerId)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

INSERT INTO employee (employeeId, employeeName,departmentCode, salary) VALUES
	(1001, 'MSD'   ,101.0 , '2019-12-25'),
	(1002, 'James' ,101.9 , '2019-12-25'),
	(1003, 'Rocky' ,102.9 , '2019-12-25');
commit;
