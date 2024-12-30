/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg12_labproject;

import java.awt.BorderLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Oturum2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    private static double balance = 0;
    public static void main(String[] args) {
        
        /*
        JSpinner rentalDateSpinner = new JSpinner(new SpinnerDateModel());
        rentalDateSpinner.setEditor(new JSpinner.DateEditor(rentalDateSpinner,"MM/dd/yyy"));
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date rantelDate = (Date) rentalDateSpinner.getValue();
        String rentalDateStr = dateFormat.format(rantelDate);
        
        long diffInMilles = returnDate.getTime() - rantelDate.getTime();
        int rentalDays = (int) (diffInMilles / (1000 * 60 * 60 * 24));
        double totalCost = rentalDays * dailyRate;
        */
        
        JFrame frm = new JFrame();
        frm.setSize(1400,800);
        frm.setLocationRelativeTo(null);
        frm.setLayout(null);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel label1 = new JLabel("Customer Name: ");
        label1.setBounds(20, 20, 130, 30);
        frm.add(label1);
        
        JTextField nameField = new JTextField();
        nameField.setBounds(130,20,130,30);
        frm.add(nameField);
        
        JLabel label2 = new JLabel("Vehicle Type: ");
        label2.setBounds(300, 20, 130, 30);
        frm.add(label2);
        
        String[] types = {"SUV","Attack","Sedan"};
        JComboBox<String> box = new JComboBox<>(types);
        box.setBounds(390, 20, 75, 30);
        frm.add(box);
        
        JLabel label3 = new JLabel("Rental Date: ");
        label3.setBounds(500, 20, 130, 30);
        frm.add(label3);
        
        JSpinner rentalDateSpinner = new JSpinner(new SpinnerDateModel());
        rentalDateSpinner.setBounds(580, 20, 120, 30);
        rentalDateSpinner.setEditor(new JSpinner.DateEditor(rentalDateSpinner,"MM/dd/yyy"));
        frm.add(rentalDateSpinner);
        
        JLabel label4 = new JLabel("Return Date: ");
        label4.setBounds(730, 20, 130, 30);
        frm.add(label4);
        
        JSpinner returnDateSpinner = new JSpinner(new SpinnerDateModel());
        returnDateSpinner.setBounds(820, 20, 120, 30);
        returnDateSpinner.setEditor(new JSpinner.DateEditor(returnDateSpinner,"MM/dd/yyy"));
        frm.add(returnDateSpinner);
        
        JLabel label5 = new JLabel("Daily Rate: ");
        label5.setBounds(970, 20, 130, 30);
        frm.add(label5); 
        
        JTextField dailyRate = new JTextField();
        dailyRate.setBounds(1050, 20, 130, 30);
        frm.add(dailyRate);
                
        DefaultTableModel model = new DefaultTableModel(new String[]{"Customer Name","Vehicle Type","Rental Date","Return Date","Daily Rate","Total Cost"},0);
        JTable table = new JTable(model);
        JScrollPane scroll = new JScrollPane(table);
        scroll.setBounds(300, 70, 800, 500);
        frm.add(scroll);
        
        JButton addRental = new JButton("Add Rental");
        addRental.setBounds(450, 600, 130, 40);
        frm.add(addRental);

        JButton deleteRental = new JButton("Delete Rental");
        deleteRental.setBounds(650, 600, 130, 40);
        frm.add(deleteRental);
        
        JLabel label6 = new JLabel("Total Cost: 0$");
        label6.setBounds(100, 300, 130, 30);
        frm.add(label6);
        
        addRental.addActionListener(e->{
            if (nameField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(frm, "Please enter a name.","Error",JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if (dailyRate.getText().isEmpty()) {
                JOptionPane.showMessageDialog(frm, "Please enter a daily rate.","Error",JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
                
                Date rantelDate = (Date) rentalDateSpinner.getValue();
                String rentalDateStr = dateFormat.format(rantelDate);

                Date returnDate = (Date) returnDateSpinner.getValue();
                String returnDateStr = dateFormat.format(returnDate);
                
                if (returnDate.getTime() < rantelDate.getTime()) {
                    JOptionPane.showMessageDialog(frm, "Please check the dates.","Error",JOptionPane.ERROR_MESSAGE);
                    return;
                }

                var diffInMilles = returnDate.getTime() - rantelDate.getTime();               
                int rentalDays = (int) (diffInMilles / (1000 * 60 * 60 * 24) + 1);
                double totalCost = (rentalDays) * Double.parseDouble(dailyRate.getText()); 
                
                model.addRow(new Object[]{nameField.getText(),box.getSelectedItem(), rentalDateStr, returnDateStr,dailyRate.getText(),totalCost});
                
                balance += totalCost;
                label6.setText("Total Cost: " + (balance) + "$");
                //test
                JOptionPane.showMessageDialog(frm, rentalDateStr + "," + returnDateStr + ", " + totalCost);
            } catch (Exception ex) {
                    System.out.println(ex.getMessage());
            }
   
        });
        
        deleteRental.addActionListener(e->{
        
            int selectedRow = table.getSelectedRow();
            
            if (selectedRow != -1) {
                
                balance -= Double.parseDouble(model.getValueAt(selectedRow, 5).toString());
                label6.setText("Total Cost: " + (balance) + "$");
                
                model.removeRow(selectedRow);
            }
            
        });
        
        frm.setVisible(true);
    }
    
}
