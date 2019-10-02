package com.example.proteintracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.proteintracker.Adapter.DaftarTemanAdapter;
import com.example.proteintracker.Model.DaftarTeman;

import java.util.ArrayList;

public class DaftarTemanActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private DaftarTemanAdapter daftarTemanAdapter;
    private ArrayList<DaftarTeman>DaftarTemanArraylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_teman);
        addData();

        recyclerView = findViewById(R.id.RvTeman);
        daftarTemanAdapter = new DaftarTemanAdapter(DaftarTemanArraylist);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(DaftarTemanActivity.this);
        recyclerView .setLayoutManager(layoutManager);
        recyclerView .setAdapter(daftarTemanAdapter);
    }
    private  void addData(){
        DaftarTemanArraylist =  new ArrayList<>();
        DaftarTemanArraylist.add(new DaftarTeman("Tita Marita Simangunsong","72170154","Baca Buku","Kaya Raya","Life is good","Perempuan",R.drawable.tita));
        DaftarTemanArraylist.add(new DaftarTeman("Yos Rafel Kristanto","72170092","Main game","Banyak uang","sans","Laki-Laki",R.drawable.yos));
        DaftarTemanArraylist.add(new DaftarTeman("Yashinta Novita Dewi","72170110","Tidur","Kaya raya","lebih baik naik gunung","Perempuan",R.drawable.yashinta));
        DaftarTemanArraylist.add(new DaftarTeman("Desta Siwi Prabawan","72170126","Main Musik","Kurus","gampanglah","Laki-laki",R.drawable.desta));
    }
}