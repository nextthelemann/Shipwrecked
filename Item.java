import java.util.*;
import java.io.*;

public class Item implements Serializable {
	//variables
	private String itemTitle;
	private String itemDescription;
	private String itemUsed;


	//empty constructor
	public Item() {
		itemTitle = new String();
		itemDescription = new String();
		itemUsed = new String();
	}
	//partial constructor
	public Item(String title) {
		itemTitle = title;
		itemDescription = new String();
		itemUsed = new String();
	} 
	//full constructor
	public Item(String title, String description, String used) {
		itemTitle = title;
		itemDescription = description;
		itemUsed = used;
	}

	public String toString() {
		return itemTitle;
	}

	public String getTitle() {
		return itemTitle;
	}

	public String getDescription() {
		return itemDescription;
	}

	public void setTitle(String title) {
		itemDescription = title;
	}

	public void setDescription(String description) {
		itemDescription = description;
	}

	public String use() {
		return itemUsed;
	}
}