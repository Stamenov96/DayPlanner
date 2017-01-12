import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

public class EventList {


public static final String ANSI_RED = "\u001B[31m";
public static final String ANSI_RESET = "\u001B[0m";
	
	public List<Event> thelist = new ArrayList<Event>();
	
	int getSize(){
		return thelist.size();
	}
	
	void addelement(Event e){
		thelist.add(e);
	}
	
	void displayList(){
		for (Iterator iterator = thelist.iterator(); iterator.hasNext();) {
			Event event = (Event) iterator.next();
			System.out.println(ANSI_RED+event.name + " " + event.type +ANSI_RESET);
		}
		
	}
	
	private List sort(List<Event> list){
		
		return thelist;
		
	}

}
