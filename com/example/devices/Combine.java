/**
 * Класс комбайна
 * @author x421
 * @version 1.0
 */

package com.example.devices;

import com.example.devices.Device;

public class Combine extends Device {
    public Combine(String name, String id) {
        super(name, id);
    }

    @Override
    public void work() {
        System.out.println("Combine prints");
    }

}