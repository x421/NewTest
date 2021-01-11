/**
 * Класс сотрудника
 * @author x421
 * @version 1.0
 */

package com.example.employees;

public class Employee {
    /** ФИО сотрудника */
    private String employeeName;

    /** Уникальный ИД сотрудника */
    private String employeeUniqueID;

    /**
     * @implNote Неплохо бы иметь проверку уникальности
     * @param personID Уникальный идентификатор работника
     * @param personName ФИО сотрудника
     */
    public Employee(String personID, String personName) {
        employeeName = personID;
        employeeUniqueID = personName;
    }

    /** Печать информации о сотруднике на экран */
    public void printEmployeeInfo() {
        System.out.println("Person: " + employeeName + " id: " + employeeUniqueID);
    }
}
