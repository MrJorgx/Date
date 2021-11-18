package src.es.unileon.prg.tema8;

public class MainDate {

	public static void main(String[] args) {

		Date today;

		try {
			today = new Date(28, 10, 2021);
			System.out.println(today.nameMonth());
			System.out.println("\n" + today.dateString());
			System.out.println("\n" + today.seasonMonth());
			System.out.println("\n" + today.monthLeft());
			System.out.println("\n" + today.toString());
			System.out.println("\n" + today.daysEndMonth());
			System.out.println("\n" + today.sameDaysMonth());
			System.out.println("\nEl número de días que han pasado desde el inicio de año: " + today.daysSince());
			System.out.println("\n[WHILE] Número de intentos: " + today.randomDate());
			System.out.println("\n[DO-WHILE] Número de intentos: " + today.randomDateDo());
			today.dayOfWeek();
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}
	}
}