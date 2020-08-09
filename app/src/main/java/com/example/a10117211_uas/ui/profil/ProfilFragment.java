package com.example.a10117211_uas.ui.profil;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.a10117211_uas.Database;
import com.example.a10117211_uas.R;
//Tanggal   :8-8-2020 - 12-08-2020
//Nim		:10117211
//Nama 	    :Defrag Muhammad Al'araaf Dasmana
//Kls		:IF-7
public class ProfilFragment extends Fragment {
    TextView nimm,namaa,kelass,descc;
    Database dbupdate;
    protected Cursor cursor;
    @Nullable
    private ProfilViewModel profilViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        profilViewModel =
                ViewModelProviders.of(this).get(ProfilViewModel.class);
        View view = inflater.inflate(R.layout.fragment_profil, container, false);
        dbupdate = new Database(getContext());

        nimm =  view.findViewById(R.id.nim);
        namaa = view.findViewById(R.id.nama);
        kelass = view.findViewById(R.id.kelas);
        descc = view.findViewById(R.id.desc);
        tampil_profile();
        SQLiteDatabase db = dbupdate.getReadableDatabase();

        cursor = db.rawQuery("SELECT * FROM profile", null);
        for(int count=0; count < cursor.getCount(); count++) {
            cursor.moveToFirst();
            cursor.moveToPosition(count);
            String NIM = cursor.getString(0);
            String nama = cursor.getString(1);
            String kelas = cursor.getString(2);
            String desc = cursor.getString(3);

            nimm.setText(NIM);
            namaa.setText(nama);
            kelass.setText(kelas);
            descc.setText(desc);
        }
        return view;

    }

    public void tampil_profile(){

        SQLiteDatabase db = dbupdate.getWritableDatabase();
        db.execSQL("INSERT INTO profile (NIM,nama,kelas,description) VALUES ('10117211', 'Defrag Muhammad Alaraaf Dasmana'," +
                " 'IF7', 'Tugas besar UAS-AKB Mahasiswa Unikom ')");
    }
}