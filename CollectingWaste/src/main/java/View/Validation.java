/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

/**
 *
 * @author conch
 */
public class Validation {
    
      public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            double value = Double.parseDouble(str);
            return value >= 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}