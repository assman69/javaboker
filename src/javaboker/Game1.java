/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaboker;

import javax.swing.*;
import java.awt.BorderLayout;
import java.util.Scanner;
import java.awt.FlowLayout;

     class Game1 extends JFrame
   //http://www.java2s.com/Tutorial/Java/0240__Swing/AddIcontoJLabel.htm
 {
  public void gui(int asd, int asd2, int asd3, int asd4, int asd5) {
    JFrame.setDefaultLookAndFeelDecorated(true);
    JFrame frame = new JFrame();
    frame.setTitle("JLabel Test");
    frame.setLayout(new FlowLayout());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    
    ImageIcon imageIcon = new ImageIcon("C:\\Users\\santeri\\Documents\\NetBeansProjects\\javaboker\\src\\javaboker\\Kortit\\"+asd+".jpg");
    JLabel label = new JLabel(imageIcon);
    ImageIcon imageIcon2 = new ImageIcon("C:\\Users\\santeri\\Documents\\NetBeansProjects\\javaboker\\src\\javaboker\\Kortit\\"+asd2+".jpg");
    JLabel label2 = new JLabel(imageIcon2);
    ImageIcon imageIcon3 = new ImageIcon("C:\\Users\\santeri\\Documents\\NetBeansProjects\\javaboker\\src\\javaboker\\Kortit\\"+asd3+".jpg");
    JLabel label3 = new JLabel(imageIcon3);
    ImageIcon imageIcon4 = new ImageIcon("C:\\Users\\santeri\\Documents\\NetBeansProjects\\javaboker\\src\\javaboker\\Kortit\\"+asd4+".jpg");
    JLabel label4 = new JLabel(imageIcon4);
    ImageIcon imageIcon5 = new ImageIcon("C:\\Users\\santeri\\Documents\\NetBeansProjects\\javaboker\\src\\javaboker\\Kortit\\"+asd5+".jpg");
    JLabel label5 = new JLabel(imageIcon5);

    frame.add(label);
     frame.add(label2);
     frame.add(label3);
     frame.add(label4);
     frame.add(label5);
     
    frame.pack();
    frame.setVisible(true);
  }
}
	
        
        //jframe konstruktori
             
             
        //i swear to god tämä toimi viä pari h sitte
             
//       public  Game1()
//      {
//         // setSize(1000, 750);  <---- do not do it
//         // setResizable(false); <----- do not do it either, unless any good reason
//         
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setTitle("asdasdasd");
//
//         ImageIcon image = new ImageIcon("D:\\santeri\\downsloadss\\Kortit\\"+1+".jpg");// <<<<----- array tähän
//         JLabel label = new JLabel(image);
//         JScrollPane scrollPane = new JScrollPane(label);
//         scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//         scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
//         add(scrollPane, BorderLayout.CENTER);
//         pack();
//        
//      }}
//huonu yritys saada käyttöliittymää toimimaan , nullpointer1
//       public String Numerot()
//        {
//            final String s = hand[0].suit + "_"+hand[0].rank;
//           return s;
//        }
//
//      }
//    