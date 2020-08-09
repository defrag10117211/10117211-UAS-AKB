package com.example.a10117211_uas.ui.wisata;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
//Tanggal    :8-8-2020 - 12-08-2020
//Nim		:10117211
//Nama 	    :Defrag Muhammad Al'araaf Dasmana
//Kls		:IF-7
public class WisataViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public WisataViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}