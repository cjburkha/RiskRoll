package com.example.cburkhar.riskroll;

import android.arch.core.executor.testing.InstantTaskExecutorRule;

import com.example.cburkhar.riskroll.viewModel.Battle;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.Assert.*;
import org.junit.rules.TestRule;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BattleTest {
    @Rule
    public TestRule rule = new InstantTaskExecutorRule();
    private Battle battle = new Battle();

    @Test
    public void testName()
    {
        //battle.setup();
        Assert.assertEquals("Tom", battle.getFirstName().getValue());
    }
    @Test
    public void setName()
    {
        //battle.setup();
        battle.setFirstName("Larry");
        Assert.assertEquals("Larry", battle.getFirstName().getValue());
    }

}
