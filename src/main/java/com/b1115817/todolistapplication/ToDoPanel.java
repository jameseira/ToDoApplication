package com.b1115817.todolistapplication;

import java.awt.*;
import javax.swing.*;
/**
 *
 * @author james
 */
public class ToDoPanel extends JPanel{
    public ToDoPanel(){
        JLabel title = new JLabel("Title:");
        JTextField enterTitle = new JTextField();
        enterTitle.setPreferredSize(new Dimension(100, 20));
        add(title);
        add(enterTitle);
    }
}
