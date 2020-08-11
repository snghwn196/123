package com.example.myapplication.ui.image;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ImageViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ImageViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is image fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}