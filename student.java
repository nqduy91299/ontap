import java.util.Date;
import java.util.Calendar;

public class student {
	public String name;
	public String id;
	public int yearOfBirth;
	
	public student() {
		name = null;
		id = null;
		yearOfBirth = 0;
	}
	
	public student(String name, String id, int yearOfBirth) {
		this.name = name;
		this.id = id;
		this.yearOfBirth = yearOfBirth;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return Calendar.getInstance().get(Calendar.YEAR)- yearOfBirth;
	}
	
	public String toString() {
		return "name: "+name+", id: "+id+", yearOfBirth: "+yearOfBirth+"";
	}
}
