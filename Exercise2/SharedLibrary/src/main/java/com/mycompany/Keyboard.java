/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

public class Keyboard {
    
    CashRegister cashRegister;

    public Keyboard(CashRegister cashRegister) {
        this.cashRegister = cashRegister;
    }

    public void setUPCCode(String UPCCode) {
        // Saves the UPC code entered by cashier
        this.cashRegister.setCurrentProductUPC(UPCCode);
    }
}
