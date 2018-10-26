package com.example.cburkhar.riskroll.viewModel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.view.View;

import com.example.cburkhar.riskroll.Model.RollResult;

import java.util.List;

public class Battle extends ViewModel {
    private MutableLiveData<RollResult> roll;
    private  MutableLiveData<String> firstName;
    private MutableLiveData<List<Integer>> attackResults;
    private LiveData<String> crashableFirstName;



    public Battle() {


    }


    public void Roll()
    {
        if (this.roll == null)
            this.roll = new MutableLiveData<RollResult>();

        roll.getValue().Roll(3,2);

    }

    public void rollClicked()
    {

    }

    public void onRollClick(View view)
    {
        this.setFirstName("Changed");
        Roll();
    }

    public MutableLiveData<List<Integer>> getAttackResults() {
        if (attackResults == null || roll == null) {
            attackResults = new MutableLiveData<List<Integer>>();
            return attackResults;
        }

        attackResults.setValue(roll.getValue().getAttackResult());

        return attackResults;
    }

    public MutableLiveData<String> getFirstName() {
        if (firstName == null) {
            firstName = new MutableLiveData<String>();

        }

        firstName.setValue("Tom");
        return firstName;
    }

        public void setFirstName(String firstNamel)
    {
        if (firstName == null)
        {
            firstName = new MutableLiveData<String>();
        }

        firstName.setValue(firstNamel);
    }
}
