package Abstraction.Packages.com.automobile;

import Abstraction.Packages.com.automobile.twowheeler.Hero;
import Abstraction.Packages.com.automobile.twowheeler.Honda;
import Abstraction.Packages.com.automobile.fourwheeler.Logan;
import Abstraction.Packages.com.automobile.fourwheeler.Ford;

public class Test {

    public static void main(String[] args) {

        Hero hero = new Hero();
        System.out.println("Hero Speed: " + hero.getSpeed());
        hero.radio();

        Honda honda = new Honda();
        System.out.println("Honda Speed: " + honda.getSpeed());
        honda.cdplayer();

        Logan logan = new Logan();
        System.out.println("Logan Speed: " + logan.speed());
        System.out.println("GPS: " + logan.gps());

        Ford ford = new Ford();
        System.out.println("Ford Speed: " + ford.speed());
        System.out.println("Temperature: " + ford.tempControl());
    }
}