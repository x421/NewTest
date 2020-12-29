/**
 * Класс офиса. Содержит в себе
 * множество кабинетов
 * @author x421
 * @version 1.0
 */

package classes;

import java.util.ArrayList;

public class Office {
    /** Список всех кабинетов офиса */
    private ArrayList<Cabinet> officeCabinets;

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
        for(int end = officeCabinets.size(), i = 0; i < end; i++) {
            officeCabinets.get(i).printCabinetInfo();
        }
    }
}
