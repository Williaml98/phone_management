/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author William
 */
public class Phones {
    private int phoneId;
    private String phoneBrand;
    private String phoneModel;
    private String phoneStorage;
    private double phonePrice;
    private String phoneColor;
    private String phoneStatus;

    public Phones() {
    }

    public Phones(int phoneId, String phoneBrand, String phoneModel, String phoneStorage, double phonePrice, String phoneColor, String phoneStatus) {
        this.phoneId = phoneId;
        this.phoneBrand = phoneBrand;
        this.phoneModel = phoneModel;
        this.phoneStorage = phoneStorage;
        this.phonePrice = phonePrice;
        this.phoneColor = phoneColor;
        this.phoneStatus = phoneStatus;
    }

    public int getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(int phoneId) {
        this.phoneId = phoneId;
    }

    public String getPhoneBrand() {
        return phoneBrand;
    }

    public void setPhoneBrand(String phoneBrand) {
        this.phoneBrand = phoneBrand;
    }

    public String getPhoneModel() {
        return phoneModel;
    }

    public void setPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel;
    }

    public String getPhoneStorage() {
        return phoneStorage;
    }

    public void setPhoneStorage(String phoneStorage) {
        this.phoneStorage = phoneStorage;
    }

    public double getPhonePrice() {
        return phonePrice;
    }

    public void setPhonePrice(double phonePrice) {
        this.phonePrice = phonePrice;
    }

    public String getPhoneColor() {
        return phoneColor;
    }

    public void setPhoneColor(String phoneColor) {
        this.phoneColor = phoneColor;
    }

    public String getPhoneStatus() {
        return phoneStatus;
    }

    public void setPhoneStatus(String phoneStatus) {
        this.phoneStatus = phoneStatus;
    }
   
}
