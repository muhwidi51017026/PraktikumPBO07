/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak02;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.FlowLayout;

public class Prak02 extends JFrame{
    
    public Prak02() {
        
        FlowLayout flowlayout = new FlowLayout(FlowLayout.CENTER,5,10);
        
        Container container = getContentPane();
        
        container.setLayout(flowlayout);
        
        container.add(new JButton("Tombol 1"));
        container.add(new JButton("Tombol 2"));
        container.add(new JButton("Tombol 3"));
        container.add(new JButton("Tombol 4"));
        container.add(new JButton("Tombol 5"));
        
    }
        public static void main(String[] args) {
        Prak02 jendela = new Prak02 ();
    jendela.setTitle("kelas DemoFlowLayout");
    jendela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jendela.setSize(390,120);
    jendela.setVisible(true);
    }
    }
        
