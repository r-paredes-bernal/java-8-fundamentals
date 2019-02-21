package java8.session1.inheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Car {

	private Long id;
	public String name;
	public Integer year;
	public String color;
	public Date date;
	
	  SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

	    String dateString = format.format( new Date()   );

	
    public Car(Long id, String name, Integer year, String color, Date date){
	       this.id = id;
	       this.name = name;
	       this.year = year;
	       this.color = color;
	       this.date = date;
	    }
	
    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", date=" + date +
                '}';
    }
  
}
