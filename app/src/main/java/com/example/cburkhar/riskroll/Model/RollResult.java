package com.example.cburkhar.riskroll.Model;

import android.os.Debug;
import android.util.Log;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RollResult {

    private List<Integer> lmAttackResult;
    private List<Integer> lmDefendResult;


    public RollResult() {
    }

    public List<Integer> getAttackResult() {
        return lmAttackResult;
    }

    public List<Integer> getDefendResult() {
        return lmDefendResult;
    }

    public void Roll(Integer Attack, Integer Defend)
    {
        lmAttackResult = new ArrayList<>();
        lmDefendResult = new ArrayList<>();

        Log.d("adding attack", "Attack");
        this.addRoll(Attack, lmAttackResult);
        Log.d("adding defend", "Defend");
        this.addRoll(Defend, lmDefendResult);

        for (Integer r : lmAttackResult
                ) {

            Log.d("verify defend", r.toString());
        }
        

    }


    private void addRoll(Integer count, List<Integer> container)
    {
        for (int i = 0; i < count; i++) {
            lmAttackResult.add(Roll());
            Log.d("Roll", lmAttackResult.get(i).toString());
        }
    }
    
    private static int Roll()
    {
        return generateRandomIntIntRange(1,6);
    }

    public static int generateRandomIntIntRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }




}
