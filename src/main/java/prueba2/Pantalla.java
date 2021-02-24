/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba2;

/**
 *
 * @author JOSAFAT
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Pantalla {

    public static void main(String[] args) {
        lamina mimarco = new lamina();
        mimarco.setVisible(true);
        
        
    }

   
}
class lamina extends JFrame{

    public lamina() {
     setTitle("Figuras Geometricas");
            setBounds(290, 150,650,650);
            setResizable(false);//para poder maximizar o minimizar la ventana
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          //setLayout(null);
            miboton milam= new miboton();
            add(milam);
    }
    
}
///////////////////////////////

 class miboton extends JPanel implements ActionListener{
JButton btnMostrar1= new JButton("Circulo");
        JButton btnMostrar2= new JButton("Rectangulo");
        JButton btnMostrar3= new JButton("Rombo");
        JButton btnMostrar4= new JButton("Triangulo");
        JButton btnMostrar5= new JButton("Cuadrado");
        
    public miboton() {
    
           
            setLayout(null);
           add(btnMostrar1);
           btnMostrar1.setBounds(30,50,100,30);
           btnMostrar1.addActionListener(this);
           //***********************************
           add(btnMostrar2);
           btnMostrar2.setBounds(160,50,100,30);
           btnMostrar2.addActionListener(this);
           //**************************************
           add(btnMostrar3);
           btnMostrar3.setBounds(270,50,100,30);
           btnMostrar3.addActionListener(this);
           //************************************
           add(btnMostrar4);
           btnMostrar4.setBounds(380,50,100,30);
           btnMostrar4.addActionListener(this);
           //************************************
           add(btnMostrar5);
           btnMostrar5.setBounds(500,50,100,30);
          btnMostrar5.addActionListener(this);
           //************************************
              
        }
    
      
        
       public void actionPerformed(ActionEvent e){
           
           if (e.getSource()==btnMostrar1){
               
          
             figuras.circulo(getGraphics(), 80, 100, 150, 150);
            // removeAll();
             //repaint(); 
               
           }
           else if(e.getSource()==btnMostrar2){
            
             figuras.rectangulo(getGraphics(), 380, 100, 220, 150);
            
           } 
           else if(e.getSource()==btnMostrar3){
              
               figuras.rombo(getGraphics());               
           } 
           else if(e.getSource()==btnMostrar4){
              
               figuras.triangulo(getGraphics());
             
           } else{
               
               figuras.Cuadrado(getGraphics(), 230, 425, 150, 150);
           }
                   
    }
     
 }
    
    ///////////////////////////
    
  
class figuras{
    
    public static  void circulo (Graphics g, int x, int y,  int x1, int x2){//metodo publico para el circulo usando el metodo grafico
        
         g.setColor(Color.blue);
        g.fillOval(x  , y, x1, x2);
       
    }
    
    public static  void rectangulo (Graphics g, int x, int y,  int x1, int x2){
        g.setColor(Color.red);
        g.fillRect(x  , y, x1, x2);
        
    
    }
    public static  void rombo (Graphics g){
        
        g.setColor(Color.black);
      
       int [] vx = {200, 300, 400, 300};
        int [] vy = {300, 200, 300, 400};
       
       g.fillPolygon(vx, vy, 4);
       
    }
    
    public static void triangulo (Graphics g){
       
        g.setColor(Color.GREEN);
        int [] vx = {500,550,450};
        int [] vy = {270,350,350};
       g.fillPolygon(vx, vy, 3);
    }
    
     public static  void Cuadrado (Graphics g, int x, int y,  int x1, int x2){
       
        g.setColor(Color.pink);
       g.fillRect(x, y, x1, x2);
       
    }
}


