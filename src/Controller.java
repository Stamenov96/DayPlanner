import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Controller {

	EventList List = new EventList();

	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

	void display() {
		List.displayList();
	}

	void add() throws IOException {

		Event ev = new Event();
		System.out.println("You are entering new Event");
		System.out.println("Please enter the Label of your event");
		ev.setName(bf.readLine());
		List.addelement(ev);
		System.out.println("Please enter the type of your event (Meeting or Task) : ");
		
		try {
			typeCheck(bf.readLine(),ev);
		} catch (WrongChoiceExeption e) {
			e.printStackTrace();
		}

		System.out.println("Please enter the Marker of your event(Public,Confidential ot Private)");
	
		try {
			markerCheck(bf.readLine(),ev);
		} catch (WrongChoiceExeption e) {
			e.printStackTrace();
		}

		System.out.println("Please enter the date of your event in format dd MM yyyy");
		try {
			formatDay(bf.readLine(), ev);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		 * ev.setDay(day);
		 * ev.setTime(time);
		 */

		System.out.println("Please enter the DESC of your event");
		StringBuilder builder = new StringBuilder();
		String description;
		while ((description = bf.readLine()).length() != 0) {
			builder.append(description);

		}

		ev.setDescription(builder.toString());
	}

	void typeCheck(String type,Event ev) throws WrongChoiceExeption{
		if(!(type.equalsIgnoreCase("Meeting") || !(type.equalsIgnoreCase("Task")))){
			throw new WrongChoiceExeption();
		}else{
			ev.setType(type);
		}
	}
	
	void markerCheck(String marker,Event ev) throws WrongChoiceExeption{
		if(!(marker.equalsIgnoreCase("Public") || !(marker.equalsIgnoreCase("Confidential")) || !(marker.equalsIgnoreCase("Private")))){
			throw new WrongChoiceExeption();
		}else{
			ev.setMarker(marker);
		}
	}
	
	void formatDay(String day,Event ev) throws ParseException{
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd MM yyyy");
        Date date = formatter.parse(day);
		ev.setDay(date);
	}
	

}
