/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

import java.util.ArrayList;

// Model
public class CashRegister extends Subject {

    private Product product;
    private ArrayList<Observer> observers;
    private ProductDB productDB;

    public CashRegister() {
        this.productDB = new ProductDB();
        this.observers = new ArrayList<Observer>();
    }

    public void setCurrentProductUPC(String UPCCode) {
        // Sets the UPC code for the current scanned product.  
        this.product = productDB.getProductInfo(UPCCode);
        this.notifyObservers();
    }

    public Product getCurrentProductInfo() {
        // Gets the product information for the latest scanned product.
        return this.product;
    }

    @Override
    void register(Observer observer) {
        observers.add(observer);
        
    }

    @Override
    void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(getCurrentProductInfo().name + " $" + getCurrentProductInfo().price);
        }
    }
}
