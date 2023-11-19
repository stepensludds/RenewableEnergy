package com.mycompany.renewableenergy;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author steph
 */
public class GasConversion {
    private double unitsM3;
    private double conversionFactor;
    private double unitPrice;
    private double gasUsed;
    private double gasGrossCost;
    private double standingCharge;
    private double carbonTax;
    private double vatPaid;
    private double totalGasBill;
    private double totalCharges;

    public GasConversion() {
        // Constructor for gas calculations
        unitsM3 = 264;
        conversionFactor = 11.2285;
        unitPrice = 0.04750;
        gasUsed = 0;
        gasGrossCost = 0;
        standingCharge = 0;
        carbonTax = 0;
        vatPaid = 0;
        totalGasBill = 0;
        totalCharges = 0;
    }

    public void setUnitsM3(double unitsM3) {
        this.unitsM3 = unitsM3;
    }

    public void setConversionFactor(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setStandingCharge(double standingCharge) {
        this.standingCharge = standingCharge;
    }

    public void setCarbonTax(double carbonTax) {
        this.carbonTax = carbonTax;
    }

    public void computeGasPrice() {
        gasUsed = unitsM3 * conversionFactor;
        gasGrossCost = gasUsed * unitPrice;
    }

    public void computeCharges() {
        totalCharges = (standingCharge + carbonTax + gasGrossCost);
        vatPaid = totalCharges * (13.5 / 100);
        totalGasBill = vatPaid + totalCharges;
    }

    public double computeGasBill() {
        return totalGasBill;
    }
}

