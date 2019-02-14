package Calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame implements ActionListener {
	
	JPanel fondo = (JPanel) this.getContentPane();
	
	//Campos de texto
	
	JTextField aplicacion = new JTextField();
	
	
	//Botones
	
	JButton boton_uno = new JButton("1");
	JButton boton_dos = new JButton("2");
	JButton boton_tres = new JButton("3");
	JButton boton_cuatro = new JButton("4");
	JButton boton_cinco = new JButton("5");
	JButton boton_seis = new JButton("6");
	JButton boton_siete = new JButton("7");
	JButton boton_ocho = new JButton("8");
	JButton boton_nueve = new JButton("9");
	JButton suma = new JButton("+");
	JButton resta = new JButton("-");
	JButton multi = new JButton("x");
	JButton divi = new JButton("/");
	JButton borrar = new JButton("Borrar");
	JButton igual = new JButton("=");
	JButton cero = new JButton("0");
	JButton punto = new JButton(".");
	
	public Calculadora() 
	{
		//Tamaño y titulo
		fondo.setLayout(null);
		setSize(350,400);
		setTitle("Claculadora");
		setVisible(true);
		
		//campo de texto
		aplicacion.setBounds(22, 10, 290, 50);
		aplicacion.setFont(new Font("tahoma", Font.BOLD, 25));
		add(aplicacion);
		
		
		//Botones
		boton_uno.setBounds(22,65, 50, 50);
		add(boton_uno);
		boton_uno.addActionListener(this);
		boton_dos.setBounds(80,65, 50, 50);
		add(boton_dos);
		boton_dos.addActionListener(this);
		boton_tres.setBounds(138,65, 50, 50);
		add(boton_tres);
		boton_tres.addActionListener(this);
		borrar.setBounds(196, 65, 108, 50);
		add(borrar);
		borrar.addActionListener(this);
		boton_cuatro.setBounds(22,130, 50, 50);
		add(boton_cuatro);
		boton_cuatro.addActionListener(this);
		boton_cinco.setBounds(80,130, 50, 50);
		add(boton_cinco);
		boton_cinco.addActionListener(this);
		boton_seis.setBounds(138,130, 50, 50);
		add(boton_seis);
		boton_seis.addActionListener(this);
		divi.setBounds(196, 130, 50, 50);
		add(divi);
		divi.addActionListener(this);
		resta.setBounds(254, 130, 50, 50);
		add(resta);
		resta.addActionListener(this);
		boton_siete.setBounds(22,195, 50, 50);
		add(boton_siete);
		boton_siete.addActionListener(this);
		boton_ocho.setBounds(80,195, 50, 50);
		add(boton_ocho);
		boton_ocho.addActionListener(this);
		boton_nueve.setBounds(138,195, 50, 50);
		add(boton_nueve);
		boton_nueve.addActionListener(this);
		multi.setBounds(196, 195, 50, 50);
		add(multi);
		multi.addActionListener(this);
		suma.setBounds(254, 195, 50, 50);
		add(suma);
		suma.addActionListener(this);
		igual.setBounds(196, 260, 108, 50);
		add(igual);
		igual.addActionListener(this);
		cero.setBounds(80, 260, 50, 50);
		add(cero);
		cero.addActionListener(this);
		punto.setBounds(138, 260, 50, 50);
		add(punto);
		punto.addActionListener(this);
		
		
		
		
	}
	
	
	

	public static void main(String[] args) {
		new Calculadora();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==boton_uno)
		{
			if(aplicacion.getText()== "")
			{
				aplicacion.setText("1");
			}
			else
			{
				aplicacion.setText(aplicacion.getText() + "1");
			}
			
			
		}
		
		if(e.getSource()==boton_dos)
		{
			if(aplicacion.getText()== "")
			{
				aplicacion.setText("2");
			}
			else
			{
				aplicacion.setText(aplicacion.getText() + "2");
			}
			
			
		}
		
		if(e.getSource()==boton_tres)
		{
			if(aplicacion.getText()== "")
			{
				aplicacion.setText("3");
			}
			else
			{
				aplicacion.setText(aplicacion.getText() + "3");
			}
			
			
		}
		
		if(e.getSource()==boton_cuatro)
		{
			if(aplicacion.getText()== "")
			{
				aplicacion.setText("4");
			}
			else
			{
				aplicacion.setText(aplicacion.getText() + "4");
			}
			
			
		}
		
		if(e.getSource()==boton_cinco)
		{
			if(aplicacion.getText()== "")
			{
				aplicacion.setText("5");
			}
			else
			{
				aplicacion.setText(aplicacion.getText() + "5");
			}
			
			
		}
		
		if(e.getSource()==boton_seis)
		{
			if(aplicacion.getText()== "")
			{
				aplicacion.setText("6");
			}
			else
			{
				aplicacion.setText(aplicacion.getText() + "6");
			}
			
			
		}
		
		if(e.getSource()==boton_siete)
		{
			if(aplicacion.getText()== "")
			{
				aplicacion.setText("7");
			}
			else
			{
				aplicacion.setText(aplicacion.getText() + "7");
			}
			
			
		}
		
		if(e.getSource()==boton_ocho)
		{
			if(aplicacion.getText()== "")
			{
				aplicacion.setText("8");
			}
			else
			{
				aplicacion.setText(aplicacion.getText() + "8");
			}
			
			
		}
		
		if(e.getSource()==boton_nueve)
		{
			if(aplicacion.getText()== "")
			{
				aplicacion.setText("9");
			}
			else
			{
				aplicacion.setText(aplicacion.getText() + "9");
			}
			
			
		}
		
		if(e.getSource()==cero)
		{

			
			if(aplicacion.getText()== "")
			{
				aplicacion.setText("0");
				
			}else
			{
				aplicacion.setText(aplicacion.getText()+"0");
			}
			
			
		}
		
		if(e.getSource()==suma)
		{
			if(aplicacion.getText()== "")
			{
				aplicacion.setText("+");
			}
			else
			{
				aplicacion.setText(aplicacion.getText() + "+");
			}
			
			
		}
		
		if(e.getSource()==resta)
		{
			if(aplicacion.getText()== "")
			{
				aplicacion.setText("-");
			}
			else
			{
				aplicacion.setText(aplicacion.getText() + "-");
			}
			
			
		}
		
		if(e.getSource()==multi)
		{
			if(aplicacion.getText()== "")
			{
				aplicacion.setText("*");
			}
			else
			{
				aplicacion.setText(aplicacion.getText() + "*");
			}
			
			
		}
		
		if(e.getSource()==divi)
		{
			if(aplicacion.getText()== "")
			{
				aplicacion.setText("/");
			}
			else
			{
				aplicacion.setText(aplicacion.getText() + "/");
			}
			
			
		}
		
		if(e.getSource()==punto)
		{
			if(aplicacion.getText()== "")
			{
				aplicacion.setText(".");
			}
			else
			{
				aplicacion.setText(aplicacion.getText() + ".");
			}
			
			
		}
		
		if(e.getSource()== borrar)
		{
			if(aplicacion.getText()!= "")
			{
				aplicacion.setText("");
			}
		}
		

		
		
		if(e.getSource() == igual)
		{
			
			String cadena = aplicacion.getText();
			
			
			for(int i = 0; i< cadena.length(); i++)
			{
				char caracter = cadena.charAt(i);
				
				if(caracter == '+')
				{
					String antes = cadena.substring(0,i);
					String despues = cadena.substring(i+1, cadena.length());
					
					double resultado = Double.parseDouble(antes) + Double.parseDouble(despues);
					aplicacion.setText(Double.toString(resultado));
					
				}
				
				if(caracter == '-')
				{
					String antes = cadena.substring(0,i);
					String despues = cadena.substring(i+1, cadena.length());
					
					double resultado = Double.parseDouble(antes) - Double.parseDouble(despues);
					aplicacion.setText(Double.toString(resultado));
					
				}
				
				if(caracter == '*')
				{
					String antes = cadena.substring(0,i);
					String despues = cadena.substring(i+1, cadena.length());
					
					double resultado = Double.parseDouble(antes) * Double.parseDouble(despues);
					aplicacion.setText(Double.toString(resultado));
					
				}
				
				if(caracter == '/')
				{
					String antes = cadena.substring(0,i);
					String despues = cadena.substring(i+1, cadena.length());
					
					double error = Double.parseDouble(despues);
					
					if(error == 0)
					{
						aplicacion.setText("MATH ERROR");
					}
					else
					{
					
						double resultado = Double.parseDouble(antes) / Double.parseDouble(despues);
						aplicacion.setText(Double.toString(resultado));
					}
				}
				
			}
			
		}
		
		
		
	}

	


}
