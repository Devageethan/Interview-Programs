package numberprogram;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Timeformat {
public static void main(String[] args) {
	String time="08:45";
	DateTimeFormatter d=DateTimeFormatter.ofPattern("HH:mm");
	LocalTime l=LocalTime.parse(time,d);
	int hours=l.getHour();
	int minutes=l.getMinute();
	int total=(hours*60)+minutes;
	System.out.println(total);
}
}
