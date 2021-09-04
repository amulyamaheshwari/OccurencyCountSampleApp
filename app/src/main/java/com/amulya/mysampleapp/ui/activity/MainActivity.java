package com.amulya.mysampleapp.ui.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import com.amulya.mysampleapp.R;
import com.amulya.mysampleapp.viewmodel.CountViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.amulya.mysampleapp.databinding.ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        CountViewModel viewModel = ViewModelProviders.of(this).get(CountViewModel.class);
        binding.setCountviewModel(viewModel);
        binding.setLifecycleOwner(this);

    }

}