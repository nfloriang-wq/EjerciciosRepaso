package Programas;
import java.util.Scanner;
import java.util.InputMismatchException;
public class EjerciciosRepaso {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        menu(sc);
    }

    static void menu(Scanner sc) {
        int opcion = 0;
        do {
            try {
            	System.out.println("========================================");
            	System.out.println("Parte #1 Ciclos y Operaciones Numericas");
            	System.out.println("========================================");
                System.out.println("1. Numeros divididos entre 4");
                System.out.println("2. Factoriales");
                System.out.println("3. Calculador de numeros");
                System.out.println("4. Caluclar promedio");
                System.out.println("5. Suma de los digitos");
                System.out.println("========================================");
                System.out.println("Parte #2 Condiciones y Divisiblidad");
                System.out.println("========================================");
                System.out.println("6. Multiplo de 7 o 11");
                System.out.println("7. Muestra de numeros del 1 al numero y div entre 3");
                System.out.println("8. leer horas en Formato 24 horas");
                System.out.println("========================================");
                System.out.println("Parte #3 Uso de Switch ");
                System.out.println("========================================");
                System.out.println("9. Convertir numeros a numeros Romanos");
                System.out.println("10. Opciones del 1 al 3 para calcular");
                System.out.println("========================================");
                System.out.println("Parte #4 Análisis Numerico");
                System.out.println("========================================");
                System.out.println("11. Mostar numero mayor y menor y la diferencia absoluta");
                System.out.println("12. Tabla de división del 1 - 10");
                System.out.println("13. Contar la cantidad de digitos de un numero");
                System.out.println("14. Determinar si un numero es triangular");
                System.out.println("15. Lector de numeros con promedio de numeros negativos");
                System.out.println("========================================");
                System.out.println("Parte #5 Patrones y Transformaciones");
                System.out.println("========================================");
                System.out.println("16. Numero con primeros multiplos de 6");
                System.out.println("17. Determinar si un numero es potencia de 2");
                System.out.println("18. Invertir numero");
                System.out.println("19. Suma de los numeros es par o impar");
                System.out.println("20. Temperatura en grados Celsius a Fahrenheit");
                System.out.println("21. Salir"); 
                System.out.print("Seleccione una opción (1 - 21): ");

                opcion = sc.nextInt();
                sc.nextLine(); 
            } catch (InputMismatchException e) {
                System.out.println("ERROR... Solo se permiten numeros, intente de nuevo");
                sc.nextLine(); 
                opcion = 0;
            }

            switch (opcion) {
                case 1:
                    NumerosDivENtreCuatro(sc);
                    break;
                case 2:
                    FactorialNum(sc);
                    break;
                case 3:
                    LectorCantidades(sc);
                    break;
                case 4:
                    CalcularPromedio(sc);
                    break;
                case 5:
                    SumaDigitos(sc);
                    break;
                case 6:
                	Multiplo(sc);
                case 7: 
                	MuestraNumeros(sc);
                	break;
                case 8:
                	Formato24horas(sc);
                	break;
                case 9:
                	ConvertirNumerosARomanos(sc);
                	break;
                case 10:
                	OpcionesCalcular(sc);
                	break;
                case 11: 
                	MayorMenorDiferenciaAbsoluta(sc);
                	break;
                case 12:
                	NumerosTablaDiv1Al10(sc);
                	break;
                case 13:
                	CantidadDigitosPares(sc);
                	break;
                case 14: 
                	DeterminarSiNumeroEsTriangular(sc);
                	break;
                case 15: 
                	PromedioNegativosSiHay(sc);
                	break;
                case 16: 
                	NumerosMultiplosDe6(sc);
                	break;
                case 17: 
                	NumeroPotenciaDE2(sc);
                	break;
                case 18: 
                	MostrarNumeroInvertido(sc);
                	break;
                case 19:
                	SumaDeNumerosParOImpar(sc);
                	break;
                case 20:
                	Temperatura(sc);
                	break;
                case 21:
                    System.out.println("Saliendo...");
                    break;
            }
        } while (opcion != 21); 
    }

    //===================================================
    //Parte #1 Ciclos y Operaciones numericas
    //===================================================
    static void NumerosDivENtreCuatro(Scanner sc) {
        int num = 0;
        int suma = 0;
        try {
            System.out.print("Ingrese un numero: ");
            num = sc.nextInt();
            sc.nextLine(); 
            for (int i = 1; i <= num; i++) {
                if (i % 4 == 0) suma += i;
            }
            System.out.println("La suma de los números divisibles entre 4 desde 1 hasta " + num + " es: " + suma);
        } catch (InputMismatchException e) {
            System.out.println("Error. debe ingresar un numero valido.");
            sc.nextLine();
        }
    }

    static void FactorialNum(Scanner sc) {
        try {
            System.out.print("Ingrese un numero y que nos sea negativo: ");
            int numero = sc.nextInt();
            sc.nextLine(); 
            if (numero < 0) {
                System.out.println("Error. No se pueden ingresar numeros negativos");
            } else {
                long resultado = obtenerfactorial(numero);
                System.out.println("EL factorial de " + numero + " es : " + resultado);
            }
        } catch (InputMismatchException e) {
            System.out.println("Solo se permiten numeros.");
            sc.nextLine();
        }
    }

    static long obtenerfactorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) factorial *= i;
        return factorial;
    }

    static void LectorCantidades(Scanner sc) {
        int positivos = 0, negativos = 0, ceros = 0, n = 0;
        try {
            System.out.print("Cuantos numeros desea ingresar? : ");
            n = sc.nextInt();
            sc.nextLine(); 
            for (int i = 1; i <= n; i++) {
                System.out.print("Ingrese el numero " + i + ": ");
                int num = sc.nextInt();
                sc.nextLine(); 
                if (num > 0) positivos++;
                else if (num < 0) negativos++;
                else ceros++;
            }
            System.out.println("Cantidad de positivos: " + positivos);
            System.out.println("Cantidad de negativos: " + negativos);
            System.out.println("Cantidad de ceros: " + ceros);
        } catch (InputMismatchException e) {
            System.out.println("Error. Debe ingresar solo números.");
            sc.nextLine();
        }
    }

    static void CalcularPromedio(Scanner sc) {
        int num = 0;
        while (true) {
            try {
                System.out.print("Ingrese un número: ");
                num = sc.nextInt();
                sc.nextLine(); 
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error. Ingrese un número válido.");
                sc.nextLine();
            }
        }
        int contador = 0, suma = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                suma += i;
                contador++;
            }
        }
        if (contador > 0) {
            double promedio = (double) suma / contador;
            System.out.println("El promedio de los números pares entre 1 y " + num + " es: " + promedio);
        } else {
            System.out.println("No hay números pares en ese rango.");
        }
    }

    static void SumaDigitos(Scanner sc) {
        int numero = 0;
        boolean Valido = false;
        while (!Valido) {
            try {
                System.out.print("Ingrese un número para sumar sus dígitos: ");
                numero = sc.nextInt();
                sc.nextLine(); 
                Valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Solo se permiten números enteros.");
                sc.nextLine();
            }
        }
        int auxiliar = Math.abs(numero);
        int suma = 0;
        while (auxiliar > 0) {
            suma += (auxiliar % 10);
            auxiliar /= 10;
        }
        System.out.println("La suma de los dígitos de " + numero + " es: " + suma);
    }
    //==================================================
    //Parte #2 Condiciones y Divisibilidad
    //==================================================
    
    static void Multiplo(Scanner sc) {
    	int numero = 0;
    	while (true) {
            try {
                System.out.print("Ingrese un número: ");
                numero = sc.nextInt();
                sc.nextLine(); // Limpieza de búfer
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error. Ingrese un número.");
                sc.nextLine();
            }
        }
    	if (numero % 7 == 0 || numero % 11 == 0) {
    		System.out.println(numero + "Es multiplo de 7 o de 11");
    	}else {
    		System.out.println(numero + "No es multiplo de 7 ni de 11");
    	}
    }
    
    static void MuestraNumeros(Scanner sc) {
    	int numero = 0;
    	while (true) {
            try {
                System.out.print("Ingrese un numero: ");
                numero = sc.nextInt();
                sc.nextLine(); 
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error. Ingrese un número válido.");
                sc.nextLine();
            }
        }
        System.out.println("Números entre 1 y " + numero + " divisibles entre 3 y no entre 2:");
        for (int i = 1; i <= numero; i++) {
           
            if (i % 3 == 0 && i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); 
    }
    static void Formato24horas(Scanner sc) {
    	int hora = -1;
    	while(true) {
    		try {
    			System.out.println("Ingrese una hora: ");
    			hora = sc.nextInt();
    			sc.nextLine();
    			
    			if (hora >=1 && hora <=23) {
    				break;
    			} else {
    				System.out.println("Debe ingresar una hora valida entre 1 y 23");
    			}
    		} catch (InputMismatchException e) {
    		System.out.println("Ingrese un numero entero");
    		sc.nextLine();
    		}
    	}
    	if (hora >= 0 && hora <= 12) {
            System.out.println("Mañana");
        } else if (hora >= 13 && hora <= 18) {
            System.out.println("Tarde");
        } else {
            System.out.println("Noche");
        }
    }
    //=====================================================
    // Parte 3. Uso de switch 
    //=====================================================
    static void ConvertirNumerosARomanos(Scanner sc) {
        int num = 0;
        while (true) {
            try {
                System.out.print("Ingrese un número del 1 al 5 para convertir a Romano: ");
                num = sc.nextInt();
                sc.nextLine(); 

                if (num >= 1 && num <= 5) {
                    break; 
                } else {
                    System.out.println("Error. Solo números del 1 al 5.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error. Ingrese un número entero.");
                sc.nextLine();
            }
        }

        String romano = ""; 
        switch (num) {
            case 1: romano = "I";   break;
            case 2: romano = "II";  break;
            case 3: romano = "III"; break;
            case 4: romano = "IV";  break;
            case 5: romano = "V";   break;
        }

        System.out.println("El número " + num + " en romano es: " + romano);
    }
    static void OpcionesCalcular(Scanner sc) {
    	int opcion = 0;
        
        while (true) {
            try {
                System.out.println("--- Operaciones ---");
                System.out.println("1. Sumar");
                System.out.println("2. Restar");
                System.out.println("3. Multiplicar");
                System.out.print("Elija una opción (1-3): ");
                opcion = sc.nextInt();
                sc.nextLine(); 

                if (opcion >= 1 && opcion <= 3) {
                    break;
                } else {
                    System.out.println("Error. Elija entre 1 y 3.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error. Ingrese un número entero.");
                sc.nextLine();
            }
        }

        double num1 = 0, num2 = 0;
        try {
            System.out.print("Ingrese el primer número: ");
            num1 = sc.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            num2 = sc.nextDouble();
            sc.nextLine(); 
        } catch (InputMismatchException e) {
            System.out.println("Error en los números. Se usarán valores 0 por defecto.");
            sc.nextLine();
        }

        switch (opcion) {
            case 1:
                System.out.println("Resultado: " + num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado: " + num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado: " + num1 + " * " + num2 + " = " + (num1 * num2));
                break;
        }
    }
    //================================================================
    //Parte #4 Análisis Numerico
    //================================================================
    static void MayorMenorDiferenciaAbsoluta(Scanner sc) {
    	double a = 0, b = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print("Ingrese el primer número (a): ");
                a = sc.nextDouble();
                System.out.print("Ingrese el segundo número (b): ");
                b = sc.nextDouble();
                sc.nextLine(); 
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Error. Ingrese valores numéricos válidos.");
                sc.nextLine(); 
            }
        }

        double mayor = Math.max(a, b);
        double menor = Math.min(a, b);
        double diferencia = Math.abs(a - b);

        System.out.println("\n--- Resultados ---");
        System.out.println("El mayor es: " + mayor);
        System.out.println("El menor es: " + menor);
        System.out.println("La diferencia absoluta es: " + diferencia);
    }
    static void NumerosTablaDiv1Al10(Scanner sc) {
    	try {
            System.out.print("Introduce el número para ver su tabla de división: ");
            double numero = sc.nextDouble();         
            System.out.println("\n--- Tabla de división del " + numero + " ---");
            
            for (int i = 1; i <= 10; i++) {
                if (i != 0) {
                    double resultado = numero / i;
                    System.out.printf("%.2f / %d = %.2f%n", numero, i, resultado);
                } else {
                    System.out.println(numero + " / " + i + " = Error: División entre cero");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: Debes ingresar un número válido.");
        }
    }
    static void CantidadDigitosPares(Scanner sc) {
    	try {
            System.out.print("Introduce un número entero: ");
            long n = sc.nextLong();
            long numeroAbsoluto = Math.abs(n);
            int contadorPares = 0;
            
            if (numeroAbsoluto == 0) {
                contadorPares = 1;
            } else {
                while (numeroAbsoluto > 0) {
                    long digito = numeroAbsoluto % 10; 
                    if (digito % 2 == 0) { 
                        contadorPares++;
                    }                 
                    numeroAbsoluto = numeroAbsoluto / 10; 
                }
            }
            System.out.println("El número " + n + " contiene " + contadorPares + " dígito(s) par(es).");
            
        } catch (Exception e) {
            System.out.println("Error: Por favor, ingresa un número entero válido.");
        }
    }
    static void DeterminarSiNumeroEsTriangular(Scanner sc) {
    	try {
            System.out.print("Introduce un número para verificar si es triangular: ");
            long n = sc.nextLong();
            
            if (n < 0) {
                System.out.println("Los números negativos no pueden ser triangulares.");
            } else {
                long suma = 0;
                long k = 1;
                
                while (suma < n) {
                    suma += k;
                    k++;
                }
                
                if (suma == n) {
                    System.out.println("¡Sí! El número " + n + " es triangular (k = " + (k - 1) + ").");
                } else {
                    System.out.println("No, el número " + n + " no es triangular.");
                }
            }          
        } catch (Exception e) {
            System.out.println("Error: Por favor, ingresa un número entero válido.");
        }
    }
    static void PromedioNegativosSiHay(Scanner sc) {
    	try {
            System.out.print("¿Cuántos números quiere ingresar? ");
            int n = sc.nextInt();          
            double sumaNegativos = 0;
            int contadorNegativos = 0;
            
            for (int i = 1; i <= n; i++) {
                System.out.print("Ingrese el número " + i + ": ");
                double numero = sc.nextDouble();
                
                if (numero < 0) {
                    sumaNegativos += numero;
                    contadorNegativos++;
                }
            }            
            System.out.println("\n--- Resultado ---");
            if (contadorNegativos > 0) {
                double promedio = sumaNegativos / contadorNegativos;
                System.out.printf("El promedio de los %d números negativos es: %.2f%n", 
                                   contadorNegativos, promedio);
            } else {
                System.out.println("No hay negativos");
            }           
        } catch (Exception e) {
            System.out.println("Error: Ingrese valores numéricos válidos.");
        }
    }
    
    //================================================================
    //Parte #5 Patrones y Transformaciones 
    //================================================================
    static void NumerosMultiplosDe6(Scanner sc) {
    	try {
            System.out.print("¿Cuántos múltiplos de 6 deseas ver? ");
            int n = sc.nextInt();
            
            if (n <= 0) {
                System.out.println("Por favor, ingresa un número mayor a 0.");
            } else {
                System.out.println("\nLos primeros " + n + " múltiplos de 6 son:");               
                for (int i = 1; i <= n; i++) {
                    int multiplo = i * 6;
                    
                    if (i < n) {
                        System.out.print(multiplo + ", ");
                    } else {
                        System.out.print(multiplo);
                    }
                }
                System.out.println(); 
            }          
        } catch (Exception e) {
            System.out.println("Error: Debes ingresar un número entero válido.");
        }
    }
    static void NumeroPotenciaDE2(Scanner sc) {
    	try {
            System.out.print("Introduce un número entero: ");
            long n = sc.nextLong();
            
            if (n <= 0) {
                System.out.println("No, " + n + " no es potencia de 2 (debe ser mayor a 0).");
            } else {
                long original = n;
                while (n % 2 == 0) {
                    n = n / 2;
                }

                if (n == 1) {
                    System.out.println("¡Sí! El número " + original + " es potencia de 2.");
                } else {
                    System.out.println("No, el número " + original + " no es potencia de 2.");
                }
            }
            
        } catch (Exception e) {
            System.out.println("Error: Ingresa un número entero válido.");
        }
    }
    static void MostrarNumeroInvertido(Scanner sc) {
    	try {
            System.out.print("Introduce un número entero para invertir: ");
            long n = sc.nextLong();
            
            long original = n;
            long invertido = 0;
            long numeroAbsoluto = Math.abs(n);
            
            while (numeroAbsoluto > 0) {
                long digito = numeroAbsoluto % 10;     
                invertido = (invertido * 10) + digito; 
                numeroAbsoluto = numeroAbsoluto / 10;  
            }
            
            if (original < 0) {
                invertido = invertido * -1;
            }
            
            System.out.println("Número original: " + original);
            System.out.println("Número invertido: " + invertido);
            
        } catch (Exception e) {
            System.out.println("Error: Debes ingresar un número entero válido.");
        }
    }
    static void SumaDeNumerosParOImpar(Scanner sc) {
    	try {
            System.out.print("Introduce un número entero (n): ");
            long n = sc.nextLong();
            
            if (n < 1) {
                System.out.println("Por favor, ingresa un número mayor o igual a 1.");
            } else {
                long suma = 0;
                
                for (int i = 1; i <= n; i++) {
                    suma += i;
                }
                
                System.out.println("\n--- Resultado ---");
                System.out.println("La suma de los números del 1 al " + n + " es: " + suma);
                if (suma % 2 == 0) {
                    System.out.println("El resultado es: PAR");
                } else {
                    System.out.println("El resultado es: IMPAR");
                }
            }
            
        } catch (Exception e) {
            System.out.println("Error: Debes ingresar un número entero válido.");
        }
    }
   static void Temperatura(Scanner sc) {
	   try {
           System.out.print("Introduce la temperatura en grados Celsius: ");
           double celsius = sc.nextDouble();
           double fahrenheit = (celsius * 9 / 5) + 32;
           
           System.out.println("\n--- Conversión ---");
           System.out.printf("%.1f°C equivalen a %.1f°F%n", celsius, fahrenheit);
           if (celsius <= 0) {
               System.out.println("Estado: El agua está en punto de congelación.");
           } else if (celsius >= 100) {
               System.out.println("Estado: El agua está en punto de ebullición.");
           }
           
       } catch (Exception e) {
           System.out.println("Error: Por favor, ingresa un valor numérico válido.");
       }
   }
    }