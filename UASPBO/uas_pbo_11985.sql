-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Waktu pembuatan: 12 Jul 2021 pada 05.42
-- Versi server: 10.4.19-MariaDB
-- Versi PHP: 8.0.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `uas_pbo_11985`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `nilai`
--

CREATE TABLE `nilai` (
  `id_mhs` int(5) NOT NULL,
  `nama_mhs` varchar(50) NOT NULL,
  `nama_matkul` varchar(30) NOT NULL,
  `sks` int(3) NOT NULL,
  `semester` int(3) NOT NULL,
  `uts` int(3) DEFAULT NULL,
  `uas` int(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `nilai`
--

INSERT INTO `nilai` (`id_mhs`, `nama_mhs`, `nama_matkul`, `sks`, `semester`, `uts`, `uas`) VALUES
(11923, 'Junaedi', 'PBO', 4, 4, 4, 4),
(11982, 'Irfan', 'PBO', 4, 4, 40, 50),
(11923, 'Junaedi', 'Web Lanjut', 3, 4, 90, 80);

-- --------------------------------------------------------

--
-- Struktur dari tabel `users`
--

CREATE TABLE `users` (
  `id_users` int(10) NOT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  `jk` char(1) DEFAULT NULL,
  `role` char(3) NOT NULL DEFAULT 'MHS'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `users`
--

INSERT INTO `users` (`id_users`, `nama`, `password`, `jk`, `role`) VALUES
(11923, 'Junaedi', NULL, 'L', 'MHS'),
(11982, 'Irfan', NULL, 'L', 'MHS'),
(11985, 'Lukman', 'lukman', 'L', 'DSN');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `nilai`
--
ALTER TABLE `nilai`
  ADD KEY `id_mhs` (`id_mhs`);

--
-- Indeks untuk tabel `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id_users`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
