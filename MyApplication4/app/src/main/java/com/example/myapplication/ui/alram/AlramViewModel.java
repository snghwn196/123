package com.example.myapplication.ui.alram;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AlramViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AlramViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is alram fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}