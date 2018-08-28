package com.example.cburkhar.riskroll.viewModel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.example.cburkhar.riskroll.Model.RollResult;

public class Battle extends ViewModel {
    private MutableLiveData<RollResult> roll;

    public Battle() {
        this.roll = new MutableLiveData<RollResult>();
    }

    public void Roll()
    {
        roll.getValue().Roll(3,2);
    }
}
