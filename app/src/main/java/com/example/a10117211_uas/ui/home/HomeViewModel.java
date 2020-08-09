package com.example.a10117211_uas.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
//Tanggal   :8-8-2020 - 12-08-2020
//Nim		:10117211
//Nama 	    :Defrag Muhammad Al'araaf Dasmana
//Kls		:IF-7
public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Aplikasi CAW KEUN merupakan aplikasi wisata khusus Kota Bandung , Kab.Bandung, Kab.Bandung Barat, dan Kota Cimahi" +
                "Aplikasi ini bertujuan untuk wisatawan yang ingin berkunjung ke kota-kota tersebut namun bingung mencari lokasi " +
                "wisata yang rekomendasi NAH!! aplikasi ini akan memudahkan untuk mencari tempat-tempat wisata yg di rekomendasi");
    }

    public LiveData<String> getText() {
        return mText;
    }
}