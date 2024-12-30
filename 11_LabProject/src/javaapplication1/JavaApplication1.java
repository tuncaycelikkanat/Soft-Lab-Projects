
package javaapplication1;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class JavaApplication1 {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Customer Order");
        frame.setSize(1000,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        //frame.setLayout(new BorderLayout());
        frame.setLayout(null);


        JLabel label1 = new JLabel("Customer Name: ");
        label1.setBounds(160,20,130,30);
        frame.add(label1);
    
        JTextField nameField = new JTextField();
        nameField.setBounds(270,20,130,30);
        frame.add(nameField);
        
        JLabel label2 = new JLabel("Product: ");
        label2.setBounds(450, 20, 130,30);
        frame.add(label2);
        
        String[] products = {"A", "B", "C"};
        JComboBox<String> comboBox = new JComboBox<>(products);
        comboBox.setBounds(510, 20, 130, 30);
        frame.add(comboBox);
        
        JLabel label3 = new JLabel("Quantity: ");
        label3.setBounds(690,20, 130, 30);
        frame.add(label3);
        
        JTextField quantityField = new JTextField();
        quantityField.setBounds(750, 20, 130, 30);
        frame.add(quantityField);
        
        
        DefaultTableModel model = new DefaultTableModel(new String[]{"Customer Name", "Product", "Quantity"},0);
        JTable table = new JTable(model);
        JScrollPane jScrollPane = new JScrollPane(table);
        jScrollPane.setBounds(20, 60, 950, 500);
        frame.add(jScrollPane);
        
        JButton addButton = new JButton("Add");
        addButton.setBounds(360, 575, 130, 30);
        frame.add(addButton);
        
        JButton deleteButton = new JButton("Delete");
        deleteButton.setBounds(510, 575, 130, 30);
        frame.add(deleteButton);
        
        addButton.addActionListener(e->{
            
            
            if (nameField.getText().isEmpty() || quantityField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(frame,"Fill the gaps!","Error",JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            int quantity;
            
            try {
                quantity = Integer.parseInt(quantityField.getText());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame,"Enter an int value!","Error",JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            model.addRow(new Object[]{nameField.getText(), comboBox.getSelectedItem(), quantity});
            
            nameField.setText("");
            quantityField.setText("");
            comboBox.setSelectedIndex(0);
            
            
        });
        
        deleteButton.addActionListener(e->{
            
            int selectedRow = table.getSelectedRow();
            
            if (selectedRow != -1) {
                
                model.removeRow(selectedRow);
                
            } else {
                JOptionPane.showMessageDialog(frame,"Select a row!","Error",JOptionPane.ERROR_MESSAGE);
            }
            
        });
        
        
        frame.setVisible(true);

    }
    
}
