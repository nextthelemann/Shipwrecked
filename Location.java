import java.util.*;
import java.io.*;

public class Location implements Serializable {
	
	//variables
	private String roomTitle;
	private String roomDescription;
	private ArrayList<Exit> exits;

	public Location() {
		roomTitle = new String();
		roomDescription = new String();
		exits = new ArrayList<Exit>();
	}
	
	public Location(String title) {
		roomTitle = title;
		roomDescription = new String();
		exits = new ArrayList<Exit>();
	}

	public Location(String title, String description) {

		roomTitle = title;
		roomDescription = description;
		exits = new ArrayList<Exit>();
	}

	public String toString() {
		return roomTitle;
	}

	public void addExit(Exit exit) {
		exits.add(exit);
	}

	public void removeExit(Exit exit) {
		if(exits.contains(exit)) {
			exits.remove(exit);
		}
	}

	public ArrayList<Exit> getExits() {
		return exits;
	}

	public String getTitle() {
		return roomTitle;
	}

	public void setTitle(String title) {
		roomTitle = title;
	}

	public void setDescription(String description) {
		roomDescription = description;
	}

	public String getDescription() {
		return roomDescription;
	}
}