/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

public abstract class Subject {
    
    abstract void register(Observer observer);
    abstract void unregister(Observer observer);
    abstract void notifyObservers();
}
