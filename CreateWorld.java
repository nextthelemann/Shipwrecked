import java.io.*;

public final class CreateWorld {

	public static String filename = "gameworld.dat";

	public CreateWorld() {
		
	}
	
	public static void main(String[] args) {

		World world = new World();

		//create item objects
		Item i1 = new Item("Shell", "a shell", "does nothing");
		Item i2 = new Item("Conch Shell", "looks like it can make a loud sound", "produces a fog horn sound");
		Item i3 = new Item("Rope", "a rope", "ties rope around neck");
		Item i4 = new Item("Plank", "a wooden plank", "spent an hour talking to the plank");
		Item i5 = new Item("Fish","looks like a beta fish", "you don't want to use a beta fish" );

		//Create location objects
		Location l1 = new Location("The Beach", "You washed up onto this beach after the plane incident... The place is surrounded by a giant rock to the west, and palm trees from all sides except for a giant waterfall that you can see off into the distance to the east.");
		Location l2 = new Location("Platform Rock", "This long flat rock you are standing out extends out into the ocean, and has strange engravings at the end of it. You can jump safely into the water to the east, but the water to the west looks dangerous.");
		Location l3 = new Location("The Giant Pool", "This pool is connected by a stream to the north, and another to the east. The pool is suprisingly warm and looks to be about chest deep. There is a closed safe and conch shell at the bottom of the pool. The view to the north is overshadowed by a large mountain.");
		Location l4 = new Location("Waterfall", "There is giant waterfall falling from the cliff that you are standing on. You can see a decent sized rope attached to the rock overlooking the edge of the waterfall. To the east and south you notice giant rocks, and safe ocean water to the west.");
		Location l5 = new Location("Scarred Trail", "You are standing in the middle of a giant trail, that looks to have been cleared by some type of disaster. The mountain to the east seems to be closer, and you notice a strange shaped rock in front of you.");
		Location l6 = new Location("Coconut Grove", "You are surrounded by an endless amount of tall palm trees that seem to have coconuts.");
		Location l7 = new Location("Edge of Island Rocks", "There isn't much here but giant rocks in the water just ahead. The ocean to the west and north seems to be endless....");
		Location l8 = new Location("Top of Mountain", "You are the top of a mountain that overlooks the entire island. To notice that the island is surrounded by a coral reef except an opening to the ocean to the west. The mountain is rather bland, and has a steep drop off all around you except to the west.");
		Location l9 = new Location("Clearing in the Forest", "You are standing in the middle of a clearing in the forest with several planks of wood scattered around. There are several stones that look like good seats here. You also notice an animal grazing at the edge of the clearing.");
		Location l10 = new Location("Bridge", "You are the end of a bridge, that looks as if planks are missing. The bridge leads to an island that sorta of looks like the head of a chicken. Crossing the bridge looks difficult, unless of course you could fix the planks that are missing.");
		Location l11 = new Location("South Chicken Island", "You are at the south end of a chicken shaped island. The edge of the island looks like the head of a chicken, and is quite interesting. The island you are on is surrounded by sharp rocks on each of its sides.");
		Location l12 = new Location("North Chicken Island", "You are at the north end of a chicken shaped island. The rock shaped like a chicken head has something engraved into it. You notice that the ocean around you is never ending.");
		Location l13 = new Location("Lagoon Water", "You are wading in the middle of a Lagoon that contains various fish, and is closed in by a coral reef to the south and giant rock to the west. The only way out of the water is the beach to the north");
		Location l14 = new Location("Start of Scarred Trail", "You are what looks to be the beginning of the scarred trail. The scarred trail is the only thing you can see besides the trees that surround you, and the cave that is to the west.");
		Location l15 = new Location("Secret Beach", "The cave you are in is home to a beach, that is surrounded by rock on all sides except for the opening to the ocean to the west. To feel a sense of hope as you look out to the ocean.");
		Location l16 = new Location("Cliff", "You stand on the edge of a cliff, to the west you can see an opening in the reef. This opening seems to be the only way in and out of this mysterious island.");
		Location l17 = new Location("End of Scarred Trail", "You are what looks to be the ending of the scarred trail. The trail now looks as if it has been made by the crashing of something big, possibly your plane. You are also at the base of the mountain. The only way to the top is to the west, and it looks steep.");

		//l1's exits
		Exit e1 = new Exit(Exit.NORTH, l3);
		Exit e2 = new Exit(Exit.SOUTH, l13);
		//l2's exits
		Exit e3 = new Exit(Exit.NORTH, l6);
		Exit e4 = new Exit(Exit.EAST, l13);
		//l3's exits
		Exit e5 = new Exit(Exit.NORTH, l17);
		Exit e6 = new Exit(Exit.SOUTH, l1);
		Exit e7 = new Exit(Exit.WEST, l6);
		Exit e8 = new Exit(Exit.EAST, l9);
		//l4'2 exits
		Exit e9 = new Exit(Exit.NORTH, l9);
		Exit e10 = new Exit(Exit.WEST, l13);
		//l5'2 exits
		Exit e11 = new Exit(Exit.NORTH, l7);
		Exit e12 = new Exit(Exit.SOUTH, l6);
		Exit e13 = new Exit(Exit.WEST, l14);
		Exit e14 = new Exit(Exit.EAST, l17);
		//l6's exits
		Exit e15 = new Exit(Exit.NORTH, l5);
		Exit e16 = new Exit(Exit.SOUTH, l2);
		Exit e17 = new Exit(Exit.WEST, l16);
		Exit e18 = new Exit(Exit.EAST, l3);
		//l7's exits
		Exit e19 = new Exit(Exit.SOUTH, l5);
		//l8's exits
		Exit e20 = new Exit(Exit.WEST, l17);
		//l9's exits
		Exit e21 = new Exit(Exit.SOUTH, l4);
		Exit e22 = new Exit(Exit.EAST, l10);
		Exit e23 = new Exit(Exit.WEST, l3);
		//l10's exits
		Exit e24 = new Exit(Exit.EAST, l12);
		Exit e25 = new Exit(Exit.WEST, l9);
		//l11's exits
		Exit e26 = new Exit(Exit.NORTH, l12);
		Exit e27 = new Exit(Exit.WEST, l10);
		//l12's exits
		Exit e28 = new Exit(Exit.SOUTH, l11);
		//l13's exits
		Exit e29 = new Exit(Exit.NORTH, l1);
		//l14's exits
		Exit e30 = new Exit(Exit.SOUTH, l16);
		Exit e31 = new Exit(Exit.EAST, l5);
		Exit e32 = new Exit(Exit.WEST, l15);
		//l15's exits
		Exit e33 = new Exit(Exit.EAST, l14);
		//l16's exits
		Exit e34 = new Exit(Exit.NORTH, l14);
		Exit e35 = new Exit(Exit.EAST, l6);
		//l17's exits
		Exit e36 = new Exit(Exit.SOUTH, l3);
		Exit e37 = new Exit(Exit.EAST, l8);
		Exit e38 = new Exit(Exit.WEST, l5);


		l1.addExit(e1);
		l1.addExit(e2);
	
		l2.addExit(e3);
		l2.addExit(e4);
	
		l3.addExit(e5);
		l3.addExit(e6);
		l3.addExit(e7);
		l3.addExit(e8);

		l4.addExit(e9);
		l4.addExit(e10);

		l5.addExit(e11);
		l5.addExit(e12);
		l5.addExit(e13);
		l5.addExit(e14);

		l6.addExit(e15);
		l6.addExit(e16);
		l6.addExit(e17);
		l6.addExit(e18);

		l7.addExit(e19);

		l8.addExit(e20);

		l9.addExit(e21);
		l9.addExit(e22);
		l9.addExit(e23);

		l10.addExit(e24);
		l10.addExit(e25);

		l11.addExit(e26);
		l11.addExit(e27);

		l12.addExit(e28);

		l13.addExit(e29);

		l14.addExit(e30);
		l14.addExit(e31);
		l14.addExit(e32);

		l15.addExit(e33);

		l16.addExit(e34);
		l16.addExit(e35);

		l17.addExit(e36);
		l17.addExit(e37);
		l17.addExit(e38);

		//Add the locations, and exits to game lists
		world.addLocation(l3);
		world.addLocation(l13);
		

		world.addExit(e1);
		world.addExit(e2);

		world.addItem(i1);
		world.addItem(i2);
		world.addItem(i3);
		world.addItem(i4);
		world.addItem(i5);

		//Set the current location
		world.setCurrentLocation(l1);

		try{
			FileOutputStream out = new FileOutputStream(filename);
			ObjectOutputStream objectOut = new ObjectOutputStream(out);
			objectOut.writeObject(world);
			objectOut.close();

			System.out.println("Game saved as " + filename);
		} catch(Exception e) {
			System.err.println("Unable to create game data");
		}

}


}