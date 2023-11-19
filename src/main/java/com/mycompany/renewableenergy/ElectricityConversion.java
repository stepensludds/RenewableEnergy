/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.renewableenergy;

/**
 *
 * @author steph
 */
public class ElectricityConversion {
    private double energyUsePm;
    private double energyRatePm;
    private final double renewableRatePKW;
    private double energyIntoRenew;
    private double switchSavings;

    public ElectricityConversion() {
        // Constructor for electricity calculations
        energyUsePm = 0;
        energyRatePm = 0;
        renewableRatePKW = 0.1;
        energyIntoRenew = 0;
        switchSavings = 0;
    }

    public void setEnergyUsePm(double energyUsePm) {
        this.energyUsePm = energyUsePm;
    }

    public void setEnergyRatePm(double energyRatePm) {
        this.energyRatePm = energyRatePm;
    }

    public void computeEnergyPrice() {
        energyIntoRenew = energyUsePm * renewableRatePKW;
        switchSavings = energyIntoRenew - energyRatePm;
    }

    public double computeSavings() {
        return switchSavings;
    }
}

