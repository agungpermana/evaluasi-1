-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 10 Sep 2015 pada 19.41
-- Versi Server: 5.6.20
-- PHP Version: 5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `transaksi`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `barang`
--

CREATE TABLE IF NOT EXISTS `barang` (
`kode_brg` int(15) NOT NULL,
  `nama_brg` varchar(20) NOT NULL,
  `jlm_brg` int(4) NOT NULL,
  `harga` int(10) NOT NULL,
  `jns_brg` varchar(15) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=16 ;

--
-- Dumping data untuk tabel `barang`
--

INSERT INTO `barang` (`kode_brg`, `nama_brg`, `jlm_brg`, `harga`, `jns_brg`) VALUES
(1, 'akik', 3, 3000, 'pakaian'),
(2, 'celana', 1, 2000, 'bawahan'),
(4, 'baju', 3, 3000, 'pakaian'),
(5, 'celana', 1, 2000, 'bawahan'),
(6, 'beras', 3, 3000, 'nasi'),
(7, 'baju', 3, 3000, 'pakaian'),
(8, 'celana', 1, 2000, 'bawahan'),
(9, 'beras', 3, 3000, 'nasi'),
(10, 'baju', 3, 3000, 'pakaian'),
(11, 'celana', 1, 2000, 'bawahan'),
(12, 'beras', 3, 3000, 'nasi'),
(13, 'baju', 3, 3000, 'pakaian'),
(14, 'celana', 1, 2000, 'bawahan'),
(15, 'beras', 3, 3000, 'nasi');

-- --------------------------------------------------------

--
-- Struktur dari tabel `penjualan`
--

CREATE TABLE IF NOT EXISTS `penjualan` (
`no_faktur` int(15) NOT NULL,
  `nama_barang` varchar(25) NOT NULL,
  `jml_barang` int(4) NOT NULL,
  `total_harga` decimal(20,0) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Dumping data untuk tabel `penjualan`
--

INSERT INTO `penjualan` (`no_faktur`, `nama_barang`, `jml_barang`, `total_harga`) VALUES
(1, 'kolor', 3, '5000'),
(2, 'golok', 1, '1000'),
(4, 'pisang', 3, '5000'),
(5, 'golok', 1, '1000'),
(6, 'pisau', 2, '6000');

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE IF NOT EXISTS `user` (
`id_user` int(10) NOT NULL,
  `nama` varchar(25) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `tgl_lahir` date DEFAULT NULL,
  `alamat` varchar(255) NOT NULL,
  `tlp` varchar(15) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`id_user`, `nama`, `gender`, `tgl_lahir`, `alamat`, `tlp`) VALUES
(1, 'sultan', 'L', '1990-05-05', 'depok', '212'),
(2, 'permana', 'L', '1990-09-01', 'jakarta', '099'),
(4, 'agung', 'L', '1990-05-05', 'depok', '212'),
(5, 'permana', 'L', '1990-09-01', 'jakarta', '099'),
(6, 'sari', 'P', '1991-01-20', 'magelang', '082');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
 ADD PRIMARY KEY (`kode_brg`);

--
-- Indexes for table `penjualan`
--
ALTER TABLE `penjualan`
 ADD PRIMARY KEY (`no_faktur`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
 ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `barang`
--
ALTER TABLE `barang`
MODIFY `kode_brg` int(15) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=16;
--
-- AUTO_INCREMENT for table `penjualan`
--
ALTER TABLE `penjualan`
MODIFY `no_faktur` int(15) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
MODIFY `id_user` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=7;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
