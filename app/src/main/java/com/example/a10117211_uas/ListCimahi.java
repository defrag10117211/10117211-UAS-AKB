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

public class ListCimahi  extends AppCompatActivity implements WisataAdapter.OnRsListener{
    private String TAG = ListCimahi.class.getSimpleName();
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
        dataList.add(new wisata1("All about strawberry\n", "Jl. Cihanjuang No.24, Cibabat, Kec. Cimahi Utara, Kota Cimahi, Jawa Barat 40513\n",-6.864219, 107.562979));
        dataList.add(new wisata1("Alam wisata cimahi\n", "Jalan Kolonel Masturi KM.4 No.157, Cipageran, Kec. Cimahi Utara, Kota Cimahi, Jawa Barat 40511\n",-6.840439, 107.551058));
        dataList.add(new wisata1("Curug Tunan katumiri\n", "kampung Dangdeur desa, Sanca, Kec. Ciater, Kabupaten Subang, Jawa Barat 41281\n",-6.713585, 107.698491));
        dataList.add(new wisata1("Taman wisata paku haji\n", "Jalan Haji Gofur No.Km. 4, RT.02/RW.10, Pakuhaji, Kec. Ngamprah, Kabupaten Bandung Barat, Jawa Barat 40552\n",-6.835716, 107.534808));
        dataList.add(new wisata1("Kampung Buyut Cipageran\n", "Jl. Kolonel Masturi No.Km. 3, Cipageran, Kec. Cimahi Utara, Kota Cimahi, Jawa Barat 40511\n",-6.848206, 107.548752));
        dataList.add(new wisata1("Curug bugbrug\n", "Kertawangi, Kec. Cisarua, Kabupaten Bandung Barat, Jawa Barat 40551\n",-6.792087, 107.580107));
        dataList.add(new wisata1("Waterboom tirtamulya\n", "Jalan Soemawinata No.88, Tanimulya, Kec. Ngamprah, Kabupaten Bandung Barat, Jawa Barat 40552\n",-6.860772, 107.525339));

    }


    @Override
    public void onRsClick(int position) {
        Log.d(TAG,"OnRsClick : is clicked"+position);
        Intent intent = new Intent(ListCimahi.this, wisata.class);
        intent.putExtra("nama", dataList.get(position).getNama());
        intent.putExtra("alamat", dataList.get(position).getAlamat());
        intent.putExtra("lat", dataList.get(position).getLat());
        intent.putExtra("lng", dataList.get(position).getLng());


        startActivity(intent);

    }
}
