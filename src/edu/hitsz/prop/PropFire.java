package edu.hitsz.prop;

import edu.hitsz.aircraft.AbstractAircraft;
import edu.hitsz.aircraft.HeroAircraft;
import edu.hitsz.application.Main;

import java.util.List;

public class PropFire extends AbstractProp{


    public PropFire(int locationX, int locationY, int speedX, int speedY) {
        super(locationX, locationY, speedX, speedY);
    }

    /**
     * 火力道具会让英雄子弹数多一发,
     * 最多四发
     * @param hero
     */
    @Override
    public void effect(HeroAircraft hero) {
        int num = hero.getShootNum();
        if (num < 4){
            hero.setShootNum(num + 1);
        }
        System.out.println("FireSupply active!");
        this.vanish();
    }

    /**
     * 火力道具不会对敌机造成影响
     * @param enemies
     */
    @Override
    public void effect(List<AbstractAircraft> enemies) {

    }

}
