-- =========================================
-- DATABASE: rental_kendaraan
-- =========================================

DROP DATABASE IF EXISTS rental_kendaraan;
CREATE DATABASE rental_kendaraan;
USE rental_kendaraan;

-- =========================================
-- TABLE: mobil
-- =========================================
DROP TABLE IF EXISTS mobil;

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
('Suzuki', 'Ertiga', 2021, 'GX', 230000, 'Grey', 'B5555EEE', 'Manual', 7);

-- =========================================
-- TABLE: motor
-- =========================================
DROP TABLE IF EXISTS motor;

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
('Honda', 'Vario 125', 2021, 90000, 'Hitam', 'B2004DDD', 'Automatic', 'Helm');

-- =========================================
-- TABLE: customer
-- =========================================
DROP TABLE IF EXISTS customer;

CREATE TABLE customer (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nama VARCHAR(50) NOT NULL,
    alamat VARCHAR(255) NOT NULL,
    no_hp VARCHAR(20) NOT NULL,
    nik VARCHAR(20) NOT NULL UNIQUE
) ENGINE=InnoDB;

INSERT INTO customer
(nama, alamat, no_hp, nik)
VALUES
('Ryoiki Tenkai', 'Depok', '081234567890', '3201123456789001'),
('Dewi Lestari', 'Jakarta', '081298765432', '3201987654321002'),
('Budi Santoso', 'Bogor', '089912341234', '3201456789012003');

-- =========================================
-- TABLE: sewa
-- =========================================
DROP TABLE IF EXISTS sewa;

CREATE TABLE sewa (
    id INT AUTO_INCREMENT PRIMARY KEY,
    customer_id INT NOT NULL,
    mobil_id INT NULL,
    motor_id INT NULL,
    harga INT NOT NULL,
    tanggal_sewa DATE NOT NULL,
    tanggal_akhir DATE NOT NULL,

    CONSTRAINT fk_customer
        FOREIGN KEY (customer_id)
        REFERENCES customer(id)
        ON DELETE CASCADE,

    CONSTRAINT fk_mobil
        FOREIGN KEY (mobil_id)
        REFERENCES mobil(id)
        ON DELETE SET NULL,

    CONSTRAINT fk_motor
        FOREIGN KEY (motor_id)
        REFERENCES motor(id)
        ON DELETE SET NULL
) ENGINE=InnoDB;

INSERT INTO sewa
(customer_id, mobil_id, motor_id, harga, tanggal_sewa, tanggal_akhir)
VALUES
(1, 1, NULL, 250000, '2025-01-10', '2025-01-12'),
(2, NULL, 1, 70000, '2025-01-15', '2025-01-16');
