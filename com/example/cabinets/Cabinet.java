/**
 * Класс кабинета, включает в себя одно устройство
 * и множество сотрудников
 * @author x421
 * @version 1.0
 */

package com.example.cabinets;

import com.example.employees.Employee;
import com.example.devices.Device;

import java.util.ArrayList;
import java.util.List;

public class Cabinet {
    /** Устройство кабинета */
    private Device cabinetDevice;

    /** Список сотрудников кабинета */
    final private List<Employee> employeeList;

    /** Уникальный ИД кабинета */
    final private String cabinetUniqueID;

    /**
     * @implNote Неплохо бы иметь проверку уникальности
     * @param cabinetID Уикальный ид кабинета
     */
    public Cabinet(String cabinetID) {
        cabinetUniqueID = cabinetID;
        employeeList = new ArrayList<>();
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

        employeeList.forEach(emp -> { emp.printEmployeeInfo(); });

        try {
            cabinetDevice.printDeviceInfo();
        } catch (NullPointerException e){
            System.out.println("No device in cabinet!");
        }
    }

}
