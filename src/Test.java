import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	
	 public static void main(String[] args) throws ParseException{
	        String strDate = "16 01 2017";
	        SimpleDateFormat formatter = new SimpleDateFormat("dd MM yyyy");
	        Date dateStr = formatter.parse(strDate);
	        
	        String strtime="19:00:00";
	        SimpleDateFormat form = new SimpleDateFormat("kk:mm:ss");
	        Date time = form.parse(strtime);
	        
	        String strtime2="15:30:00";
	        Date time2 = form.parse(strtime);
	        
	        String formattedDate = formatter.format(dateStr);
	        System.out.println("yyyy-MM-dd date is ==>"+formattedDate);
	        //Date date1 = formatter.parse(formattedDate);

	        String formattedTime = form.format(time);
	        System.out.println("TIME ==>"+formattedTime);
	       // Date time1 = formatter.parse(formattedTime);

	        
	        /* formatter = new SimpleDateFormat("dd-MMM-yyyy");
	        formattedDate = formatter.format(date1);
	        System.out.println("dd-MMM-yyyy date is ==>"+formattedDate);
	        */
	        
	        
	        Event ev = new Event();
	        ev.setName("B-day");
	        ev.setType("Meeting");
	        ev.setMarker("Private");
	        ev.setDay(dateStr);
	        ev.setTime(time);
	        ev.setDescription("My B-Day");
	        
	        Event ev2 = new Event();
	        ev2.setName("Buy");
	        ev2.setType("Task");
	        ev2.setMarker("Private");
	        ev2.setDay(dateStr);
	        ev2.setTime(time2);
	        ev2.setDescription("Buy Cake");
	        
	        
	        
	        System.out.println("Type : " +ev.getType()+" Marker :"
	        		+ev.getMarker() + " Day : " +formatter.format(ev.getDay())+" Time : "+ev.getTime()
	        		+" Description : "+ev.getDescription());
	        
	        
	        EventList list = new EventList();
	        System.out.println(list.getSize());
	        
	        list.addelement(ev);
	        list.addelement(ev2);

	        System.out.println(list.getSize());
	        list.displayList();
	        
	        
	    }
	 
	 /*Collections.sort(list, new Comparator<MyClass>() {
		    public int compareTo(MyClass a, MyClass b) {
		        return a.getDate().compareTo(b.getDate());
		    }
		}*/
}
