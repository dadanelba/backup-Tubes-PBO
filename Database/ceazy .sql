-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 02 Des 2019 pada 03.04
-- Versi Server: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `ceazy`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `hint` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `admin`
--

INSERT INTO `admin` (`username`, `password`, `hint`) VALUES
('admin', 'admin123', 'admin');

-- --------------------------------------------------------

--
-- Struktur dari tabel `datasementara`
--

CREATE TABLE IF NOT EXISTS `datasementara` (
`id` int(6) NOT NULL,
  `namaPemesan` varchar(50) NOT NULL,
  `namaPesanan` varchar(50) DEFAULT NULL,
  `hargaPesanan` int(6) NOT NULL,
  `nomorMeja` varchar(10) NOT NULL,
  `tanggalPesanan` varchar(50) DEFAULT NULL,
  `waktuPesanan` varchar(60) DEFAULT NULL,
  `catatanPesanan` varchar(200) DEFAULT NULL,
  `statusPesanan` int(2) NOT NULL DEFAULT '0',
  `id_pemesanan` int(11) NOT NULL DEFAULT '0'
) ENGINE=InnoDB AUTO_INCREMENT=207 DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `datasementara`
--

INSERT INTO `datasementara` (`id`, `namaPemesan`, `namaPesanan`, `hargaPesanan`, `nomorMeja`, `tanggalPesanan`, `waktuPesanan`, `catatanPesanan`, `statusPesanan`, `id_pemesanan`) VALUES
(206, 'dadan', 'Capucinno Latee', 21000, 'Meja 2', NULL, NULL, NULL, 0, 0);

-- --------------------------------------------------------

--
-- Struktur dari tabel `kafe`
--

CREATE TABLE IF NOT EXISTS `kafe` (
  `namaKafe` varchar(100) NOT NULL,
  `alamatKafe` varchar(100) NOT NULL,
  `notelpKafe` varchar(100) NOT NULL,
  `webKafe` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `kafe`
--

INSERT INTO `kafe` (`namaKafe`, `alamatKafe`, `notelpKafe`, `webKafe`) VALUES
('Ceazy Coffee Shop', 'Jln. Telekomunikasi No.1, Buah Batu, Bandung.', '(0752) - 723-234-23', 'www.ceazycoffeeshop.id');

-- --------------------------------------------------------

--
-- Struktur dari tabel `menu`
--

CREATE TABLE IF NOT EXISTS `menu` (
`id` int(3) NOT NULL,
  `namaMenu` varchar(50) NOT NULL,
  `hargaMenu` int(6) NOT NULL,
  `jenisMenu` varchar(50) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `menu`
--

INSERT INTO `menu` (`id`, `namaMenu`, `hargaMenu`, `jenisMenu`) VALUES
(1, 'Capucinno Latee', 21000, 'Minuman'),
(2, 'Milk Coffee', 16000, 'Minuman'),
(3, 'Nasi Goreng Spesial', 15000, 'Makanan'),
(4, 'Esspresso Coffee', 23000, 'Minuman');

-- --------------------------------------------------------

--
-- Struktur dari tabel `nomormeja`
--

CREATE TABLE IF NOT EXISTS `nomormeja` (
  `id` int(4) NOT NULL,
  `nomorMeja` varchar(10) NOT NULL,
  `id_pemesan` varchar(4) DEFAULT NULL,
  `status` int(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `nomormeja`
--

INSERT INTO `nomormeja` (`id`, `nomorMeja`, `id_pemesan`, `status`) VALUES
(1, 'Meja 1', NULL, 0),
(2, 'Meja 2', NULL, 0),
(4, 'Meja 4', NULL, 0),
(5, 'Meja 5', NULL, 0),
(6, 'Meja 6', NULL, 0),
(7, 'Meja 7', NULL, 0),
(8, 'Meja 8', NULL, 0),
(9, 'Meja 9', NULL, 0),
(10, 'Meja 10', NULL, 0),
(11, 'Meja 11', NULL, 0),
(12, 'Meja 12', NULL, 0),
(13, 'Meja 13', NULL, 0),
(14, 'Meja 14', NULL, 0),
(15, 'Meja 15', NULL, 0),
(16, 'Meja 16', NULL, 0),
(3, 'Meja 3', NULL, 0);

-- --------------------------------------------------------

--
-- Struktur dari tabel `pemesanactive`
--

CREATE TABLE IF NOT EXISTS `pemesanactive` (
`id` int(11) NOT NULL,
  `namaPemesan` varchar(50) NOT NULL,
  `nomorMeja` varchar(8) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=60 DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pemesanactive`
--

INSERT INTO `pemesanactive` (`id`, `namaPemesan`, `nomorMeja`) VALUES
(58, 'zakkkk', 'Meja 13'),
(59, 'dadan', 'Meja 2');

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi`
--

CREATE TABLE IF NOT EXISTS `transaksi` (
  `id` int(6) NOT NULL,
  `namaPemesan` varchar(100) NOT NULL,
  `waktuPemesanan` varchar(100) DEFAULT NULL,
  `nomorMeja` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `vouchers`
--

CREATE TABLE IF NOT EXISTS `vouchers` (
`id` int(4) NOT NULL,
  `kode_voucher` varchar(50) NOT NULL,
  `diskon` int(8) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `vouchers`
--

INSERT INTO `vouchers` (`id`, `kode_voucher`, `diskon`) VALUES
(1, 'ceazyhebat', 5000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `datasementara`
--
ALTER TABLE `datasementara`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `menu`
--
ALTER TABLE `menu`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `pemesanactive`
--
ALTER TABLE `pemesanactive`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `vouchers`
--
ALTER TABLE `vouchers`
 ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `datasementara`
--
ALTER TABLE `datasementara`
MODIFY `id` int(6) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=207;
--
-- AUTO_INCREMENT for table `menu`
--
ALTER TABLE `menu`
MODIFY `id` int(3) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `pemesanactive`
--
ALTER TABLE `pemesanactive`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=60;
--
-- AUTO_INCREMENT for table `vouchers`
--
ALTER TABLE `vouchers`
MODIFY `id` int(4) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
