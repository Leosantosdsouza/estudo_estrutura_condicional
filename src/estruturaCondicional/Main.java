package estruturaCondicional;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horas;
		
		System.out.println("Que horas são?");
		horas = sc.nextInt();
		
		if (horas < 12) 
		{
			
			System.out.println( "Bom dia ");
		}
		
		else
		{
		
			System.out.println("Boa Tarde");
		}
		
		sc.close();

	}

}
