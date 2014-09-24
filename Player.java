import java.util.*;
import java.io.*;

public class Player implements Serializable {
	//variables
	ArrayList<Item> items;

	public Player() {
		items = new ArrayList<Item>();
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

	public void showItems() {
		System.out.print("Currently carrying: ");
		for(int i = 0; i < items.size(); i++) {
			System.out.print(items.get(i) + ", ");
		}
		System.out.println();
	}
}	
