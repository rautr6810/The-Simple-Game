package com.game;

public class Main {

	public static void main(String[] args) {
		Player1 player=new Player1("rahul", "sword", 100 );
//		System.out.println(player.getName());
//		System.out.println(player.getHealth());
//		System.out.println(player.getWeapon());
		
		player.damageByGun1();
		player.damageByGun1();
		player.damangeByGun2();
		player.heal();
		
//		Player2 betterplayer=new Player2("ram", "machinegun", 80, true );
//		betterplayer.damageByGun1();
	}

}
