# **Tugas Kuliah**  
### Universitas Insan Cita Indonesia

**Nama** : Rafli Muhamad Ridhwan
**Mata Kuliah:** Pemrograman Berorientasi Objek  

---

## Deskripsi Tugas
Buatlah aplikasi CLI/Console sederhana lengkap disertai dengan komentar pada baris kodenya lalu presentasikan dalam bentuk video dengan durasi maksimal 5 menit. 

### Kriteria Penilaian
* Fungsi manfaat aplikasi
* Sumber kode mencakup materi-materi yang telah dipelajari sebelumnya (Pertemuan 1 - 7)
* Penjelasan & demo video komprehensif, jelas lugas sebagai evidence/bukti yang mengindikasikan bahwa Anda benar-benar mengerjakan project tersebut
* Tugas dikumpulkan dalam bentuk: file .jar, source code, link ke video penjelasan disimpan dalam satu project di sebuah repl di akun Anda. Link yang dikumpulkan adalah link ke repl project pada akun Replit Anda

---
## Proses Komplisasi kode menjadi jar
1. Membuat file manifest.txt dengan di isi text:
```
Main-Class: Main
```
2 . Melakukan Kompilasi dengan menjalankan kode berikut:
```
javac -d out -sourcepath . Main.java model/Book.java model/BorrowedBook.java service/LibraryService.java util/InputUtil.java
```
3. Menghasilkan file jar
```
jar cfm library.jar manifest.txt -C out 
```

## Petunjuk Menjalankan Kode dengan GitHub Codespaces

1. Klik tombol **<> Code** pada repository GitHub.
2. Pada pop-up yang muncul, pilih tab **Codespaces**.
3. Klik tombol **Create codespace on main**.
4. Tunggu hingga folder dan file dalam repository selesai dimuat.
5.  Jalankan program melalui file jar melalui perintah berikut di terminal:
    ```
    java -jar library.jar
    ```

### Catatan

Saya memilih menjalankan kode di GitHub Codespaces karena Replit.com kini mulai berbayar dan membatasi penggunaannya hanya untuk 3 repository saja.

