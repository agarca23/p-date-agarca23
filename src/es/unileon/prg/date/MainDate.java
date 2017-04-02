package es.unileon.prg.date;

public class MainDate{

	public static void main(String[] args){

	Date fecha=new Date (27,02,2017);
	Date fecha2= new Date(10,10,2017);

	int dias=fecha.dayOfTheYear();
	int intentos=fecha.attempsRandomDate();
	System.out.println(intentos);
	System.out.println(dias);
	System.out.println(fecha.isSameYear(fecha2));
	}
}
