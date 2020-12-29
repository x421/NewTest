/**
 * Класс сканера
 * @author x421
 * @version 1.0
 */

package classes;

import abstracts.Device;

public class Scanner extends Device {
    public Scanner(String name, String id) {
        super(name, id);
    }

    @Override
    public void work() {
        System.out.println("Scanner scans");
    }
}
