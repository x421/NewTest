/**
 * Класс кабинета, включает в себя одно устройство
 * и множество сотрудников
 * @author x421
 * @version 1.0
 */

package classes;

import abstracts.Device;

import java.util.ArrayList;

public class Cabinet {
    /** Устройство кабинета */
    private Device cabinetDevice;

    /** Список сотрудников кабинета */
    private ArrayList<Employee> employeeList;

    /** Уникальный ИД кабинета */
    private String cabinetUniqueID;

    /**
     * @implNote Неплохо бы иметь проверку уникальности
     * @param cabinetID Уикальный ид кабинета
     */
    public Cabinet(String cabinetID) {
        cabinetUniqueID = cabinetID;
        employeeList    = new ArrayList<>();
    }

    /**
     * Установка устройства в кабинет
     * @param dev Устанавливаемое в кабинет устройство
     */
    public void setDevice(Device dev) {
        this.cabinetDevice = dev;
    }

    /**
     * Добавление сотрудника в кабинет
     * @param p объект сотрудника
     */
    public void addEmployee(Employee p) {
        employeeList.add(p);
    }

    /** Печать иныормации о кабинете на экран */
    public void printCabinetInfo() {
        System.out.println("Cabinet id: " + cabinetUniqueID +
                ".\nEmployee list: ");

        for(int end = employeeList.size(), i = 0; i < end; i++) {
            employeeList.get(i).printEmployeeInfo();
        }

        cabinetDevice.printDeviceInfo();
    }

}
