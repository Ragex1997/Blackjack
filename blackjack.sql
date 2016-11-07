-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Gegenereerd op: 07 nov 2016 om 10:29
-- Serverversie: 10.1.16-MariaDB
-- PHP-versie: 5.6.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `blackjack`
--

-- --------------------------------------------------------

--
-- Tabelstructuur voor tabel `game`
--

CREATE TABLE `game` (
  `id` int(11) NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Gegevens worden geëxporteerd voor tabel `game`
--

INSERT INTO `game` (`id`, `date`) VALUES
(1, '2016-11-14');

-- --------------------------------------------------------

--
-- Tabelstructuur voor tabel `game_user`
--

CREATE TABLE `game_user` (
  `userid` int(11) NOT NULL,
  `gameid` int(11) NOT NULL,
  `blance` int(11) NOT NULL,
  `status` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Tabelstructuur voor tabel `icon`
--

CREATE TABLE `icon` (
  `id` int(11) NOT NULL,
  `location` varchar(255) NOT NULL,
  `name` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Gegevens worden geëxporteerd voor tabel `icon`
--

INSERT INTO `icon` (`id`, `location`, `name`) VALUES
(1, '\\Blackjack_Groep3\\rescources\\icons\\Aayla Secura Jedi.png', 'Aayla Secura Jedi.png'),
(2, '\\Blackjack_Groep3\\rescources\\icons\\Ackbar.png', 'Ackbar.png'),
(3, '\\Blackjack_Groep3\\rescources\\icons\\Ahsoka Tano.png', 'Ahsoka Tano.png'),
(4, '\\Blackjack_Groep3\\rescources\\icons\\Anakin Jedi - 01.png', 'Anakin Jedi - 01.png'),
(5, '\\Blackjack_Groep3\\rescources\\icons\\Anakin Jedi - 02.png', 'Anakin Jedi - 02.png'),
(6, '\\Blackjack_Groep3\\rescources\\icons\\Bail Organa.png', 'Bail Organa.png'),
(7, '\\Blackjack_Groep3\\rescources\\icons\\Battle Droid - 01.png', 'Battle Droid - 01.png'),
(8, '\\Blackjack_Groep3\\rescources\\icons\\Battle Droid - 02.png', 'Battle Droid - 02.png'),
(9, '\\Blackjack_Groep3\\rescources\\icons\\Bib Fortuna.png', 'Bib Fortuna.png'),
(10, '\\Blackjack_Groep3\\rescources\\icons\\Boba Fett.png', 'Boba Fett.png'),
(11, '\\Blackjack_Groep3\\rescources\\icons\\Boss Nass.png', 'Boss Nass.png'),
(12, '\\Blackjack_Groep3\\rescources\\icons\\C3P3.png', 'C3P3.png'),
(13, '\\Blackjack_Groep3\\rescources\\icons\\Chewbacca.png', 'Chewbacca.png'),
(14, '\\Blackjack_Groep3\\rescources\\icons\\Clone Commander Cody.png', 'Clone Commander Cody.png'),
(15, '\\Blackjack_Groep3\\rescources\\icons\\Clone Troopers.png', 'Clone Troopers.png'),
(16, '\\Blackjack_Groep3\\rescources\\icons\\Count Dooku - 01.png', 'Count Dooku - 01.png'),
(17, '\\Blackjack_Groep3\\rescources\\icons\\Count Dooku - 02.png', 'Count Dooku - 02.png'),
(18, '\\Blackjack_Groep3\\rescources\\icons\\Credits.png', 'Credits.png'),
(19, '\\Blackjack_Groep3\\rescources\\icons\\currency.jpg', 'currency.jpg'),
(20, '\\Blackjack_Groep3\\rescources\\icons\\Darth Maul - 01.png', 'Darth Maul - 01.png'),
(21, '\\Blackjack_Groep3\\rescources\\icons\\Darth Maul - 02.png', 'Darth Maul - 02.png'),
(22, '\\Blackjack_Groep3\\rescources\\icons\\Darth Sidious - 01.png', 'Darth Sidious - 01.png'),
(23, '\\Blackjack_Groep3\\rescources\\icons\\Darth Sidious - 02.png', 'Darth Sidious - 02.png'),
(24, '\\Blackjack_Groep3\\rescources\\icons\\Droideka.png', 'Droideka.png'),
(25, '\\Blackjack_Groep3\\rescources\\icons\\Ewoks.png', 'Ewoks.png'),
(26, '\\Blackjack_Groep3\\rescources\\icons\\General Grievous.png', 'General Grievous.png'),
(27, '\\Blackjack_Groep3\\rescources\\icons\\General Tarpals.png', 'General Tarpals.png'),
(28, '\\Blackjack_Groep3\\rescources\\icons\\Greedo.png', 'Greedo.png'),
(29, '\\Blackjack_Groep3\\rescources\\icons\\Han Solo - 01.png', 'Han Solo - 01.png'),
(30, '\\Blackjack_Groep3\\rescources\\icons\\Han Solo - 02.png', 'Han Solo - 02.png'),
(31, '\\Blackjack_Groep3\\rescources\\icons\\Imperial Probe Droid.png', 'Imperial Probe Droid.png'),
(32, '\\Blackjack_Groep3\\rescources\\icons\\Jango Fett.png', 'Jango Fett.png'),
(33, '\\Blackjack_Groep3\\rescources\\icons\\Jar Jar Binks.png', 'Jar Jar Binks.png'),
(34, '\\Blackjack_Groep3\\rescources\\icons\\Java the Hutt.png', 'Java the Hutt.png'),
(35, '\\Blackjack_Groep3\\rescources\\icons\\Jawas.png', 'Jawas.png'),
(36, '\\Blackjack_Groep3\\rescources\\icons\\Ki-Adi-Mundi.png', 'Ki-Adi-Mundi.png'),
(37, '\\Blackjack_Groep3\\rescources\\icons\\Kit Fisto.png', 'Kit Fisto.png'),
(38, '\\Blackjack_Groep3\\rescources\\icons\\Lando.png', 'Lando.png'),
(39, '\\Blackjack_Groep3\\rescources\\icons\\Leia.png', 'Leia.png'),
(40, '\\Blackjack_Groep3\\rescources\\icons\\Luke Skywalker - 01.png', 'Luke Skywalker - 01.png'),
(41, '\\Blackjack_Groep3\\rescources\\icons\\Luke Skywalker - 02.png', 'Luke Skywalker - 02.png'),
(42, '\\Blackjack_Groep3\\rescources\\icons\\Luke Skywalker - 03.png', 'Luke Skywalker - 03.png'),
(43, '\\Blackjack_Groep3\\rescources\\icons\\Mace Windu - 02.png', 'Mace Windu - 02.png'),
(44, '\\Blackjack_Groep3\\rescources\\icons\\Mace Windu.png', 'Mace Windu.png'),
(45, '\\Blackjack_Groep3\\rescources\\icons\\Master Obi-Wan.png', 'Master Obi-Wan.png'),
(46, '\\Blackjack_Groep3\\rescources\\icons\\Nute Gunray.png', 'Nute Gunray.png'),
(47, '\\Blackjack_Groep3\\rescources\\icons\\Old Obi-Wan.png', 'Old Obi-Wan.png'),
(48, '\\Blackjack_Groep3\\rescources\\icons\\Padme Amidala.png', 'Padme Amidala.png'),
(49, '\\Blackjack_Groep3\\rescources\\icons\\Panaka.png', 'Panaka.png'),
(50, '\\Blackjack_Groep3\\rescources\\icons\\Pit Droid.png', 'Pit Droid.png'),
(51, '\\Blackjack_Groep3\\rescources\\icons\\Plo Koon Jedi.png', 'Plo Koon Jedi.png'),
(52, '\\Blackjack_Groep3\\rescources\\icons\\Qui-Gon Jinn.png', 'Qui-Gon Jinn.png'),
(53, '\\Blackjack_Groep3\\rescources\\icons\\R2D2 - 01.png', 'R2D2 - 01.png'),
(54, '\\Blackjack_Groep3\\rescources\\icons\\R2D2 - 02.png', 'R2D2 - 02.png'),
(55, '\\Blackjack_Groep3\\rescources\\icons\\Sebulba.png', 'Sebulba.png'),
(56, '\\Blackjack_Groep3\\rescources\\icons\\Senator Palpatine.png', 'Senator Palpatine.png'),
(57, '\\Blackjack_Groep3\\rescources\\icons\\Stormtrooper - 01.png', 'Stormtrooper - 01.png'),
(58, '\\Blackjack_Groep3\\rescources\\icons\\Stormtrooper - 02.png', 'Stormtrooper - 02.png'),
(59, '\\Blackjack_Groep3\\rescources\\icons\\Super Battle Droid.png', 'Super Battle Droid.png'),
(60, '\\Blackjack_Groep3\\rescources\\icons\\Tarkin.png', 'Tarkin.png'),
(61, '\\Blackjack_Groep3\\rescources\\icons\\The Real Empire.png', 'The Real Empire.png'),
(62, '\\Blackjack_Groep3\\rescources\\icons\\Tusken Riders.png', 'Tusken Riders.png'),
(63, '\\Blackjack_Groep3\\rescources\\icons\\Vader - 01.png', 'Vader - 01.png'),
(64, '\\Blackjack_Groep3\\rescources\\icons\\Vader - 02.png', 'Vader - 02.png'),
(65, '\\Blackjack_Groep3\\rescources\\icons\\Vader - 03.png', 'Vader - 03.png'),
(66, '\\Blackjack_Groep3\\rescources\\icons\\Watto.png', 'Watto.png'),
(67, '\\Blackjack_Groep3\\rescources\\icons\\Wicket W. Warrick.png', 'Wicket W. Warrick.png'),
(68, '\\Blackjack_Groep3\\rescources\\icons\\Yoda - 01.png', 'Yoda - 01.png'),
(69, '\\Blackjack_Groep3\\rescources\\icons\\Yoda - 02.png', 'Yoda - 02.png');

-- --------------------------------------------------------

--
-- Tabelstructuur voor tabel `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `Iconid` int(11) NOT NULL,
  `nickname` varchar(30) NOT NULL,
  `balance` int(11) NOT NULL,
  `timePlayed` time NOT NULL,
  `isHeadUser` tinyint(1) DEFAULT '0',
  `email` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Gegevens worden geëxporteerd voor tabel `user`
--

INSERT INTO `user` (`id`, `Iconid`, `nickname`, `balance`, `timePlayed`, `isHeadUser`, `email`, `password`) VALUES
(1, 1, 'Anthony', 5, '00:00:00', 0, NULL, NULL),
(2, 4, 'Dries', 6, '00:00:00', 1, NULL, NULL),
(3, 12, 'Mark', 0, '00:00:00', 0, NULL, NULL),
(4, 19, 'Fazley', 18, '00:00:00', 0, NULL, NULL),
(5, 66, 'Luke', 51, '00:00:00', 0, NULL, NULL);

--
-- Indexen voor geëxporteerde tabellen
--

--
-- Indexen voor tabel `game`
--
ALTER TABLE `game`
  ADD PRIMARY KEY (`id`);

--
-- Indexen voor tabel `icon`
--
ALTER TABLE `icon`
  ADD PRIMARY KEY (`id`);

--
-- Indexen voor tabel `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`),
  ADD KEY `Iconid` (`Iconid`);

--
-- AUTO_INCREMENT voor geëxporteerde tabellen
--

--
-- AUTO_INCREMENT voor een tabel `game`
--
ALTER TABLE `game`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT voor een tabel `icon`
--
ALTER TABLE `icon`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=70;
--
-- AUTO_INCREMENT voor een tabel `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
