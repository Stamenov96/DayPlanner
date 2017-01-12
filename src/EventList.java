import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EventList {
	
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
			System.out.println(event.name);
		}
		
	}
	
	private List sort(List<Event> list){
		
		return thelist;
		
	}
	
	

}
