/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Student
 */
public class GreetingsGUI extends JFrame {
    
    //panels
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel nameAndSurnamePnl;
    private JPanel greetingsAreaPnl;
    private JPanel btnsPnl;
    private JPanel mainPnl;
    private JPanel headingPnl;
    
    
    //labels
    private JLabel headingLbl;
    private JLabel nameLbl;
    private JLabel surnameLbl;
    
    //textfields
    private JTextField nameTxtField;
    private JTextField surnameTxtField;
    
    
    //textarea
    private JTextArea greetingsTxtArea;
    
    //buttons 
    private JButton greetingBtn;
    private JButton clearBtn;
    private JButton exitBtn;
    
    public GreetingsGUI() {
        //
        setLayout(new BorderLayout());
        setTitle("Greetings UI");
        setSize(700, 750);
        setBackground(Color.YELLOW);
        
        //create the panels
        namePnl = new JPanel(new FlowLayout());
        surnamePnl = new JPanel(new FlowLayout());
        nameAndSurnamePnl = new JPanel(new GridLayout(2,1));
        greetingsAreaPnl = new JPanel(new FlowLayout());
        greetingsAreaPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK, 1), "Greetings"));
        
        btnsPnl = new JPanel(new FlowLayout());
        mainPnl = new JPanel(new BorderLayout());
        
        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        headingPnl.setBorder(new BevelBorder(BevelBorder.RAISED));
        
        //create the labels
        headingLbl = new JLabel("Greetings App");
        nameLbl = new JLabel("Name: ");
        surnameLbl = new JLabel("Surname: ");
        
        //create the text fields
        nameTxtField = new JTextField(20);
        surnameTxtField = new JTextField(20);
        
        //create the text area
        greetingsTxtArea = new JTextArea(40, 40);
        greetingsTxtArea.setEditable(false);
        greetingsTxtArea.setText("Hello [name] [surname]");
       
        
        //create buttons
        greetingBtn = new JButton("Greet");
        clearBtn = new JButton("Clear");
        exitBtn = new JButton("Exit");
        
        namePnl.add(nameLbl);
        namePnl.add(nameTxtField);
        
        surnamePnl.add(surnameLbl);
        surnamePnl.add(surnameTxtField);
        
        nameAndSurnamePnl.add(namePnl);
        nameAndSurnamePnl.add(surnamePnl);
        
        greetingsAreaPnl.add(greetingsTxtArea);
        
        btnsPnl.add(greetingBtn);
        btnsPnl.add(clearBtn);
        btnsPnl.add(exitBtn);
        
        mainPnl.add(nameAndSurnamePnl, BorderLayout.NORTH);
        mainPnl.add(greetingsAreaPnl, BorderLayout.CENTER);
        mainPnl.add(btnsPnl, BorderLayout.SOUTH);
        
        add(headingPnl, BorderLayout.NORTH);
        add(mainPnl, BorderLayout.CENTER);
        setVisible(true); 
    }
}
