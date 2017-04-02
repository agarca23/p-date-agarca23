package es.unileon.prg.date;


public class Date{

	private int _day;
	private int _month;
	private int _year;

	public Date(){
		this._day=1;
		this._month=1;
		this._year=1990;
	}

	public Date(int day, int month, int year){
		this._day=day;
		this._month=month;
		this._year=year;
	}

	public Date(int year){
		int month=(int) (Math.random()*12+1);
		this._month=month;
		this._year=year;
		Date fechaAux= new Date();
		fechaAux.setMonth(month);
		int maxDays=fechaAux.getDaysofMonth();
		this._day=(int)(Math.random()*maxDays+1);
	}

	public boolean isSameYear(Date fecha){
		
		return this._year==fecha.getYear();
	}

	public boolean isSameDay(Date fecha){
		
		return this._day==fecha.getDay();
	}

	public boolean isSameMonth(Date fecha){
		
		return this._month==fecha.getMonth();
	}

	public boolean isSame(Date fecha){
		
		return this._day==fecha.getDay() && this._month==fecha.getMonth()&& this._year==fecha.getYear();
	}

	public String getMonthName(){
		int	mes=this.getMonth();
		StringBuffer month = new StringBuffer();
		switch(mes){
			case 1: month.append("Enero");
				break;
			case 2: month.append("Febrero");
				break;
			case 3: month.append("Marzo");
				break;
			case 4: month.append("Abril");
				break;
			case 5: month.append("Mayo");
				break;
			case 6: month.append("Junio");
				break;
			case 7: month.append("Julio");
				break;
			case 8: month.append("Agosto");
				break;
			case 9: month.append("Septiembre");
				break;
			case 10: month.append("Octubre");
				break;
			case 11: month.append("Noviebre");
				break;
			case 12: month.append("Diciembre");
				break;

		}
		return month.toString();
	}

	public String getSeason(){
		int	mes=this.getMonth();
		StringBuffer season = new StringBuffer();
		switch(mes){
			case 1:
			case 2:
			case 3: season.append("invierno");
				break;
			case 4:
			case 5:
			case 6: season.append("primavera");
				break;
			case 7:
			case 8:
			case 9: season.append("verano");
				break;
			case 10:
			case 11:
			case 12: season.append("otoño");
				break;

		}
		return season.toString();
	}



	public int getDaysofMonth(){
		int	mes=this.getMonth();
		int days=0;
		switch(mes){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: days=31;
				break;
			case 4:
			case 6:
			case 9:
			case 11: days=30;
				break;
			case 2: days=28;
				break;

		}
		return days;
	}

	public int getNumberMonthsEndYear(){
		int monthsLeft=0;
		int month=this.getMonth()+1;
		while(month<13){
			month++;
			monthsLeft++;
		}

		
		return monthsLeft;
	}

	public void printDatesUntilEndmonth(){
		Date fechaAux= new Date(0, this.getMonth(),this.getYear());

		for(int i=this.getDay()+1;i<=this.getDaysofMonth();i++){
			fechaAux.setDay(i);
			System.out.println(fechaAux.toString());
		}
	}

	public void printMonthsSameDays(){

		int days=this.getDaysofMonth();
		Date fechaAux= new Date();
		for(int i =1; i<=12;i++){
			fechaAux.setMonth(i);
			if(fechaAux.getDaysofMonth()==days){
				System.out.println(fechaAux.getMonthName());
			}
		}
	}

	public int dayOfTheYear(){
		int sumadias=0;
		
		Date fechaAux= new Date();
		for(int i =1; i<this.getMonth();i++){
			fechaAux.setMonth(i);
			sumadias+=fechaAux.getDaysofMonth();
		}
		sumadias+=this.getDay();

		return sumadias;
	}

	public int attempsRandomDate(){
		int attemps=0;
		int year=this.getYear();
		boolean bucle=false;		
		do{
			Date ramdomDate=new Date(year);
			attemps++;
			if(this.isSame(ramdomDate)){
				bucle=true;
			}
		}while(bucle==false);
		return attemps;
	}


	public int getDay() {
		return this._day;
	}

	public void setDay(int day) {
		this._day = day;
	}

	public int getMonth() {
		return this._month;
	}

	public void setMonth(int month) {
		this._month = month;
	}

	public int getYear() {
		return this._year;
	}

	public void setYear(int year) {
		this._year = year;
	}

	public String toString(){
		return this._day + "/" + this._month + "/" + this._year;
	}
		
}
