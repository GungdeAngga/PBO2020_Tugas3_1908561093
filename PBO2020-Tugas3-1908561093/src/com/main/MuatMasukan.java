package com.main;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class MuatMasukan {
    public static com.main.IsiMasukan muatMasukan() {
        com.main.IsiMasukan isiMasukan = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("persistent_file.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            isiMasukan = (com.main.IsiMasukan) objectInputStream.readObject();
            objectInputStream.close();
        } catch (Exception error) {
            error.printStackTrace();
        }
        return isiMasukan;
    }
}
