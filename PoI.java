import javax.swing.*;
import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PoI extends JFrame implements ActionListener {
	
	JPanel fondo = (JPanel) this.getContentPane();
	JTextField aplicacion = new JTextField();
	
	//botones 
	JButton igual = new JButton("=");
	JButton New_Number = new JButton("New");
	
	
	public PoI()
	{
		//opciones de pantalla
		fondo.setLayout(null);
		setSize(210,200);
		setTitle("Par o Impar?");
		setVisible(true);
		
		//campo de texto
		
		aplicacion.setBounds(22, 10, 150, 50);
		aplicacion.setFont(new Font("tahoma", Font.BOLD, 25));
		add(aplicacion);
		
		
		//Botones 
		igual.setBounds(70,100, 50, 50);
		add(igual);
		igual.addActionListener(this);
		New_Number.setBounds(130, 100, 60, 30);
		New_Number.setFont(new Font("tahoma", Font.BOLD, 10));
		add(New_Number);
		New_Number.addActionListener(this);
		
	}

	public static void main(String[] args) {
		new PoI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==igual)
		{
			String cadena = aplicacion.getText();
			double numero = Double.parseDouble(cadena);
			if (numero % 2 == 0)
			{
				aplicacion.setText("Es Par");
			}else
			{
				aplicacion.setText("Es Impar");
			}
			
			
		}
		
		if(e.getSource()==New_Number)
		{
			aplicacion.setText("");
		}
	}

}
