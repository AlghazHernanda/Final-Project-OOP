# Game TicTacToe

This repository is a final project (Java GUI) from Object-Oriented Programming Class, Teknik Informatika Universitas Padjadjaran. 

[Challenge Guidelines](challenge-guideline.md)

**TicTacToe adalah permainan kertas dan pensil untuk dua pemain, X dan O, yang bergiliran menandai ruang dalam grid 3 × 3. Pemain yang berhasil menempatkan tiga tanda mereka di baris horisontal, vertikal, atau diagonal memenangkan pertandingan.**

## Credits
| NPM           | Name            |
| ------------- |---------------- |
| 140810190003  | Muhammad Galang |
| 140810190023  | Roisyal Bariz   |
| 140810190069  | Mohamad Alghaz  |

## Change log
- **[Sprint Planning](changelog/sprint-planning.md) - (18 November 2020)** 
   - Mempelajari Jframe
   - Diskusi Menentukan konsep game dan Interface
   - Mencari referensi dari Youtube dan situs lainnya

- **[Sprint 1](changelog/sprint-1.md) - (18 November 2020 - 24 November 2020)** 
   - Mempelajari Jframe


- **[Sprint 2](changelog/sprint-2.md) - (25 November 2020 - 1 Desember 2020)** 
   - Membuat Layout Game TicTacToe
   - Mengatur letak panel,button,label dan warna.
   - Membuat Logika proses Game
   - Membuat logika apabila pemain menang
   
- **[Sprint 3](changelog/sprint-3.md) - (2 Desember 2020 - 8 November 2020)** 
   - Membuat logika game apabila seri
   - Mempercantik UI
   - Melakukan Test Game Tictatoe untuk membenarkan Bug

## Running The App

Main file `Main.java` atau TicTacToe dapat dijalankan dengan 2 cara yaitu :

### 1.Menjalankan tanpa parameter

```
java Main
```
Pada terminal,user dapat mengcompile dulu file method TicTacToe.java,lalu compile file Main.java

### 2.Run di Text Editor APACHE NETBEANS IDE 12

```
Run and Execute
```
Pada Netbeans,user hanya perlu klik 1 tombol RUN untuk menjalankan Game TicTacToe.

## Method Used

#### 1. gamescore() `private void gameScore()`
fungsi untuk mendeklarasikan papanscore

#### 2. choose_a_Player() `private void choose_a_Player()`
fungsi untuk memilih player x atau o

#### 3. winningGame() `private void winningGame()`
berisi logic untuk mendapatkan score jika x atau o menang

#### 4. tictactoe `public TicTacToe()`
mendeklarasikan luas kanvas untuk game nya



UML image here

## Notable Assumption and Design App Details

- Pada game TicTacToe kami,saat player menang,akan muncul warna yang menandakan line winning player.Ada warna biru,hijau dll.
- Terdapat tombol Reset untuk memulai game dari awal,tetapi scorenya tetap ada dan terus tercatat sampai game ditutup.