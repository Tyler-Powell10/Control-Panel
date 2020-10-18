/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlpanel;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import static jdk.nashorn.internal.objects.NativeRegExp.source;

/**
 * create a control panel that responds to user input 
 * @author tylerpowell
 */
public class ControlPanel extends JFrame {
        
    
        private ImageIcon lockIcon;
        // create buttons
        
        
        private JButton air = new JButton("Airplane Mode");
        private JButton wifi = new JButton("Wifi");
        private JButton blue = new JButton("Bluetooth");
        private JButton cell = new JButton("Cellular");
        private JButton lock = new JButton("Orientation Lock");
        
        
        
        
       // ADD A SLIDER
        
      
      
      
        
        
    public ControlPanel(){
        
        
        // create panel and add buttons to it
        
         
        
        JPanel panel = new JPanel();
        panel.add(cell);
        panel.add(air);
        panel.add(wifi);
        panel.add(blue);
        panel.add(lock);
        
        
        add(panel);
    
        //add panel to frame 
      
        
       
        
        
        // tell buttons that they should call methods when they get clicked
        // --- register listeners ( which implements listener methods )
        CellListener cl = new CellListener();
        AirListener ar = new AirListener();
        WifiListener wfi = new WifiListener();
        BlueListener blu = new BlueListener();
        LockListener lck = new LockListener();
        // code to interfaces 
        // telling buttons which method to call when clicked 
        // by giving them a class that implemenets the action listener interface
        cell.addMouseListener(cl);
        air.addMouseListener(ar);
        wifi.addMouseListener(wfi);
        blue.addMouseListener(blu);
        lock.addMouseListener(lck);
        
        // add icons
        
        
        
        
        
        
        
    } // close control panel contructors
        
    public static void main(String[] args) {
        JFrame frame = new ControlPanel();
        frame.setSize(250, 350);
        frame.setTitle("Control Panel");
        frame.setLocation(250, 450);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
         
        
    } // end main
    
    // create action listeners
    
    class AirListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            air.setForeground(Color.orange);
            cell.setForeground(Color.BLACK);
        }

        @Override
        public void mousePressed(MouseEvent e) {
           air.setForeground(Color.orange);
           cell.setForeground(Color.BLACK);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            
        }

        @Override
        public void mouseExited(MouseEvent e) {
            
        }

       
        
    } // close air action listener
    
     class WifiListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
           wifi.setForeground(Color.BLUE);
        }

        @Override
        public void mousePressed(MouseEvent e) {
           wifi.setForeground(Color.BLUE);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            
        }

        @Override
        public void mouseExited(MouseEvent e) {
            
        }

      
        
        
    } // close wifi action listener
     
      class BlueListener implements MouseListener {


        @Override
        public void mouseClicked(MouseEvent e) {
            blue.setForeground(Color.BLUE);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            blue.setForeground(Color.BLUE);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
           
        }
        
    } // close blue action listener
      
       class LockListener implements MouseListener {


        @Override
        public void mouseClicked(MouseEvent e) {
          lock.setForeground(Color.red);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            lock.setForeground(Color.red);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
           
        }

        @Override
        public void mouseEntered(MouseEvent e) {
           
        }

        @Override
        public void mouseExited(MouseEvent e) {
            
        }
        
    } // close lock action listener
       
        class CellListener implements MouseListener {

        public void mouseCLicked (ActionEvent e) {
            
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            
            cell.setForeground(Color.GREEN);
            air.setForeground(Color.BLACK);
      
        }

        @Override
        public void mousePressed(MouseEvent e) {
        cell.setForeground(Color.GREEN);
       air.setForeground(Color.BLACK);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            
        }

        @Override
        public void mouseExited(MouseEvent e) {
            
        }
        
    } // close cell mouse listener
      
} // end public class
