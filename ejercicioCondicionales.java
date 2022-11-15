package ejercicio2;

public class ejercicioCondicionales {

	public static void main(String[] args) {
		
		//IF-ELSEIF
		 int numero = 0;
		 
		 if (numero > 0) {
			 System.out.println("Positivo");
		 
		 } else if (numero < 0) {
			 System.out.println("Negativo");
			 
		 } else if (numero == 0) {
			 System.out.println("Es cero");
		 }

		 //WHILE
		 int num = 1;
	
		 while (num < 3); {
		System.out.println(num);
		num = num + 1;
		 } 
		 
		 
		//DOWHILE
		 int number = 2;
	
		 do {
		System.out.println(number);
		number = number + 1;
} 
		 while (number < 3);
		 
		 //FOR
		 int numFor = 0;
		 for (numFor = 0; numFor <= 3; numFor++) {
		System.out.println(numFor);
		}
		 
		//SWITCH
		 var estacion = "otoño";
		 
		 switch (estacion) {
		 case "otoño": 
		System.out.println("es otoño");
		break;
		 }
		 switch (estacion) {
		 case "invierno":
		System.out.println("es invierno");
		break;
		
		 }
		 switch (estacion) {
		 case "primavera":
		System.out.println("es primavera");
		break;
		 }
		
		 switch (estacion) {
		 case "verano":
		System.out.println("es verano");
		break;
		
		 default:
		System.out.println("ninguna estacion"); 
		 }
		 }
		 }
		
		


