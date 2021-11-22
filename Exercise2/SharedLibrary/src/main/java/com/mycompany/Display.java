/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

public class Display extends Observer {

    public void displayText(String text) {
        // Displays some text on the screen.
        GUI.setDisplay(text);
    }

    @Override
    public void update(String productText) {
        this.displayText(productText);
        
    }
}
