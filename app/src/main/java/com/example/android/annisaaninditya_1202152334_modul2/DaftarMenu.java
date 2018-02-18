package com.example.android.annisaaninditya_1202152334_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class DaftarMenu extends AppCompatActivity {


    private ArrayList<String> namaList;
    private ArrayList<String> hargaList;
    private ArrayList<String> keteranganList;
    private ArrayList<Integer> imageList;
    //Daftar makanan
    private String[] Makanan = {"Sate", "Gorengan", "Donat"};
    //Daftar Harga
    private String[] Harga = {"Rp.25000","Rp.500","Rp.3000"};
    private String[] Keterangan = {"Daging Kambing","Pisang Goreng","Donat Kentang"};
    //Daftar Gambar
    private int[] Gambar = {R.drawable.sate, R.drawable.gorengan, R.drawable.donat};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);
    }
}
