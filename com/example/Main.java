package main;

import classes.Cabinet;
import classes.Employee;
import classes.Office;
import classes.Scanner;

/**
 * Класс с методом main
 */
public class Main {

	/**
	 * Внутри метода происходит простое тестирование функционала проекта
	 * @param args не используется
	 */
    public static void main(String[] args) {
	    Office office = new Office();

	    Cabinet cabinet314 = new Cabinet("314");

		cabinet314.setDevice(new Scanner("Printer1", "1111"));

		cabinet314.addEmployee(new Employee("1", "Юрий заболотный"));
		cabinet314.addEmployee(new Employee("2", "Евгений Демьянов"));

		office.addCabinet(cabinet314);

		office.printOfficeInfo();
    }
}
