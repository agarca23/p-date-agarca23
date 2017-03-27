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

	public boolean isSameYear(Date fecha){
		
		return this._year==fecha.getYear();
	}

	public boolean isSameDay(Date fecha){
		
		return this._day==fecha.getDay();
	}

	public boolean isSameMonth(Date fecha){
		
		return this._month==fecha.getMonth();
	}

	public String getMonthName(Date fecha){
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
		
}
