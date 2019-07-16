-- phpMyAdmin SQL Dump
-- version 4.8.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 16, 2019 at 05:23 AM
-- Server version: 10.1.34-MariaDB
-- PHP Version: 7.2.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `syums`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE `account` (
  `email` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `password` varchar(60) COLLATE utf8mb4_unicode_ci NOT NULL,
  `user_id` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `activity`
--

CREATE TABLE `activity` (
  `id` bigint(20) NOT NULL,
  `description` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `endDate` datetime DEFAULT NULL,
  `location` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `name` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `startDate` datetime NOT NULL,
  `ownedBy` bigint(20) NOT NULL,
  `createdBy` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `actvity_regiter`
--

CREATE TABLE `actvity_regiter` (
  `id` bigint(20) NOT NULL,
  `activityId` bigint(20) DEFAULT NULL,
  `peopleId` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `card`
--

CREATE TABLE `card` (
  `id` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `peopleId` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `organisation`
--

CREATE TABLE `organisation` (
  `id` bigint(20) NOT NULL,
  `description` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `name` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `nickname` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `parentId` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `people`
--

CREATE TABLE `people` (
  `id` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `firstName` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `hasAccount` bit(1) NOT NULL,
  `isOfficer` bit(1) NOT NULL,
  `lastName` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `people_detail`
--

CREATE TABLE `people_detail` (
  `id` bigint(20) NOT NULL,
  `socialKey` int(11) DEFAULT NULL,
  `socialValue` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `peopleId` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `position`
--

CREATE TABLE `position` (
  `id` bigint(20) NOT NULL,
  `description` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `isMaster` bit(1) DEFAULT NULL,
  `name` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `position_scope`
--

CREATE TABLE `position_scope` (
  `positionId` bigint(20) NOT NULL,
  `scope` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `recruit`
--

CREATE TABLE `recruit` (
  `id` bigint(20) NOT NULL,
  `orgId` bigint(20) NOT NULL,
  `peopleId` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `positionId` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `scope`
--

CREATE TABLE `scope` (
  `id` bigint(20) NOT NULL,
  `scope` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `time_keeping`
--

CREATE TABLE `time_keeping` (
  `id` bigint(20) NOT NULL,
  `checkIn` datetime DEFAULT NULL,
  `checkOut` datetime DEFAULT NULL,
  `activityId` bigint(20) DEFAULT NULL,
  `peopleId` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`user_id`);

--
-- Indexes for table `activity`
--
ALTER TABLE `activity`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK3x7u8g6m3qc8uqrdcedn29q4b` (`ownedBy`),
  ADD KEY `FKq4bg1na9lewt7upiwlkyslyfn` (`createdBy`);

--
-- Indexes for table `actvity_regiter`
--
ALTER TABLE `actvity_regiter`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKkvkmq77h8w2dfxm31cauxk6ph` (`activityId`),
  ADD KEY `FK20bolc9cnkhhq9oxtflve0uhv` (`peopleId`);

--
-- Indexes for table `card`
--
ALTER TABLE `card`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK8gutd8144cl40uyaufqn9wwn6` (`peopleId`);

--
-- Indexes for table `organisation`
--
ALTER TABLE `organisation`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK629bf96hajd5w0k43hslfn6fp` (`parentId`);

--
-- Indexes for table `people`
--
ALTER TABLE `people`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `people_detail`
--
ALTER TABLE `people_detail`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKbgp3f7ajnm35fxfilyld0pyla` (`peopleId`);

--
-- Indexes for table `position`
--
ALTER TABLE `position`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `position_scope`
--
ALTER TABLE `position_scope`
  ADD PRIMARY KEY (`positionId`,`scope`),
  ADD KEY `FK1x7l7um40uw2bpr7wig15hbgf` (`scope`);

--
-- Indexes for table `recruit`
--
ALTER TABLE `recruit`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKddu551vqei5v2wedtshretx1t` (`orgId`),
  ADD KEY `FKt0bc53740i4sy2inyruxmlbn0` (`peopleId`),
  ADD KEY `FK1dvyus2qkrf5srnhr9hpxw9js` (`positionId`);

--
-- Indexes for table `scope`
--
ALTER TABLE `scope`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `time_keeping`
--
ALTER TABLE `time_keeping`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK36e3h3f2ua3hp3sji3y15gtt3` (`activityId`),
  ADD KEY `FK207oj6byvp3hq1mnv37ocm01k` (`peopleId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `activity`
--
ALTER TABLE `activity`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `actvity_regiter`
--
ALTER TABLE `actvity_regiter`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `organisation`
--
ALTER TABLE `organisation`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `people_detail`
--
ALTER TABLE `people_detail`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `position`
--
ALTER TABLE `position`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `recruit`
--
ALTER TABLE `recruit`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `scope`
--
ALTER TABLE `scope`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `time_keeping`
--
ALTER TABLE `time_keeping`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `account`
--
ALTER TABLE `account`
  ADD CONSTRAINT `FKf54pco6kcj5xvwndumeq9iax9` FOREIGN KEY (`user_id`) REFERENCES `people` (`id`);

--
-- Constraints for table `activity`
--
ALTER TABLE `activity`
  ADD CONSTRAINT `FK3x7u8g6m3qc8uqrdcedn29q4b` FOREIGN KEY (`ownedBy`) REFERENCES `organisation` (`id`),
  ADD CONSTRAINT `FKq4bg1na9lewt7upiwlkyslyfn` FOREIGN KEY (`createdBy`) REFERENCES `people` (`id`);

--
-- Constraints for table `actvity_regiter`
--
ALTER TABLE `actvity_regiter`
  ADD CONSTRAINT `FK20bolc9cnkhhq9oxtflve0uhv` FOREIGN KEY (`peopleId`) REFERENCES `people` (`id`),
  ADD CONSTRAINT `FKkvkmq77h8w2dfxm31cauxk6ph` FOREIGN KEY (`activityId`) REFERENCES `activity` (`id`);

--
-- Constraints for table `card`
--
ALTER TABLE `card`
  ADD CONSTRAINT `FK8gutd8144cl40uyaufqn9wwn6` FOREIGN KEY (`peopleId`) REFERENCES `people` (`id`);

--
-- Constraints for table `organisation`
--
ALTER TABLE `organisation`
  ADD CONSTRAINT `FK629bf96hajd5w0k43hslfn6fp` FOREIGN KEY (`parentId`) REFERENCES `organisation` (`id`);

--
-- Constraints for table `people_detail`
--
ALTER TABLE `people_detail`
  ADD CONSTRAINT `FKbgp3f7ajnm35fxfilyld0pyla` FOREIGN KEY (`peopleId`) REFERENCES `people` (`id`);

--
-- Constraints for table `position_scope`
--
ALTER TABLE `position_scope`
  ADD CONSTRAINT `FK1x7l7um40uw2bpr7wig15hbgf` FOREIGN KEY (`scope`) REFERENCES `scope` (`id`),
  ADD CONSTRAINT `FKpjmqtfabof8hxpm6f3wesfrht` FOREIGN KEY (`positionId`) REFERENCES `position` (`id`);

--
-- Constraints for table `recruit`
--
ALTER TABLE `recruit`
  ADD CONSTRAINT `FK1dvyus2qkrf5srnhr9hpxw9js` FOREIGN KEY (`positionId`) REFERENCES `position` (`id`),
  ADD CONSTRAINT `FKddu551vqei5v2wedtshretx1t` FOREIGN KEY (`orgId`) REFERENCES `organisation` (`id`),
  ADD CONSTRAINT `FKt0bc53740i4sy2inyruxmlbn0` FOREIGN KEY (`peopleId`) REFERENCES `people` (`id`);

--
-- Constraints for table `time_keeping`
--
ALTER TABLE `time_keeping`
  ADD CONSTRAINT `FK207oj6byvp3hq1mnv37ocm01k` FOREIGN KEY (`peopleId`) REFERENCES `people` (`id`),
  ADD CONSTRAINT `FK36e3h3f2ua3hp3sji3y15gtt3` FOREIGN KEY (`activityId`) REFERENCES `activity` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
