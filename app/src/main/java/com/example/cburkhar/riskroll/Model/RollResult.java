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


        System.out.print("\n Adding attack");


        this.addRoll(Attack, lmAttackResult);
        System.out.print("\n adding defend");
        this.addRoll(Defend, lmDefendResult);

        for (Integer r : lmAttackResult
                ) {

            System.out.print("\n Verify attack result" + r.toString());
        }
        

    }


    private void addRoll(Integer count, List<Integer> container)
    {
        for (int i = 0; i < count; i++) {
            container.add(Roll());
            System.out.print(container.get(i).toString());
        }
    }
    
    private static int Roll()
    {
        return generateRandomIntIntRange(1,6);
    }

    private static int generateRandomIntIntRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }




}
