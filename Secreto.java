import java.util.Scanner;
public class Secreto {

	public static void main(String[] args) {
					int intento =-1;
					int contador = 0;
					int numeroSecreto = (int) (Math.random()*100+1);
					System.out.println("Intenta adivinar un número aleatorio entre el 1 y 100." );
					
					while (intento != numeroSecreto ) {
						System.out.print("Introduce el número que creas posible: ");
						Scanner scanner = new Scanner(System.in);
								intento = scanner.nextInt();
					
					
					if (intento > numeroSecreto)
						System.out.println("El número que buscas es MENOR.");
					
					else if (intento < numeroSecreto)
						System.out.println("El número que buscas es MAYOR. ");
				contador++;		
					}
				
					
					System.out.print("¡CORRECTO! "+ numeroSecreto + " era el número que estabas buscando, has necesitado " + contador +" intentos.");
				


		}

	}

