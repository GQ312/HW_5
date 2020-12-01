package com.company;
import com.company.project.Boss;
import com.company.project.Hero;
public class Main {

    public static void main(String[] args) {
	Boss boss = new Boss();
	boss.setHealth(300);
	boss.setDamage(30);
	boss.setTypeOfDefence("Medical");

        System.out.println(boss.getHealth());
        System.out.println(boss.getDamage());
        System.out.println(boss.getTypeOfDefence());


    }
}
