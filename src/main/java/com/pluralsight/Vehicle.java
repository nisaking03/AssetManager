package com.pluralsight;

import java.time.LocalDate;

public class Vehicle extends Asset{
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost,
                   String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }
    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }
    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        int currentYear = LocalDate.now().getYear();
        int vehicleAge = currentYear - this.year;
        double finalValue = 0.00;

        switch (vehicleAge) {
            case 1,2,3:
                finalValue = getOriginalCost() - (getOriginalCost()* 0.03);
                break;
            case 4,5,6:
                finalValue = getOriginalCost() - (getOriginalCost() * 0.06);
                break;
            case 7,8,9,10:
                finalValue = getOriginalCost() - (getOriginalCost() * 0.08);
                break;
            case 11:
                finalValue = getOriginalCost()-1000.00;
                break;
            default:finalValue = getOriginalCost();

        }if(getOdometer() <100_000  && !(makeModel.toLowerCase().contains("honda") ||  makeModel.toLowerCase().contains("toyota"))){
            finalValue = finalValue - (finalValue * 0.25);
            return finalValue;
        }else {
            return finalValue;
        }
    }
}
