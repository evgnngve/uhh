package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SpringLayout sl = new SpringLayout();

        JFrame f = new JFrame();
        JTextField linkInput = new JTextField();
        linkInput.setBounds(50, 90, 250, 35);
        JButton getPhoto = new JButton("Get photo");
        getPhoto.setBounds(125,125, 100, 35);
        
        f.add(getPhoto);
        f.add(linkInput);
        f.setSize(350, 300);
        f.setLayout(null);
        f.setVisible(true);

    }

}
