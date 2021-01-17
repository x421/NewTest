/**
 * Класс офиса. Содержит в себе
 * множество кабинетов
 * @author x421
 * @version 1.0
 */

package com.example.offices;

import com.example.cabinets.Cabinet;

import java.util.ArrayList;
import java.util.List;

public class Office {
    /** Список всех кабинетов офиса */
    final private List<Cabinet> officeCabinets;

    public Office() {
        officeCabinets = new ArrayList<Cabinet>();
    }

    /**
     * Добавление кабинета в офис
     * @param c Кабинет
     */
    public void addCabinet(Cabinet c) {
        officeCabinets.add(c);
    }

    /** Печать информации об оффисе на экран */
    public void printOfficeInfo() {
        officeCabinets.forEach(cab -> { cab.printCabinetInfo(); });
    }
}
