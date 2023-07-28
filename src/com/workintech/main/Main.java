package com.workintech.main;
import com.workintech.model.Player;
import com.workintech.model.Point;
import com.workintech.model.Weapon;

public class Main {
    public static void main(String[] args) {
        Point first = new com.workintech.model.Point(6, 5);

        Point second = new com.workintech.model.Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));

        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0,0);

        System.out.println("distance()= " + point.distance());
        System.out.println("**************************");

        Player player = new Player("Mahmut", 120, Weapon.AXE);
        System.out.println(player);
        player.loseHealth(50);
        System.out.println(player);
        player.restoreHealth(120);
        System.out.println(player);
    }
}