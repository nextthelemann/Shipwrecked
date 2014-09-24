import java.io.*;
import java.util.*;

public class Exit implements Serializable {
	
	public static final int UNDEFINED = 0;
	public static final int NORTH = 1;
	public static final int SOUTH = 2;
	public static final int EAST = 3;
	public static final int WEST = 4;

	public static final String[] dirName = {"UNDEFINED", "NORTH", "SOUTH", "EAST","WEST"};
	public static final String[] shortDirName = {"NULL", "N", "S", "E", "W"};

	private Location leadsTo;
	private int direction;
	private String directionName;
	private String shortDirectionName;

	public Exit() {
		direction = Exit.UNDEFINED;
		leadsTo = null;
		directionName = dirName[UNDEFINED];
		shortDirectionName = shortDirName[UNDEFINED];
	}

	public Exit(int dir, Location leads) {
		direction = dir;
		leadsTo = leads;

		if(direction <= dirName.length) {
			directionName = dirName[direction];
		}
		else if(direction <= shortDirName.length) {
			shortDirectionName = shortDirName[direction];
		}	
	}

	public String toString() {
		return directionName;
	}

	public void setDirectionName(String dirname) {
		directionName = dirname;
	}

	public String getDirectionName() {
		return directionName;
	}

	public void setShortDirectionName(String shortName) {
		shortDirectionName = shortName;
	}

	public String getShortDirectionName() {
		return shortDirectionName;
	}

	public void setLeadsTo(Location leadsTo) {
		leadsTo = leadsTo;
	}

	public Location getLeadsTo() {
		return leadsTo;
	}
}