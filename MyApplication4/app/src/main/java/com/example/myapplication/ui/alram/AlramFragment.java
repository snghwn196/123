package com.example.myapplication.ui.alram;

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

import com.example.myapplication.R;


public class AlramFragment extends Fragment {

    private AlramViewModel alramViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        alramViewModel =
                ViewModelProviders.of(this).get(AlramViewModel.class);
        View root = inflater.inflate(R.layout.fragment_iamge, container, false);
        final TextView textView = root.findViewById(R.id.text_gallery);
        alramViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}