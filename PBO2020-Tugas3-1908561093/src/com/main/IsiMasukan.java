package com.main;

import java.io.Serializable;

public class IsiMasukan implements Serializable {
    private String isiMasukan;

    public IsiMasukan(String isiMasukan) {
        this.isiMasukan = isiMasukan;
    }

    public String getIsiMasukan() {
        return isiMasukan;
    }
}
