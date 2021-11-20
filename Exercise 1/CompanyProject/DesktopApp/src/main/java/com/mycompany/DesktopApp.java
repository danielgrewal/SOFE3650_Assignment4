/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;


import java.awt.*;
import javax.swing.*;

/**
 *
 * @author allod
 */
public class DesktopApp extends JFrame {
    
    static String appName = CommonUtility.getAppName();
    
    public DesktopApp() throws HeadlessException {
        super(appName);
        init();
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DesktopApp().setVisible(true);
            }
        });
    }

    private void init() {
        setLayout(new FlowLayout());
        add(new JLabel("Welcome to " + appName));
        setSize(640, 480);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}
