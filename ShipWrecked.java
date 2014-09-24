import java.util.Scanner;
import java.io.*;
import java.util.*;

public class ShipWrecked {

	private static final String filename = "gameworld.dat";
	private static final String gameTitle = "ShipWrecked";
	private static final String subTitle = "The Orginal Island Adventure Game";
	private static final String author = "Scott Thelemann(2014)";
	private static final String info = "Release 1, Version 1.0";
	
	private World world;
	private Player player;

	public ShipWrecked() throws Exception {
		FileInputStream fin = new FileInputStream(filename);
		ObjectInputStream objectIn = new ObjectInputStream(fin);
		world = (World) objectIn.readObject();
		player = new Player();
	} 
	
	public static void main(String[] args) throws Exception {

		new ShipWrecked().play();
	}

	public void play() {
		
		String input = null;
		boolean validCommand = false;


		Scanner command = new Scanner(System.in);

		intro();
		world.showLocation();

		for(;;) {
			validCommand = false;
			String go = "GO";
			String examine = "EXAMINE";
			String look = "LOOK";
			String take = "TAKE";
			String drop = "DROP";
			String use = "USE";

			
			input = command.nextLine();
			input = input.toUpperCase();
			System.out.println();



			if(input.length() == 0) {
				System.out.println("You should at least do something...");
			}

			if(input.compareTo("QUIT") == 0) {
				System.out.println("You were ShipWrecked...");
				System.exit(0);
			}

			ArrayList<Exit> exits = world.getCurrentLocation().getExits();

			for(Exit ex : exits) {
				if(input.compareTo(ex.getDirectionName()) == 0) {
					world.setCurrentLocation(ex.getLeadsTo());
					validCommand = true;
					world.showLocation();
					break;
				}
				else {
					validCommand = false;
				}
			}

			ArrayList<Item> items = world.getItems();

			if(input.indexOf(take) > -1) {
				for(Item i : items) {
					if(input.indexOf(i.toString().toUpperCase()) > -1) {
						player.addItem(i);
						player.showItems();
						validCommand = true;
						break;
					}
					else {
						validCommand = false;
					}
				}
			}	

			if(input.indexOf(drop) > -1) {
				for(Item i : items) {
					if(input.indexOf(i.toString().toUpperCase()) > -1) {
						player.removeItem(i);
						player.showItems();
						validCommand = true;
						break;
					}
					else {
						validCommand = false;
					}
				}
			}

			if(input.indexOf(examine) > -1) {
				for(Item i : items) {
					if(input.indexOf(i.toString().toUpperCase()) > -1) {
						System.out.println(i.getDescription());
						System.out.println();
						validCommand = true;
						break;
					}
					else {
						validCommand = false;
					}
				}
			}

			if(input.indexOf(look) > -1) {
				world.showLocation();
				validCommand = true;
			}

			if(input.indexOf(use) > -1) {
				for(Item i : items) {
					if(input.indexOf(i.toString().toUpperCase()) > -1) {
						System.out.println(i.use());
						validCommand = true;
						break;
					}
					else {
						validCommand = false;
					}
				}
			}




			if(!validCommand) {
				System.out.println("I don't think you want to do that...");
				System.out.println();
			}			
		}	
	}

	public void intro() {

		Scanner command = new Scanner(System.in);
		
		String introductionTitle = "AT AN UNKNOWN BEACH";
		String introduction = "You open your eyes. You quickly realize that you are no longer on a plane. But instead you are lying on a beach. Your vision is foggy, you need to stand up to figure out what happened";
		String playerCommand = null;
		boolean isIntro = true;

		System.out.println();
		System.out.println(gameTitle);
		System.out.println(subTitle);
		System.out.println("By " + author);
		System.out.println();
		System.out.println(info);
		System.out.println();

		System.out.println(introductionTitle);
		System.out.println();
		System.out.println(introduction);
		System.out.println();

		while(isIntro) {
			playerCommand = command.nextLine();
			System.out.println(); 


			playerCommand = playerCommand.toUpperCase();

			if (playerCommand.compareTo("STAND UP") == 0 || playerCommand.compareTo("GET UP") == 0) {
				System.out.println("You stand up. Your eyes began to regain focus as you slowly start to realize what happend...");
				System.out.println();
				isIntro = false;
				break;
			}
			else {
				System.out.println("I don't think you want to do that...");
				System.out.println();
			}
		}
	}



}