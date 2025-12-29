** SETTING .env :
1.) Buka .env.example, bisa pakai VSCode atau 
buka Netbeans-> open files-> cari file .env.example

2.) Disitu tertulis :
	DB_NAME=testdb
	DB_USER=admin
	DB_PASS=testpass

3.) Ubah DB_NAME menjadi rental_kendaraan
4.) Untuk USER & PASS sesuaikan dengan localhost kalian
5.) Setelah itu ubah saja filenya menjadi .env agar projek bisa jalan(buat .env baru juga boleh)



** IMPORT SQL :
=> Buat dulu database baru, misal : 
create database rental_kendaraan;

-> setelah itu exit

lalu ketik -> 
mysql -u root < "(direktori project saat ini)\rental_kendaraan.sql";

contoh : 
mysql -u root < "D:\Project_PBO\rental_kendaraan.sql";

-> setelah itu cek database dan tabelnya apakah sudah terimport



** SETTING DI NETBEANS KALIAN :
1.) Masuk ke Netbeans
2.) Pada project java VehicleRent atau PROJECT_PBO, cek disitu ada folder 'Libraries' (hanya bisa dilihat di Netbeans kalian)

3.) Kemudian klik kanan di 'Libraries' 
=> Add JAR/Folder 
=> Cari : mysql-connector-j-9.5.0 --> itu ada di folder 'lib'
=> itu adalah file .jar (agar bisa connect ke database)
=> tambahkan juga dotenv.jar nya

4.) Setelah itu RUN saja di Main.java (pastikan sudah import sql rental_kendaraan, dan sudah terkoneksi XAMPP)