# Java Fundamental - Pertemuan 3
[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)
![GitHub repo size](https://img.shields.io/github/repo-size/nengrahmaa/pertemuan3-java-fundamental?style=for-the-badge)
![GitHub last commit](https://img.shields.io/github/last-commit/nengrahmaa/pertemuan3-java-fundamental?style=for-the-badge)
![GitHub stars](https://img.shields.io/github/stars/nengrahmaa/pertemuan3-java-fundamental?style=for-the-badge)
![GitHub forks](https://img.shields.io/github/forks/nengrahmaa/pertemuan3-java-fundamental?style=for-the-badge)

**Materi:**
1. Memahami Struktur & Aturan Penulisan Sintaks, Percabangan, Perulangan, dan Method
2. Pengantar OOP, Class, Object, & Access Modifier

---

## Deskripsi
Repository ini berisi latihan dari **Pertemuan 3 Java Fundamental** yang mengambil materi dari modul **Pertemuan 2** dan **Pertemuan 3**.  
Fokus pembelajaran pada pertemuan ini adalah:

- Struktur dan aturan penulisan sintaks Java
- Percabangan (if, else, switch)
- Perulangan (for, while, do-while)
- Pembuatan dan pemanggilan method
- Pengenalan konsep OOP (Object-Oriented Programming)
- Membuat dan menggunakan Class & Object
- Access Modifier (`public`, `protected`, `private`, default)
- Constructor dan overloading constructor
- Membuat method dengan akses terbatas

---

## Teknologi
- Bahasa: Java
- JDK: Minimal JDK 8
- IDE: Bebas (Eclipse, IntelliJ IDEA, VS Code, NetBeans, dll.)

---

## Struktur Program

pertemuan3/
└── oop/
└── course/
├── App.java
└── Car.java


**Penjelasan File:**
- **App.java**  
  File utama yang dapat digunakan untuk menjalankan program. Di sini dapat dilakukan pembuatan object `Car` dan pemanggilan method-nya.
  
- **Car.java**  
  Berisi class `Car` yang memiliki atribut, constructor, method, dan access modifier berbeda. Juga terdapat class `InnerCar` sebagai contoh membuat object dan memanggil method dalam class `Car`.

---

## Cara Menjalankan
1. Pastikan Java Development Kit (JDK) sudah terpasang di komputer.
2. Clone repository ini:
   ```bash
   git clone https://github.com/nengrahmaa/pertemuan3-java-fundamental.git
3. Masuk ke folder project:
   ```bash
   cd pertemuan3-java-fundamental
   ```
5. Compile Program:
   ```bash
   javac pertemuan3/oop/course/*.java
   ```
7. Jalankan Program InnerCar:
   ```bash
   java pertemuan3.oop.course.InnerCar
   ```
