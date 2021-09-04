package com.amulya.mysampleapp.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.amulya.mysampleapp.R;
import com.amulya.mysampleapp.viewmodel.CountViewModel;

public class MainFragment extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
//        com.amulya.mysampleapp.databinding.ActivityMainBinding binding = DataBindingUtil.setContentView(getActivity(), R.layout.activity_main);

//
//        CountViewModel viewModel = new CountViewModel();
//        databinding.setViewModel(viewModel);
    }
}
