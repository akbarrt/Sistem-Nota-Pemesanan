# Aplikasi Nota Pemesanan Makanan di Restoran

## Deskripsi
Program ini merupakan aplikasi sederhana berbasis **Java** yang digunakan untuk mencatat pemesanan makanan di restoran. Pengguna dapat memilih menu, menambahkan pesanan, melihat daftar pesanan, dan mencetak nota akhir yang berisi total harga beserta pajak 10%.

---

## Tujuan
Aplikasi ini dibuat sebagai latihan implementasi konsep dasar **Pemrograman Berorientasi Objek (PBO)** dan penggunaan fitur dasar Java seperti **ArrayList**, **method**, dan **Scanner** untuk input data.

---

## Fitur Aplikasi
1. **Lihat Menu** – Menampilkan daftar menu restoran.
2. **Tambah Pesanan** – Memilih dan menambahkan menu ke daftar pesanan.
3. **Lihat Pesanan** – Menampilkan semua pesanan yang telah ditambahkan.
4. **Cetak Nota** – Menampilkan nota lengkap dengan subtotal, pajak 10%, dan total pembayaran.
5. **Keluar** – Menutup program.

---

## Cara Menjalankan Program
1. Pastikan sudah menginstal **Java JDK** minimal versi 8.
2. Simpan file dengan nama `NotaPemesananRestoran.java`.
3. Buka terminal atau command prompt di folder tempat file disimpan.
4. Jalankan perintah berikut:
   ```bash
   javac Main.java
   java Main
   ```

---

## Contoh Output Program
```
=== SISTEM NOTA PEMESANAN MAKANAN ===
1. Lihat Menu
2. Tambah Pesanan
3. Lihat Pesanan
4. Cetak Nota
5. Keluar
Pilih menu (1-5): 1

=== Daftar Menu Restoran ===
1. Nasi Goreng - Rp20000
2. Mie Ayam - Rp15000
3. Ayam Bakar - Rp25000
4. Soto Ayam - Rp18000
5. Es Teh Manis - Rp5000

Pilih menu (1-5): 2
Pesanan berhasil ditambahkan!

=== NOTA PEMESANAN ===
- Nasi Goreng : Rp20000
-----------------------------
Subtotal: Rp20000
Pajak (10%): Rp2000
Total Bayar: Rp22000
-----------------------------
Terima kasih telah memesan di restoran kami!
```

---

## Struktur Program
Program ini terdiri dari dua kelas utama:
- **MenuItem** – Menyimpan data setiap menu berupa nama dan harga.
- **NotaPemesananRestoran** – Berisi logika utama program, termasuk daftar menu, daftar pesanan, dan perhitungan total.

### Method yang Digunakan
- `isiMenu()` → Menambahkan daftar menu ke sistem.
- `tampilkanMenu()` → Menampilkan daftar menu restoran.
- `tambahPesanan()` → Menambahkan menu ke daftar pesanan.
- `tampilkanPesanan()` → Menampilkan pesanan yang sudah ditambahkan.
- `cetakNota()` → Menampilkan nota lengkap beserta total dan pajak.
- `ambilAngka()` → Validasi input agar hanya menerima angka.

---

## Catatan Tambahan
Dalam kode ini terdapat komentar khusus di bagian perhitungan total dan pajak yang dapat digunakan untuk **Custom Live Template** di IntelliJ IDEA. Template ini bisa digunakan untuk mempercepat penulisan kode perhitungan di proyek lain.

---