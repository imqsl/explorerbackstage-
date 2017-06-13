/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.5.19 : Database - bigdata
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`bigdata` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `bigdata`;

/*Table structure for table `perbigdata` */

DROP TABLE IF EXISTS `perbigdata`;

CREATE TABLE `perbigdata` (
  `id` int(100) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `sex` varchar(20) DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL,
  `phonenum` varchar(20) DEFAULT NULL,
  `qq` varchar(50) DEFAULT NULL,
  `wechat` varchar(50) DEFAULT NULL,
  `alipay` varchar(50) DEFAULT NULL,
  `baidu` varchar(50) DEFAULT NULL,
  `jd` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `perbigdata` */

insert  into `perbigdata`(`id`,`name`,`sex`,`email`,`phonenum`,`qq`,`wechat`,`alipay`,`baidu`,`jd`) values (1,'马云','男','jackma@ali.com','18789009800','232342343','jackma','jackma','jackma','jackma'),(2,'aa','男','jackma@ali.com','18789009800','232342343','jackma','jackma','jackma','jackma');

/*Table structure for table `user_info` */

DROP TABLE IF EXISTS `user_info`;

CREATE TABLE `user_info` (
  `username` varchar(20) NOT NULL,
  `userpwd` varchar(20) NOT NULL,
  `realname` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user_info` */

insert  into `user_info`(`username`,`userpwd`,`realname`,`email`,`phone`) values ('aa','aa','啊啊','aa@163.com','17340111123'),('bb','bb','不包','bb@qq.com','15923219343'),('kk','kk','卡卡','imkk@163.com','199099');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
