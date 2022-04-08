package com.b1115817.todolistapplication;

import java.awt.BorderLayout;
import javax.swing.*;
/**
 *
 * @author james
 */
public class Main extends JFrame{
    public static void main(String[] args){
        JFrame frame = new JFrame();
        
        ToDoPanel toDo = new ToDoPanel();
        
        frame.add(toDo, BorderLayout.WEST);
        
        frame.setTitle("To-do list");
        frame.setSize(900,600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
