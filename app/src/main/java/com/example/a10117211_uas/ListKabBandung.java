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

public class ListKabBandung  extends AppCompatActivity implements WisataAdapter.OnRsListener{
    private String TAG = ListKabBandung.class.getSimpleName();
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
        dataList.add(new wisata1("Puncak Eurad Pingping\n", "Cibodas-Ciater, Wangunharja, Lembang, Kabupaten Bandung Barat, Jawa Barat 40391\n",-6.791334, 107.681780));
        dataList.add(new wisata1("Sungai Cikahuripan\n", "Cihideung, Kec. Parongpong, Kabupaten Bandung Barat, Jawa Barat 40559\n",-6.790982, 107.612820));
        dataList.add(new wisata1("Sanghyang Heuleut\n", "Kp, Cipanas, Rajamandala Kulon, Kec. Cipatat, Kabupaten Bandung Barat, Jawa Barat 40554\n",-6.876460, 107.342208));
        dataList.add(new wisata1("Curug Malela\n", "Sindangjaya, Gununghalu, Kabupaten Bandung Barat, Jawa Barat\n",-7.018238, 107.207214));
        dataList.add(new wisata1("Stone Garden\n", "Gunung Masigit, Citatah, Kec. Cipatat, Kabupaten Bandung Barat, Jawa Barat 40554\n",-6.828142, 107.434996));
        dataList.add(new wisata1("Puncak Rindu Gunung Bendera\n", "Kampung Pojok Desa, Jayamekar, Padalarang, Kabupaten Bandung Barat, Jawa Barat 40553\n",-6.848649, 107.455409));
        dataList.add(new wisata1("Bukit Gantole Cililin\n", "Singajaya, Kec. Cihampelas, Kabupaten Bandung Barat, Jawa Barat 40562\n",-6.958839, 107.471283));
        dataList.add(new wisata1("Sanghyang Kenit\n", "Cisameng Cipanas, Rajamandala Kulon, Kec. Cipatat, Kabupaten Bandung Barat, Jawa Barat 40554\n",-6.853137, 107.349844));
        dataList.add(new wisata1("Gunung Putri\n", "Jl. Gunung Putri No.184, Jayagiri, Lembang, Kabupaten Bandung Barat, Jawa Barat 40391\n",-6.803883, 107.627336));
        dataList.add(new wisata1("Air terjun pelangi\n", "Jl. Kolonel Masturi No.325, Kertawangi, Kec. Cisarua, Kabupaten Bandung Barat, Jawa Barat 40551\n",-6.799187, 107.577520));
        dataList.add(new wisata1("Ciwangun indah camp\n", "Cihanjuang Rahayu Kec. Parongpong ,Kabupaten Bandung Barat Jawa Barat 40559\n",-6.791655, 107.581348));



    }


    @Override
    public void onRsClick(int position) {
        Log.d(TAG,"OnRsClick : is clicked"+position);
        Intent intent = new Intent(ListKabBandung.this, wisata.class);
        intent.putExtra("nama", dataList.get(position).getNama());
        intent.putExtra("alamat", dataList.get(position).getAlamat());
        intent.putExtra("lat", dataList.get(position).getLat());
        intent.putExtra("lng", dataList.get(position).getLng());


        startActivity(intent);

    }
}
