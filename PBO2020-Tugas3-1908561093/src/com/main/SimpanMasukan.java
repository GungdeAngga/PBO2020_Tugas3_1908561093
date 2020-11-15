package com.main;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SimpanMasukan implements Serializable {
    private com.main.IsiMasukan isiMasukan;
    public SimpanMasukan(String masukanBaru) {
        if (masukanBaru == null) {
            isiMasukan = null;
        } else {
            isiMasukan = new com.main.IsiMasukan(masukanBaru);
        }
    }

    public void eksekusi() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("persistent_file.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(this.isiMasukan);
            objectOutputStream.flush();
            objectOutputStream.close();

        } catch (Exception error) {
            error.printStackTrace();
        }
    }
}
