import java.util.*;
import java.io.*;

public class World implements Serializable {
	
	private ArrayList<Location> locations;
	private	ArrayList<Exit> exits;
	private Location currentLocation;
	private ArrayList<Item> items;


	public World() {

		locations = new ArrayList<Location>();
		exits = new ArrayList<Exit>();
		items = new ArrayList<Item>();

		currentLocation = null;
	}

	public Location getCurrentLocation() {
		return currentLocation;
	}	

	public void setCurrentLocation(Location newLocation) {
		currentLocation = newLocation;
	}

	public void addExit(Exit exit) {
			if(!exits.contains(exit)) {
			exits.add(exit);
		}
	}

	public void addLocation(Location location) {
			if(!locations.contains(location)) {
				locations.add(location);
			}
	}

	public void showLocation() {
		System.out.println(currentLocation.getTitle());
		System.out.println(currentLocation.getDescription());
		System.out.println();
	}

	public void addItem(Item item) {
		if(!items.contains(item)) {
			items.add(item);
		}
	}

	public void removeItem(Item item) {
		if(items.contains(item)) {
			items.remove(item);
		}
	}

	public ArrayList<Item> getItems() {
		return items;
	}
}