package pkg10_labproject;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("To Do List");
        frame.setLayout(null);
        frame.setSize(600,800);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        
        JPanel addPanel = new JPanel();
        addPanel.setLayout(null);
        addPanel.setBounds(20,20,560,50);
        
        JButton addButton = new JButton("Add");
        addButton.setBounds(370,10,100,30);
        addPanel.add(addButton);
        
        JTextField addField = new JTextField();
        addField.setBounds(100,10,250,30);
        addPanel.add(addField);
        
        DefaultListModel model = new DefaultListModel();
        JList<String> list = new JList<>(model);
        list.setBounds(45, 80, 500, 600);
        
        JButton deleteButton = new JButton("Delete");
        deleteButton.setBounds(235, 700, 130, 30);
        deleteButton.setEnabled(false);           
        
        addButton.addActionListener(e->{
            
            String todoItem = addField.getText();
            
            if (todoItem.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Please enter a to-do item.");
                return;
            }
            
            model.addElement(todoItem);
            addField.setText("");
            
        });
        
        list.addListSelectionListener(e->{
            
            if (list.getSelectedIndex() == -1) {
                deleteButton.setEnabled(false);
            } else
                deleteButton.setEnabled(true);
            
        });
  
        deleteButton.addActionListener(e -> {
                           
            int selectedIndex = list.getSelectedIndex();                              
            model.remove(selectedIndex);
            
        });
        
        frame.add(deleteButton);
        frame.add(addPanel);
        frame.add(list);
        frame.setVisible(true);
    }
    
}
