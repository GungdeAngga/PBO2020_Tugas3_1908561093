package com.main;

import java.util.Scanner;

public class Program {
    private final Scanner scanner;

    public Program() {
        scanner = new Scanner(System.in);
    }

    public void run() {
        int insertMenu;
        do {
            insertMenu = this.getIntegerInput("\n\nNama: A. A. Gede Agung Angga Aditya\nNIM: 1908561093\nPilihan\n1. Cek Isi Masukan\n2. Ganti Isi Masukan\n3. Reset Isi Masukan\n4. Keluar\nPilihan Anda: ");
            this.processMenu(insertMenu);
        } while(insertMenu != 4);
    }

    private void processMenu(int pilihan) {
        switch (pilihan) {

            case 1:

                com.main.IsiMasukan isiMasukan = com.main.MuatMasukan.muatMasukan();
                if (isiMasukan != null) {
                    System.out.println("Isi Masukan : " + isiMasukan.getIsiMasukan());
                }
                else {
                    System.out.println("Belum terdapat masukan, silahkan beri masukan Anda");
                }

                break;

            case 2:

                com.main.SimpanMasukan simpanMasukan = new com.main.SimpanMasukan(getPesanInput("Berikan masukkan Anda : "));
                simpanMasukan.eksekusi();

                break;
                
            case 3:

                com.main.SimpanMasukan simpanMasukan1 = new com.main.SimpanMasukan(null);
                simpanMasukan1.eksekusi();

                break;

            case 4:

                break;

            default:
                System.out.println("Program telah selesai");

                break;
        }
    }

    private int getIntegerInput(String message) {
        System.out.println(message);
        int buffer = scanner.nextInt();
        scanner.nextLine();
        return buffer;
    }

    private String getPesanInput(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }
}
