package com.fr_soft.demos;

public class BattleRobot {
    private int life;
    private int attack;
    private int defence;
    
    public BattleRobot(int life, int attack, int defence) {
        this.life = life;
        this.attack = attack;
        this.defence = defence;
    }
    
    public int getLife() {
        return life;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefence() {
        return defence;
    }

    public void attack(BattleRobot r) {
        r.life -= (this.attack - r.defence);
        if (r.life < 0) {
            r.life = 0;
        }
    }
}
