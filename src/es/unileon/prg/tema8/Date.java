package src.es.unileon.prg.tema8;

public class Date {

	private int day;
	private int month;
	private int year;

	public String dateString (){
		String cambio="";
		switch(this.month){
			case 1: cambio="Dia " + this.day + " de Enero del año " + this.year;
				break;
			case 2: cambio="Dia " + this.day + " de Febrero del año " + this.year;
				break;
			case 3: cambio="Dia " + this.day + " de Marzo del año " + this.year;
				break;
			case 4: cambio="Dia " + this.day + " de Abril del año " + this.year;
				break;
			case 5: cambio="Dia " + this.day + " de Mayo del año " + this.year;
				break;
			case 6: cambio="Dia " + this.day + " de Junio del año " + this.year;
				break;
			case 7: cambio="Dia " + this.day + " de Julio del año " + this.year;
				break;
			case 8: cambio="Dia " + this.day + " de Agosto del año " + this.year;
				break;
			case 9: cambio="Dia " + this.day + " de Septiembre del año " + this.year;
				break;
			case 10: cambio="Dia " + this.day + " de Octubre del año " + this.year;
				break;
			case 11: cambio="Dia " + this.day + " de Noviembre del año " + this.year;
				break;
			case 12: cambio="Dia " + this.day + " de Diciembre del año " + this.year;
				break;
		}
		return cambio;
	}

	public Date(int day, int month, int year) throws DateException{
		this.year = year;
		if (month < 1 || month > 12) {
			throw new DateException("\nMes " + month + " no valido" +
					"Solo valores posibles entre 1 y 12.");
		}else{
			this.month = month;
		}

		if (isDayOfMonthRight(day,month)) {
			this.day=day;
			this.month=month;
			this.year=year;
		}else{
			throw new DateException("La fecha introducida no es correcta");
		}
	}

	public void setDay(int day) throws DateException{
		if(isDayOfMonthRight(this.day, month)){
			this.day=day;
		}else{
			throw new DateException("El valor introducido " + day + " no es válido para los días de un mes");
		}
	}

	public void setMonth (int month) throws DateException{
		if(isDayOfMonthRight(day, this.month)){
			this.month=month;
		}else{
			throw new DateException("El valor introducido " + month + " no es válido para los meses");
		}
	}


	public int getDay(){
		return this.day;
	}

	public int getMonth(){
		return this.month;
	}

	public int getYear(){
		return this.year;
	}

	private boolean isDayOfMonthRight(int day, int month){
		boolean result = false;
		switch(month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
			{
				if(day>=1 && day<=31){
					result = true;
				}
				break;
			}
			case 2: 
			{
				if(day>=1 && day<=28){
					result= true;
				}
				break;
			}
			case 4:
			case 6:
			case 9:
			case 11:
			{
				if(day>=1 && day<=30){
					result = true;
				}
				break;
			}
		}
		return result;
	}

	@Override
	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}

	public boolean isSameDay (Date anotherDate){
		if(this.day==anotherDate.getDay()) 
			return true;
		return false;
	}

	public boolean isSameMonth (Date anotherDate){
		if(this.month == anotherDate.getMonth())
			return true;
		return false;
	}

	public boolean isSameYear (Date anotherDate){
		if(this.year == anotherDate.getYear())
			return true;
		return false;
	}

	public boolean isSame (Date anotherDate){
		if((this.day == anotherDate.getDay()) && (this.month == anotherDate.getMonth()) && (this.year == anotherDate.getYear()))
			return true;
		return false;
	}

	public boolean isSameDay1 (Date anotherDate){
		return(this.day==anotherDate.getDay());
	}

	public boolean isSameMonth1 (Date anotherDate){
		return(this.month==anotherDate.getMonth());
	}

	public boolean isSameYear1 (Date anotherDate){
		return(this.year==anotherDate.getYear());
	}

	public boolean isSame1 (Date anotherDate){
		return((isSameDay1(anotherDate)) && (isSameMonth1(anotherDate)) && (isSameYear1(anotherDate)));
	}

	public String nameMonth(){
		String name="";
		switch (this.month){
			case 1: name="Enero";
				break;
			case 2: name="Febrero";
				break;
			case 3: name= "Marzo";
				break;
			case 4: name= "Abril";
				break;
			case 5: name= "Mayo";
				break;
			case 6: name= "Junio";
				break;
			case 7: name= "Julio";
				break;
			case 8: name= "Agosto";
				break;
			case 9: name= "Septiembre";
				break;
			case 10: name= "Octubre";
				break;
			case 11: name= "Noviembre";
				break;
			case 12: name= "Diciembre";
				break;

		}
		return name;
	}

	public String seasonMonth (){
		String season="";
		switch(this.month){
			case 1: 
			case 2: 
			{
				season="Invierno";
				break;
			}
			case 3:
				if(this.day<21){
					season="Invierno";
				}else{	
					season="Primavera";
				}
				break;
			case 4:
			case 5:
			{
				season="Primavera";
				break;
			}
			case 6: 
				if(this.day<21){
					season="Primavera";
				}else{
					season="Verano";
				}
				break;
			case 7:
			case 8:
			{
				season="Verano";
				break;
			}
			case 9: 
				if(this.day<23){
					season="Verano";
				}else{
					season="Otoño";
				}
				break;
			case 10:
			case 11:
			{
				season="Otoño";
				break;
			}
			case 12: 
				if(this.day<22){
					season="Otoño";
				}else{
					season="Invierno";
				}
				break;
		}
		return season;
	}

	public String monthLeft (){
		String left="";
		switch(this.month){
			case 1: left="Quedan 11 meses para el fin de año";
				break;
			case 2: left="Quedan 10 meses para el fin de año";
				break;
			case 3: left="Quedan 9 meses para el fin de año";
				break;
			case 4: left="Quedan 8 meses para el fin de año";
				break;
			case 5: left="Quedan 7 meses para el fin de año";
				break;
			case 6: left="Quedan 6 meses para el fin de año";
				break;
			case 7: left="Quedan 5 meses para el fin de año";
				break;
			case 8: left="Quedan 4 meses para el fin de año";
				break;
			case 9: left="Quedan 3 meses para el fin de año";
				break;
			case 10: left="Quedan 2 meses para el fin de año";
				break;
			case 11: left="Queda 1 mes para el fin de año";
				break;
			case 12: left="Último mes del año";
				break;
		}
		return left;
	}

	public String daysEndMonth(){
		String end="";
		int totalDays=0, finals=0;
		switch(this.month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
			{
				totalDays=31;
				finals=totalDays-this.day;
				end="Quedan " + finals + " días para el final de mes";
				break;
			}
			case 4:
			case 6:
			case 9:
			case 11:
			{
				totalDays=30;
				finals=totalDays-this.day;
				end="Quedan " + finals + " días para el fin de mes";
				break;
			}
			case 2:
			{
				if ((this.year % 400 == 0) || ((this.year % 100 != 0) && (this.year % 4 == 0))){
    				totalDays=29;
    				finals=totalDays-this.day;
					end="El año es bisiesto y quedan " + finals + " días para el fin de mes";
					break;
    			}else{
    				totalDays=28;
    				finals=totalDays-this.day;
					end="Quedan " + finals + " días para el fin de mes";
					break;
				}
			}
		}
		return end;
	}

	public String sameDaysMonth(){
		String same="";	
		switch(this.month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
			{
				same ="El mes introducido pertenece al grupo de los meses de 31 días, los cuales son: Enero, Marzo, Mayo, Julio, Agosto, Octubre y Diciembre";
				break;
			}
			case 4:
			case 6:
			case 9:
			case 11:
			{
				same="El mes introducido pertenece al grupo de los meses con 30 días, los cuales son: Abril, Junio, Septiembre y Noviembre";
				break;
			}
			case 2:
			{
				same="El mes de Febrero es el único";
				break;
			}
		}
		return same;
	}

	public int daysSince(){
		int cuenta;
		switch(this.month){
			case 1: return this.day;
			
			case 2:return this.day+31;
				
			case 3:return this.day+31+28;
				
			case 4:return this.day+31*2+28;
				
			case 5:return this.day+31*2+28+30;
				
			case 6:return this.day+31*3+28+30;
				
			case 7:return this.day+31*4+30*2+28;
				
			case 8:return this.day+31*5+28+30*2;
				
			case 9:return this.day+31*5+30*3+28;
				
			case 10:return this.day+31*6+30*3+28;
				
			case 11:return this.day+31*6+30*4+28;
				
			case 12:return this.day+31*6+30*4+28;
				
		}
		
		return 0;
	}

	public int randomDate(){
		int year=this.year;
		int dia=0;
		int mes;
		int count=0;

		try{
			Date fecha=new Date(this.day-1,this.month,this.year);
			while((!this.isSameDay(fecha)) || (!this.isSameMonth(fecha))){
				mes=(int)(Math.random()*12)+1;
				count ++;
				switch(mes){
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
					{
						dia=(int)(Math.random()*31)+1;
						break;
					}
					case 4:
					case 6:
					case 9:
					case 11:
					{
						dia=(int)(Math.random()*30)+1;
						break;
					}
					case 2:
					{
						dia=(int)(Math.random()*28)+1;
						break;
					}
				}
				fecha=new Date (dia,mes,year);	
			}
		}
			catch (DateException e){
				System.out.println(e.getMessage());
			}
		return count;
	}

	public int randomDateDo(){
		int year=this.year;
		int dia=0;
		int mes;
		int count=0;
		Date fecha;
		try{
			do{
				fecha=new Date(this.day-1,this.month,this.year);
				mes=(int)(Math.random()*12)+1;
				count ++;
				switch(mes){
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
					{
						dia=(int)(Math.random()*31)+1;
							break;
					}
					case 4:
					case 6:
					case 9:
					case 11:
					{
						dia=(int)(Math.random()*30)+1;
						break;
					}
					case 2:
					{
						dia=(int)(Math.random()*28)+1;
						break;
					}
				}
					
				fecha=new Date (dia,mes,year);	
			}
			while((!this.isSameDay(fecha)) || (!this.isSameMonth(fecha)));
		}
		catch (DateException e){
			System.out.println(e.getMessage());
		}
		return count;
	}

	public void dayOfWeek(){
		int dias = daysSince();
		int week = dias%7;

		switch(week){
			case 1: System.out.println("\nDomingo");
				break;
			case 2: System.out.println("\nLunes");
				break;
			case 3: System.out.println("\nMartes");
				break;
			case 4: System.out.println("\nMiercoles");
				break;
			case 5: System.out.println("\nJueves");
				break;
			case 6: System.out.println("\nViernes");
				break;
			case 7: System.out.println("\nSábado");
				break;
		}
	}
	
}