/**
 * Базовый класс для устроства из кабинета.
 * @author x421
 * @version 1.0
 */

package com.example.devices;

public abstract class Device {
    /** Текущее состояние устройства */
    protected DeviceStatus deviceCurrentStatus;

    /** Наименование устройства */
    protected String deviceName;

    /** Уникальный ИД устройства */
    protected String deviceUniqueID;

    /**
     * Набор возможных статусов устройства
     * @implNote При добавлении новых значений следует пересмотреть метод changeDeviceStatus
     */
    public enum DeviceStatus {
        OFF,
        ON
    }

    /**
     * @implNote Неплохо бы иметь проверку уникальности
     * @param name Название устройства
     * @param id Уникальный идентификатор устройства
     */
    public Device(String name, String id) {
        deviceUniqueID      = id;
        deviceName          = name;
        deviceCurrentStatus = DeviceStatus.OFF;
    }

    /** Метод, реализуемый устройством */
    public abstract void work();

    /**
     * Изменение состояния устройства.
     * @implNote Поддерживает только два статуса: вкл/выкл
     */
    public void changeDeviceStatus() {
        deviceCurrentStatus = (deviceCurrentStatus == DeviceStatus.OFF) ? DeviceStatus.ON : DeviceStatus.OFF;
    }

    /** Печать информации об устройстве на экран */
    public void printDeviceInfo() {
        System.out.println("Device name: " + deviceName + " id: " + deviceUniqueID + " status: " +
                ((deviceCurrentStatus == DeviceStatus.OFF) ? "not working" : "working"));
    }
}
