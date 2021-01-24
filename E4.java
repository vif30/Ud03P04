import java.util.Scanner;
public class e4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Dime el primer numero");
		double n1 = sc.nextDouble();
		System.out.println("Dime la operación");
		char operacion = sc.next().charAt(0);
		System.out.println("Dime el segundo numero");
		double n2 = sc.nextDouble();
		double resultado;
		while (n1 != 0){
			if (operacion=='+') {
				resultado=n1 + n2;
				System.out.println("El resultado de su operacion es " + resultado);
				n1=0;
			}
			else if (operacion=='-') {
				resultado=n1 - n2;
				System.out.println("El resultado de su operacion es " + resultado);
				n1=0;
			}
			else if (operacion=='*') {
				resultado=n1 * n2;
				System.out.println("El resultado de su operacion es " + resultado);
				n1=0;
			}
			else if (operacion=='/') {
				resultado=n1 / n2;
				System.out.println("El resultado de su operacion es " + resultado);
				n1=0;
			}
			else
			{System.out.println("El operador es incorrecto");
			n1=0;
			}
		}
	}
}

    