package edu.hitsz.prop;


import edu.hitsz.aircraft.AbstractAircraft;
import edu.hitsz.aircraft.BossEnemy;
import edu.hitsz.aircraft.HeroAircraft;

import java.util.List;

public class PropBomb extends AbstractProp{

    public PropBomb(int locationX, int locationY, int speedX, int speedY) {
        super(locationX, locationY, speedX, speedY);
    }



    /**
     * 炸弹道具对英雄机不生效
     * @param hero
     */
    @Override
    public void effect(HeroAircraft hero) {
    }


    /**
     * 炸弹道具会炸掉除 boss 外的敌机
     * @param enemies
     */
    @Override
    public void effect(List<AbstractAircraft> enemies) {
        for (AbstractAircraft enemy : enemies) {
            if ( !(enemy instanceof BossEnemy) ){
                enemy.vanish();
            }
        }
        System.out.println("BombSupply active!");
        this.vanish();
    }

}
