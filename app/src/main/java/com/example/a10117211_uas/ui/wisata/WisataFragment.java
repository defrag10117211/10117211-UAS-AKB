package com.example.a10117211_uas.ui.wisata;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.a10117211_uas.ListBandung;
import com.example.a10117211_uas.ListBandungB;
import com.example.a10117211_uas.ListCimahi;
import com.example.a10117211_uas.ListKabBandung;
import com.example.a10117211_uas.R;
//Tanggal   :8-8-2020 - 12-08-2020
//Nim		:10117211
//Nama 	    :Defrag Muhammad Al'araaf Dasmana
//Kls		:IF-7
public class WisataFragment extends Fragment implements View.OnClickListener {

    private WisataViewModel wisataViewModel;
    Button kb,kbb,kbbb,kcimahi;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        wisataViewModel =
                ViewModelProviders.of(this).get(WisataViewModel.class);
        View view = inflater.inflate(R.layout.fragment_wisata, container, false);
        kb = (Button)view.findViewById(R.id.btn_kb);
        kb.setOnClickListener(this);
        kbb = (Button)view.findViewById(R.id.btn_kbb);
        kbb.setOnClickListener(this);
        kbbb = (Button)view.findViewById(R.id.btn_kbbb);
        kbbb.setOnClickListener(this);
        kcimahi = (Button)view.findViewById(R.id.btn_kcimahi);
        kcimahi.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btn_kb:
                // do your code
                Intent i_kb = (new Intent(getActivity(), ListBandung.class));
                startActivity(i_kb);
                break;


            case R.id.btn_kbb:
                // do your code
                Intent i_kbb = (new Intent(getActivity(), ListKabBandung.class));
                startActivity(i_kbb);
                break;

            case R.id.btn_kbbb:
                // do your code
                Intent i_kbbb = (new Intent(getActivity(),ListBandungB.class));
                startActivity(i_kbbb);
                break;

            case R.id.btn_kcimahi:
                // do your code
                Intent i_kcimahi = (new Intent(getActivity(), ListCimahi.class));
                startActivity(i_kcimahi);
                break;

            default:
                break;
        }

    }

}
