** SETTING .env :
1.) Buka .env.example
2.) Disitu tertulis :
	DB_NAME=testdb
	DB_USER=admin
	DB_PASS=testpass

3.) ubah DB_NAME menjadi rental_kendaraan
4.) untuk USER & PASS sesuaikan dengan localhost kalian



** SETTING DI NETBEANS KALIAN :
1.) Pada project java RENTAL_KENDARAAN, cek disitu ada folder 'Libraries' (hanya bisa dilihat di Netbeans kalian)

2.) Kemudian klik kanan di 'Libraries' 
=> Add JAR/Folder 
=> cari : mysql-connector-j-9.5.0 -- itu ada di folder 'lib'
=> itu adalah file .jar (agar bisa connect ke database)

3.) Setelah itu RUN saja di Main.java (pastikan sudah import sql rental_kendaraan, dan sudah terkoneksi XAMPP)