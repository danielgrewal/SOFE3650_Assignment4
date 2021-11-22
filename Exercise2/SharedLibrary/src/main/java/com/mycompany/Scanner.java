/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

public class Scanner {

    CashRegister cashRegister;

    public Scanner(CashRegister cashRegister) {
        this.cashRegister = cashRegister;
    }
    
    public void scannedUPCCode(String UPCCode) {
        // Captures the UPC code read by the scanner.
        this.cashRegister.setCurrentProductUPC(UPCCode);
    }
    
}
