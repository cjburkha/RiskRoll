package com.example.cburkhar.riskroll;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.cburkhar.riskroll.viewModel.Battle;
import com.example.cburkhar.riskroll.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private Battle battleVM;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        Battle battle = new Battle();
        binding.setBattle(battle);
        binding.setLifecycleOwner(this);

        //setup observers
        //mModel = ViewModelProviders.of(this).get(NameViewModel.class);


        //setContentView(R.layout.activity_main);
    }
}
