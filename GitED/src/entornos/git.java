package entornos;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class git {
public static void main(String[] args) {
		
		marcotexto martxt=new marcotexto();
		martxt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class marcotexto extends JFrame{
	public marcotexto(){
		setVisible(true);
		setSize(500,400);
		setLocation(400,200);
		setTitle("Marco con texto");
		
		Lamina laminaMarco=new Lamina();// cramos una lamina para nuestro marco, porque sino no podremos poner nada en el
		add(laminaMarco); //añadimos la lamina al marco
		laminaMarco.setBackground(Color.blue); //establece un color de fondo al marco
	}
}

//todo lo que extiende de JPanel es una lamina
class Lamina extends JPanel {
	//metodo sobreescrito de JPanel
	public void paintComponent (Graphics g){
		super.paintComponent(g); // llamamos al metodo
		g.drawString("Prueba de lamina en color y escrito", 150, 100); // escribe o dibuja prueba y en las coordenadas indicadas
	}
}
