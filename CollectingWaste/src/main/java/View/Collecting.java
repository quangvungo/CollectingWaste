/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Controller.DumpTrash;
import Model.TrashCar;
import java.util.Scanner;

/**
 *
 * @author conch
 */
public class Collecting {
        public void collectGarbageData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of garbage at each station (in kg):");
        String input = scanner.nextLine();
        String[] garbageData = input.split(" ");
        int[] intGarbageData = new int[garbageData.length];
        for (int i = 0; i < garbageData.length; i++) {
            intGarbageData[i] = Integer.parseInt(garbageData[i]);
        }
        DumpTrash dump = new DumpTrash();
        System.out.println("The total cost is " +  dump.processTrash(intGarbageData) + " VND");
    }
}
