package org.example.rpg;

public class Main {
    public static void main(String[] args) {

        Troll troll = new Troll("Grom", 100, 20);
        System.out.println("Toplam Hasar: " + troll.attack());

        System.out.println("\n");

        Werewolf werewolf = new Werewolf("Fenrir", 120, 15);
        System.out.println("Toplam Hasar: " + werewolf.attack());
    }
}
