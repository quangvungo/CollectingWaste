/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.TrashCar;
import java.util.Scanner;

/**
 *
 * @author conch
 */
public class DumpTrash {
    public double processTrash(int[] garbageData) {
        int truckCapacity = 10000; // 10 tons in kg
        int dumpCost = 57000; // VND
        int costPerMinute = 2000; // 120,000 VND per hour
        TrashCar car = new TrashCar(0,0,0);
        for (int stationGarbage : garbageData) {
            if ((car.getTrashNum()+ stationGarbage) >= truckCapacity) {
                car.setTotalCost(car.getTotalCost() + dumpCost);
                car.setTime(car.getTime()+ 38 ); 
                car.setTrashNum(stationGarbage);
            } else {
                car.setTime(car.getTime()+ 8 );
                car.setTrashNum(car.getTrashNum() + stationGarbage);
            }
       }        
        return (car.getTotalCost() + ((car.getTime()+30) * costPerMinute)+ dumpCost);
    }
}
