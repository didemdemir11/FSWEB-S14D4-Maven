package org.example.rpg;

public class Troll extends Monster implements Bleedable, Posionable {
    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double bleed() {
        return getDamage()*0.25;
    }

    @Override
    public double posion() {
        return getDamage()*0.3;
    }
    @Override
    public double attack(){
        return super.attack()+ bleed()+posion();
    }
}
