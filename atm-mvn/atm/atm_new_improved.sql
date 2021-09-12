-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 12, 2021 at 07:09 PM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 8.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `atm`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE `account` (
  `account_no` varchar(11) NOT NULL,
  `cif_no` int(12) NOT NULL,
  `acc_bal` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`account_no`, `cif_no`, `acc_bal`) VALUES
('1010101010', 1111111111, 64962),
('1090190828', 2147483647, 54000),
('1112223344', 1234567890, 53944),
('1313131313', 454545454, 1400000),
('2147483647', 222222222, 560000),
('3333300000', 333333333, 300000),
('4444400000', 444444444, 455000),
('5555500000', 555555555, 600000),
('9867000000', 987655443, 23000),
('9898900000', 989898989, 23501);

-- --------------------------------------------------------

--
-- Table structure for table `account_transaction`
--

CREATE TABLE `account_transaction` (
  `account_no` varchar(11) NOT NULL,
  `trans_id` int(11) NOT NULL,
  `trans_amt` int(5) NOT NULL,
  `previous_bal` int(20) NOT NULL,
  `updated_bal` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `account_transaction`
--

INSERT INTO `account_transaction` (`account_no`, `trans_id`, `trans_amt`, `previous_bal`, `updated_bal`) VALUES
('989890000', 1, 1000, 16500, 17500),
('1090190828', 101102, 1313, 0, 0),
('1090190828', 101103, 2000, 10000, 0),
('1090190828', 101104, 1000, 10000, 9000),
('1090190828', 101105, 1000, 10000, 9000),
('1313131313', 101108, 50000, 1350000, 1400000),
('1090190828', 101109, 2000, 50000, 52000),
('1090190828', 101110, 1000, 52000, 53000),
('1112223344', 101111, 5000, 59995, 54995),
('1090190828', 101112, 1000, 53000, 54000),
('1112223344', 101113, 1001, 54995, 53994),
('1112223344', 101116, 50, 53994, 53944),
('1010101010', 101120, 5000, 59962, 64962);

-- --------------------------------------------------------

--
-- Table structure for table `atm_machine`
--

CREATE TABLE `atm_machine` (
  `machine_id` int(11) NOT NULL,
  `Location` varchar(30) NOT NULL,
  `atm_balance` int(20) NOT NULL,
  `rs50` int(6) NOT NULL,
  `rs100` int(6) NOT NULL,
  `rs500` int(6) NOT NULL,
  `rs1000` int(6) NOT NULL,
  `rs2000` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `atm_machine`
--

INSERT INTO `atm_machine` (`machine_id`, `Location`, `atm_balance`, `rs50`, `rs100`, `rs500`, `rs1000`, `rs2000`) VALUES
(1010000000, 'Panaji', 7310950, 1999, 2000, 2000, 2007, 2002);

-- --------------------------------------------------------

--
-- Table structure for table `atm_transaction`
--

CREATE TABLE `atm_transaction` (
  `trans_id` int(11) NOT NULL,
  `machine_id` int(11) NOT NULL,
  `card_num` varchar(255) NOT NULL,
  `account_no` varchar(11) NOT NULL,
  `trans_type` varchar(10) NOT NULL,
  `trans_amt` int(5) NOT NULL,
  `trans_time` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `status` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `atm_transaction`
--

INSERT INTO `atm_transaction` (`trans_id`, `machine_id`, `card_num`, `account_no`, `trans_type`, `trans_amt`, `trans_time`, `status`) VALUES
(1, 1010000000, 'dd871400f48e1831390b7fd9503ce8cb', '989890000', 'DEPOSIT', 1000, '2021-09-12 14:30:13', 'PASSED'),
(101102, 1010000000, 'dc9f36ae10f3dece270197d038f7d9e9', '1090190828', 'WITHDRAW', 1313, '2021-09-12 14:31:47', 'PASSED'),
(101103, 1010000000, 'dc9f36ae10f3dece270197d038f7d9e9', '1090190828', 'DEPOSIT', 2000, '2021-09-12 14:32:10', 'PASSED'),
(101104, 1010000000, 'dc9f36ae10f3dece270197d038f7d9e9', '1090190828', 'WITHDRAW', 1000, '2021-09-12 14:31:47', 'PASSED'),
(101105, 1010000000, 'dc9f36ae10f3dece270197d038f7d9e9', '1090190828', 'TRANSFER', 1000, '2021-09-12 14:30:13', 'PASSED'),
(101106, 1010000000, 'dc9f36ae10f3dece270197d038f7d9e9', '1090190828', 'TRANSFER', 3000, '2021-09-12 14:30:13', 'PASSED'),
(101107, 1010000000, '7b8802b5aa06e55f70c9d8711213364b', '1112223344', 'DEPOSIT', 5000, '2021-09-12 14:30:13', 'PASSED'),
(101108, 1010000000, '1a2f67c9bc8b33b5347d682994013dac', '1313131313', 'DEPOSIT', 50000, '2021-09-12 14:30:13', 'PASSED'),
(101109, 1010000000, 'dc9f36ae10f3dece270197d038f7d9e9', '1090190828', 'DEPOSIT', 2000, '2021-09-12 14:30:13', 'PASSED'),
(101110, 1010000000, 'dc9f36ae10f3dece270197d038f7d9e9', '1090190828', 'DEPOSIT', 1000, '2021-09-12 14:30:13', 'PASSED'),
(101111, 1010000000, '7b8802b5aa06e55f70c9d8711213364b', '1112223344', 'TRANSFER', 5000, '2021-09-12 14:30:13', 'PASSED'),
(101112, 1010000000, 'dc9f36ae10f3dece270197d038f7d9e9', '1090190828', 'DEPOSIT', 1000, '2021-09-12 14:30:13', 'PASSED'),
(101113, 1010000000, '7b8802b5aa06e55f70c9d8711213364b', '1112223344', 'TRANSFER', 1001, '2021-09-12 14:30:13', 'PASSED'),
(101114, 1010000000, '7b8802b5aa06e55f70c9d8711213364b', '1112223344', 'TRANSFER', 1, '2021-09-12 14:23:14', 'CANCELLED'),
(101115, 1010000000, '7b8802b5aa06e55f70c9d8711213364b', '1112223344', 'DEPOSIT', 7000, '2021-09-12 14:26:18', 'CANCELLED'),
(101116, 1010000000, '7b8802b5aa06e55f70c9d8711213364b', '1112223344', 'WITHDRAW', 50, '2021-09-12 14:30:13', 'PASSED'),
(101117, 1010000000, '8a0574a7778534d9c1c15e7ffe947686', '1010101010', 'TRANSFER', 0, '2021-09-12 15:25:58', 'CANCELLED'),
(101118, 1010000000, '8a0574a7778534d9c1c15e7ffe947686', '1010101010', 'DEPOSIT', 4000, '2021-09-12 16:55:58', 'PASSED'),
(101119, 1010000000, '8a0574a7778534d9c1c15e7ffe947686', '1010101010', 'DEPOSIT', 1000, '2021-09-12 17:01:09', 'PASSED'),
(101120, 1010000000, '8a0574a7778534d9c1c15e7ffe947686', '1010101010', 'DEPOSIT', 5000, '2021-09-12 17:07:32', 'PASSED');

--
-- Triggers `atm_transaction`
--
DELIMITER $$
CREATE TRIGGER `update_account_transaction` AFTER INSERT ON `atm_transaction` FOR EACH ROW BEGIN
    IF new.status='PASSED' THEN
    	if new.trans_type = "WITHDRAW" OR new.trans_type = "TRANSFER" THEN
            INSERT INTO account_transaction(account_no, trans_id, trans_amt, previous_bal, updated_bal)                      VALUES(new.account_no, new.trans_id, new.trans_amt, (SELECT acc_bal FROM account WHERE account_no=new.account_no), (SELECT acc_bal FROM account WHERE account_no=new.account_no)-new.trans_amt);
            
            UPDATE account
            set acc_bal = (SELECT acc_bal FROM account WHERE account_no=new.account_no)-new.trans_amt WHERE account_no=new.account_no;
        
        ELSE
        	INSERT INTO account_transaction(account_no, trans_id, trans_amt, previous_bal, updated_bal)                      VALUES(new.account_no, new.trans_id, new.trans_amt, (SELECT acc_bal FROM account WHERE account_no=new.account_no), (SELECT acc_bal FROM account WHERE account_no=new.account_no)+new.trans_amt);
            
            UPDATE account
            set acc_bal = (SELECT acc_bal FROM account WHERE account_no=new.account_no)+new.trans_amt WHERE account_no=new.account_no;
            
        end IF;
        
	END IF;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `card_pin_hash`
--

CREATE TABLE `card_pin_hash` (
  `card_num` varchar(16) NOT NULL,
  `pin` int(4) NOT NULL,
  `cardHash` varchar(255) NOT NULL,
  `pinHash` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `card_pin_hash`
--

INSERT INTO `card_pin_hash` (`card_num`, `pin`, `cardHash`, `pinHash`) VALUES
('1090111122228287', 1234, 'dc9f36ae10f3dece270197d038f7d9e9', '81dc9bdb52d04dc20036dbd8313ed055'),
('1111000011110000', 1111, '8a0574a7778534d9c1c15e7ffe947686', 'b59c67bf196a4758191e42f76670ceba'),
('1111222233334444', 1234, '7b8802b5aa06e55f70c9d8711213364b', '81dc9bdb52d04dc20036dbd8313ed055'),
('1300130013001300', 1313, '1a2f67c9bc8b33b5347d682994013dac', 'f09696910bdd874a99cd74c8f05b5c44'),
('2222000022220000', 2222, 'dd8804e29b39e7467e163fa1001d66d7', '934b535800b1cba8f96a5d72f72f1611'),
('3333000033330000', 3333, '68be7812115b2dda5da9d049b0666d72', '2be9bd7a3434f7038ca27d1918de58bd'),
('4444000044440000', 4040, '96d8e924bbbe2593d3aec3f181286a0e', 'ca4b33532855080dfa79cf8a925d146d'),
('5555500000556655', 5050, '975c2530bf13151a574234f455ece50b', '8977ecbb8cb82d77fb091c7a7f186163'),
('9867000011110000', 9868, '73bc52fdb7070850abda49d4625c1b0f', '76460865551007d38ffbb834d5896ea4'),
('9898000098980000', 9898, 'dd871400f48e1831390b7fd9503ce8cb', '7b9dc501afe4ee11c56a4831e20cee71');

-- --------------------------------------------------------

--
-- Table structure for table `card_types`
--

CREATE TABLE `card_types` (
  `card_type` varchar(30) NOT NULL,
  `limit_per_day` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `card_types`
--

INSERT INTO `card_types` (`card_type`, `limit_per_day`) VALUES
('GOLD', 50000),
('PLATINUM', 75000),
('SILVER', 25000);

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `cif_no` int(12) NOT NULL,
  `name` varchar(30) NOT NULL,
  `address` varchar(100) NOT NULL,
  `email` varchar(40) NOT NULL,
  `contact` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`cif_no`, `name`, `address`, `email`, `contact`) VALUES
(222222222, 'Pam Beesly', 'Austin', 'pambeesly@gmail.com', 982213000),
(333333333, 'Angela Martin', 'Scranton', 'angelamartin@gmail.com', 987868587),
(444444444, 'Erin Hannon', 'San Francisco', 'erinh@gamil.com', 985845342),
(454545454, 'Dwight Schrute', 'Schrute Farms', 'dscrute@gmail.com', 982213903),
(555555555, 'Andy Bernard', 'Cornell', 'andybernanrd@gmail.com', 923624352),
(987655443, 'Toby Flenderson', 'New York City', 'tobyf@gmail.com', 765656444),
(989898989, 'Creed Bratton', 'Scranton', 'creedb@gmail.com', 1676567418),
(1111111111, 'Jim Halpert', 'Austin', 'jimhalpert@gmail.com', 1111111111),
(1234567890, 'Michael Scott', 'America Earth', 'mike@gmail.com', 832100),
(2147483647, 'John Downey', 'Goa India', 'johnd@gmail.com', 1234567890);

-- --------------------------------------------------------

--
-- Table structure for table `debit_card`
--

CREATE TABLE `debit_card` (
  `card_no` varchar(255) NOT NULL,
  `card_holder_name` varchar(20) NOT NULL,
  `card_type` varchar(30) NOT NULL,
  `issue_date` date NOT NULL,
  `expiry_date` date NOT NULL,
  `account_no` varchar(11) NOT NULL,
  `limit_amt` int(5) NOT NULL,
  `card_status` text NOT NULL,
  `pin` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `debit_card`
--

INSERT INTO `debit_card` (`card_no`, `card_holder_name`, `card_type`, `issue_date`, `expiry_date`, `account_no`, `limit_amt`, `card_status`, `pin`) VALUES
('1a2f67c9bc8b33b5347d682994013dac', 'Dwight Schrute', 'PLATINUM', '2012-09-01', '2031-09-18', '1313131313', 75000, 'ACTIVE', 'f09696910bdd874a99cd74c8f05b5c44'),
('68be7812115b2dda5da9d049b0666d72', 'Angela Martin', 'GOLD', '2012-09-01', '2028-09-08', '3333300000', 50000, 'ACTIVE', '2be9bd7a3434f7038ca27d1918de58bd'),
('73bc52fdb7070850abda49d4625c1b0f', 'Toby Flenderson', 'SILVER', '2021-08-10', '2025-09-24', '9867000000', 25000, 'BLOCKED', '76460865551007d38ffbb834d5896ea4'),
('7b8802b5aa06e55f70c9d8711213364b', 'Michael Scott', 'GOLD', '2015-09-02', '2024-09-10', '1112223344', 50000, 'BLOCKED', '81dc9bdb52d04dc20036dbd8313ed055'),
('8a0574a7778534d9c1c15e7ffe947686', 'Jim Halpert', 'SILVER', '2013-09-05', '2022-09-29', '1010101010', 25000, 'ACTIVE', 'b59c67bf196a4758191e42f76670ceba'),
('96d8e924bbbe2593d3aec3f181286a0e', 'Erin Hannon', 'GOLD', '2015-09-10', '2021-10-30', '4444400000', 50000, 'ACTIVE', 'ca4b33532855080dfa79cf8a925d146d'),
('975c2530bf13151a574234f455ece50b', 'Andy Bernard', 'GOLD', '2021-04-14', '2030-09-25', '5555500000', 50000, 'ACTIVE', '8977ecbb8cb82d77fb091c7a7f186163'),
('dc9f36ae10f3dece270197d038f7d9e9', 'John Downey', 'SILVER', '2021-09-15', '2021-09-30', '1090190828', 25000, 'ACTIVE', '81dc9bdb52d04dc20036dbd8313ed055'),
('dd871400f48e1831390b7fd9503ce8cb', 'Creed Bratton', 'PLATINUM', '2015-09-23', '2019-09-19', '9898900000', 75000, 'BLOCKED', '7b9dc501afe4ee11c56a4831e20cee71'),
('dd8804e29b39e7467e163fa1001d66d7', 'Pam Beesly', 'SILVER', '2015-09-09', '2027-09-30', '2147483647', 25000, 'ACTIVE', '934b535800b1cba8f96a5d72f72f1611');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`account_no`),
  ADD KEY `cif_constraint` (`cif_no`);

--
-- Indexes for table `account_transaction`
--
ALTER TABLE `account_transaction`
  ADD PRIMARY KEY (`trans_id`),
  ADD KEY `fk_account_no` (`account_no`),
  ADD KEY `fk_trans_id` (`trans_id`);

--
-- Indexes for table `atm_machine`
--
ALTER TABLE `atm_machine`
  ADD PRIMARY KEY (`machine_id`);

--
-- Indexes for table `atm_transaction`
--
ALTER TABLE `atm_transaction`
  ADD PRIMARY KEY (`trans_id`);

--
-- Indexes for table `card_types`
--
ALTER TABLE `card_types`
  ADD PRIMARY KEY (`card_type`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`cif_no`);

--
-- Indexes for table `debit_card`
--
ALTER TABLE `debit_card`
  ADD PRIMARY KEY (`card_no`),
  ADD KEY `card_constraint` (`account_no`),
  ADD KEY `fk_card_type` (`card_type`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `atm_transaction`
--
ALTER TABLE `atm_transaction`
  MODIFY `trans_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=101121;

DELIMITER $$
--
-- Events
--
CREATE DEFINER=`root`@`localhost` EVENT `update_limit` ON SCHEDULE EVERY 1 DAY STARTS '2014-01-18 00:00:00' ON COMPLETION NOT PRESERVE ENABLE DO UPDATE debit_card d 
SET limit_amt = (SELECT limit_per_day FROM card_types c WHERE c.card_type = d.card_type)$$

CREATE DEFINER=`root`@`localhost` EVENT `expired_card` ON SCHEDULE EVERY 1 MINUTE STARTS '2014-01-18 00:00:00' ON COMPLETION NOT PRESERVE ENABLE DO UPDATE debit_card
        SET card_status= "BLOCKED" WHERE expiry_date<month(curdate()) and expiry_date<=year(curdate())$$

DELIMITER ;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
