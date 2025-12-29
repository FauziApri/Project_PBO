-- =========================================
-- DATABASE : rental_kendaraan
-- =========================================

DROP DATABASE IF EXISTS rental_kendaraan;
CREATE DATABASE rental_kendaraan;
USE rental_kendaraan;

-- =========================================
-- DROP TABLE (ORDER AMAN)
-- =========================================
DROP TABLE IF EXISTS sewa;
DROP TABLE IF EXISTS motor;
DROP TABLE IF EXISTS mobil;
DROP TABLE IF EXISTS customer;

-- =========================================
-- TABLE : mobil
-- =========================================
CREATE TABLE mobil (
    id INT AUTO_INCREMENT PRIMARY KEY,
    merk VARCHAR(50) NOT NULL,
    tipe VARCHAR(50) NOT NULL,
    tahun INT NOT NULL,
    trim_name VARCHAR(50) NOT NULL,
    harga_sewa INT NOT NULL,
    warna VARCHAR(50) NOT NULL,
    plat_no VARCHAR(15) NOT NULL UNIQUE,
    transmisi ENUM('Manual', 'Automatic') NOT NULL,
    jumlah_kursi INT NOT NULL
) ENGINE=InnoDB;

INSERT INTO mobil 
(merk, tipe, tahun, trim_name, harga_sewa, warna, plat_no, transmisi, jumlah_kursi)
VALUES
('Toyota', 'Avanza', 2021, 'G', 250000, 'Silver', 'B1111AAA', 'Automatic', 7),
('Toyota', 'Veloz', 2022, 'Q', 300000, 'White', 'B2222BBB', 'Automatic', 7),
('Honda', 'Brio', 2020, 'RS', 200000, 'Yellow', 'B3333CCC', 'Manual', 5),
('Mitsubishi', 'Xpander', 2021, 'Ultimate', 320000, 'Black', 'B4444DDD', 'Automatic', 7),
('Suzuki', 'Ertiga', 2021, 'GX', 230000, 'Grey', 'B5555EEE', 'Manual', 7),
('Daihatsu', 'Xenia', 2020, 'R Deluxe', 220000, 'Silver', 'B6666FFF', 'Manual', 7),
('Toyota', 'Raize', 2022, 'GR Sport', 260000, 'Red', 'B7777GGG', 'Automatic', 5),
('Honda', 'HR-V', 2021, 'Prestige', 350000, 'White', 'B8888HHH', 'Automatic', 5),
('Nissan', 'Livina', 2020, 'VE', 240000, 'Black', 'B9999III', 'Automatic', 7),
('Wuling', 'Confero', 2019, 'S', 210000, 'Blue', 'B1010JJJ', 'Manual', 7);

-- =========================================
-- TABLE : motor
-- =========================================
CREATE TABLE motor (
    id INT AUTO_INCREMENT PRIMARY KEY,
    merk VARCHAR(50) NOT NULL,
    tipe VARCHAR(50) NOT NULL,
    tahun INT NOT NULL,
    harga_sewa INT NOT NULL,
    warna VARCHAR(50) NOT NULL,
    plat_no VARCHAR(15) NOT NULL UNIQUE,
    transmisi ENUM('Manual', 'Automatic') NOT NULL,
    perlengkapan VARCHAR(255) NOT NULL
) ENGINE=InnoDB;

INSERT INTO motor 
(merk, tipe, tahun, harga_sewa, warna, plat_no, transmisi, perlengkapan)
VALUES
('Honda', 'Beat', 2020, 70000, 'Hitam', 'B2001AAA', 'Automatic', 'Helm, Jas Hujan'),
('Yamaha', 'NMAX', 2022, 120000, 'Putih', 'B2002BBB', 'Automatic', 'Helm'),
('Suzuki', 'Satria FU', 2019, 80000, 'Merah', 'B2003CCC', 'Manual', 'Helm, Sarung Tangan'),
('Honda', 'Vario 125', 2021, 90000, 'Hitam', 'B2004DDD', 'Automatic', 'Helm'),
('Yamaha', 'Aerox', 2022, 110000, 'Biru', 'B2005EEE', 'Automatic', 'Helm, Jas Hujan'),
('Honda', 'PCX 160', 2023, 130000, 'Silver', 'B2006FFF', 'Automatic', 'Helm'),
('Kawasaki', 'W175', 2020, 150000, 'Hijau', 'B2007GGG', 'Manual', 'Helm, Sarung Tangan'),
('Honda', 'Supra X', 2019, 60000, 'Hitam', 'B2008HHH', 'Manual', 'Helm'),
('Yamaha', 'Fazzio', 2022, 100000, 'Krem', 'B2009III', 'Automatic', 'Helm, Jas Hujan'),
('Suzuki', 'Spin', 2017, 50000, 'Hitam', 'B2010JJJ', 'Automatic', 'Helm');

-- =========================================
-- TABLE : customer
-- =========================================
CREATE TABLE customer (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nama VARCHAR(50) NOT NULL,
    alamat VARCHAR(255) NOT NULL,
    no_hp VARCHAR(20) NOT NULL,
    nik VARCHAR(20) NOT NULL
) ENGINE=InnoDB;

INSERT INTO customer 
(nama, alamat, no_hp, nik) 
VALUES
('Ryoiki tenkaii', 'Depok', '081234567890', '3201123456789001'),
('Dewi Lestari', 'Jakarta', '081298765432', '3201987654321002'),
('Budi Santoso', 'Bogor', '089912341234', '3201456789012003'),
('Siti Aminah', 'Bekasi', '082211334455', '3201567890123004'),
('Andi Pratama', 'Bandung', '083811223344', '3201789012345005');

-- =========================================
-- TABLE : sewa
-- =========================================
CREATE TABLE sewa (
    id INT AUTO_INCREMENT PRIMARY KEY,
    customer_id INT NOT NULL,
    mobil_id INT NULL,
    motor_id INT NULL,
    harga INT NOT NULL,
    tanggal_sewa DATE NOT NULL,
    tanggal_akhir DATE NOT NULL,
    FOREIGN KEY (customer_id) REFERENCES customer(id),
    FOREIGN KEY (mobil_id) REFERENCES mobil(id),
    FOREIGN KEY (motor_id) REFERENCES motor(id)
) ENGINE=InnoDB;

INSERT INTO sewa 
(customer_id, mobil_id, motor_id, harga, tanggal_sewa, tanggal_akhir)
VALUES
(1, 1, NULL, 250000, '2025-01-10', '2025-01-12'),
(2, 2, NULL, 300000, '2025-01-05', '2025-01-08'),
(3, NULL, 1, 70000, '2025-01-15', '2025-01-16'),
(4, NULL, 3, 80000, '2025-01-03', '2025-01-04'),
(5, 8, NULL, 350000, '2025-01-20', '2025-01-22');
