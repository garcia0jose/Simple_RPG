import java.util.ArrayList;
import java.util.List;


public class Room {
	int number;
	String name;
	//= null
	List<String> desc = new ArrayList<String>();	
	List<String> exits = new ArrayList<String>();
	
	public Room(int x) {
		
		number = x;
		//name = "Blank Room";
		
	}
}
