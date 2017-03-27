package es.unileon.prg.date;

public class MainDate{

	public static void main(String[] args){

	Date fecha=new Date (27,03,2017);
	Date fecha2= new Date(10,10,2017);

	System.out.println(fecha.isSameYear(fecha2));
	}
}
