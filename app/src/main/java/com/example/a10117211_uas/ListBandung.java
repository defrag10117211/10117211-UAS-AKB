package com.example.a10117211_uas;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListBandung extends AppCompatActivity implements WisataAdapter.OnRsListener{
    private String TAG = ListBandung.class.getSimpleName();
    private RecyclerView recyclerView;
    private WisataAdapter adapter;
    private ArrayList<wisata1> dataList = new ArrayList<>();
    private ProgressDialog pDialog;
    TextView nama_wisata,alamat_wisata;
    private static final int REQUEST_CALL = 1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_list2);

        addData();

        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        nama_wisata = (TextView) findViewById(R.id.txt_nama_wisata);
        alamat_wisata = (TextView) findViewById(R.id.txt_alamat);

        recyclerView.setHasFixedSize(true);
        adapter = new WisataAdapter(dataList,this);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }
    private void addData() {
        dataList = new ArrayList<>();
        dataList.add(new wisata1("Gunung Tangkuban Parahu\n", "Jl. Tangkuban Perahu,Cikahuripan, Lembang, Kabupaten Bandung Barat, Jawa Barat\n",-6.759621,107.609775));
        dataList.add(new wisata1("Jalan Braga\n", "Jl. Braga 58-46, Braga, Kec. Sumur Bandung, Kota Bandung, Jawa Barat 40111\n",-6.917500, 107.609355));
        dataList.add(new wisata1("Gedung Sate\n", "Jl. Diponegoro No.22, Citarum, Kec. Bandung Wetan, Kota Bandung, Jawa Barat 40115\n",-6.902462, 107.618810));
        dataList.add(new wisata1("Trans Studio Bandung\n", "Jalan Jendral Gatot Subroto No.289 A, Cibangkong, Batununggal, Bandung City, West Java 40273\n",-6.925073, 107.636479));
        dataList.add(new wisata1("Farm House Susu Lembang\n", "Jl. Raya Lembang No.108, Gudangkahuripan, Lembang, Kabupaten Bandung Barat, Jawa Barat 40391\n",-6.832950, 107.605711));
        dataList.add(new wisata1("Tebing Keraton\n", "Ciburial, Kec. Cimenyan, Kabupaten Bandung Barat, Jawa Barat 40198\n",-6.834047, 107.663604));
        dataList.add(new wisata1("Dusun Bambu\n", "Jl. Kolonel Masturi No.KM, Kertawangi, Kec. Cisarua, Kabupaten Bandung Barat, Jawa Barat 40551\n",-6.789460, 107.578828));
        dataList.add(new wisata1("Taman Hutan Raya Ir. H. Djuanda\n", "Kompleks Tahura, Jl. Ir. H. Juanda No.99, Ciburial, Kec. Cimenyan, Bandung, Jawa Barat 40198\n",-6.856549, 107.632656));



    }


    @Override
    public void onRsClick(int position) {
        Log.d(TAG,"OnRsClick : is clicked"+position);
        Intent intent = new Intent(ListBandung.this, wisata.class);
        intent.putExtra("nama", dataList.get(position).getNama());
        intent.putExtra("alamat", dataList.get(position).getAlamat());
        intent.putExtra("lat", dataList.get(position).getLat());
        intent.putExtra("lng", dataList.get(position).getLng());


        startActivity(intent);

    }
}
