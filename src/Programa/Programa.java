package Programa;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2023-09-13T20:43:45Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 3);
		d = cal.getTime();
		int minutos = cal.get(Calendar.MINUTE);
		int mes = 1 +cal.get(Calendar.MONTH);
		System.out.println(sdf.format(d));
		System.out.println("Minutos:" + minutos);
		System.out.println("Mes:" + mes);

	}

}
