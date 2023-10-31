/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author conch
 */
public class TrashCar {
    private int trashNum;
    private int time;
    private double totalCost;

    public TrashCar(int trashNum, int time, double totalCost) {
        this.trashNum = trashNum;
        this.time = time;
        this.totalCost = totalCost;
    }

    public int getTrashNum() {
        return trashNum;
    }

    public void setTrashNum(int trashNum) {
        this.trashNum = trashNum;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
   
   

}