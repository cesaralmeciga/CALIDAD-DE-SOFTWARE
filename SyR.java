package calc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SyR {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1. Para realiazar una suma \n 2. Para realizar una resta \n 3. para salir");
		int caso = 0;
		double numero;
		double numero2;
		double resultado;
	while (caso != 3) {
		caso = Integer.parseInt(br.readLine());
		
		if (caso != 3 && caso != 2 && caso != 1) 
		{
			System.out.println("Número incorrecto, vuelva a ingresar un número :");
			caso = Integer.parseInt(br.readLine());
		}
		
		
		
		if (caso == 1) 
		{
			System.out.println("Suma:");
			System.out.println("ingrese los números a operar: ");
			numero = Double.parseDouble(br.readLine());
			numero2 = Double.parseDouble(br.readLine());
			resultado = numero + numero2;
			
			System.out.println("El resultado de la suma es: " + resultado);
		}
		
		if (caso == 2) 
		{
			System.out.println("Resta: ");
			System.out.println("Ingrese los números a operar: ");
			numero = Double.parseDouble(br.readLine());
			numero2 = Double.parseDouble(br.readLine());
			resultado = numero - numero2;
			System.out.println("El resultado de la resta es: " + resultado);
			
		}
		
		if (caso == 3) 
		{
			System.out.println("APAGADO");
		}
	}

	}

}
