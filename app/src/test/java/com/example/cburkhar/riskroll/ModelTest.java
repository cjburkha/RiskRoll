package com.example.cburkhar.riskroll;

import com.example.cburkhar.riskroll.Model.RollResult;

import org.junit.Test;
import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ModelTest {
    private RollResult rr = new RollResult();
    @Test
    public void testRollSize()
    {

        rr.Roll(3, 2);

        assertEquals(3, rr.getAttackResult().size());
        assertEquals(2, rr.getDefendResult().size());

    }

    @Test
    public void testRollValues()
    {
        int attack = 3;
        int defend = 2;
        rr.Roll(attack, defend);
        //
        for (int i = 0; i< attack; i++)
            assertTrue(rr.getAttackResult().get(i) < 7 && rr.getAttackResult().get(i) > 0);

        for (int i = 0; i< defend; i++)
            assertTrue(rr.getDefendResult().get(i) < 7 && rr.getDefendResult().get(i) > 0);

    }
}
