package com.fr_soft.demos;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class BattleRobotTest {

    @Test
    public void lifeIsNotChangeIfAttackIsZero() {
        BattleRobot a = new BattleRobot(10, 0, 0);
        BattleRobot b = new BattleRobot(15, 5, 0);
        
        a.attack(b);
        
        assertThat(b.getLife(), is(15));
    }

}
