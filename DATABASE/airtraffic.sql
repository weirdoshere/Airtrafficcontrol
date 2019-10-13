-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Oct 13, 2019 at 10:22 AM
-- Server version: 10.4.8-MariaDB
-- PHP Version: 7.3.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `airtraffic`
--

-- --------------------------------------------------------

--
-- Table structure for table `syria`
--

CREATE TABLE `syria` (
  `aircraft number` int(5) NOT NULL,
  `aircraft` varchar(20) NOT NULL,
  `intime` time NOT NULL,
  `outtime` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `syria`
--

INSERT INTO `syria` (`aircraft number`, `aircraft`, `intime`, `outtime`) VALUES
(4, 'Air Asia C43', '05:45:00', '06:15:00'),
(3, 'Air India B48    ', '00:42:00', '00:57:00'),
(2, 'British Airways A287', '02:15:00', '02:45:00'),
(5, 'DHL Cargo 747 ', '22:00:00', '22:30:00'),
(1, 'Emirates Boeing 301', '16:40:00', '16:55:00');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `syria`
--
ALTER TABLE `syria`
  ADD PRIMARY KEY (`aircraft`),
  ADD UNIQUE KEY `aircraft number` (`aircraft number`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
