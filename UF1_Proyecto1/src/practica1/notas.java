/**
 * En primer lugar podemos observar que para esta practica se utiliza el package-practica1 y la utilidad importada será el scanner de java
 */
package practica1;
import java.util.Scanner;


/**
 * En esta clase notas declaramos las variables que utilizaremos para calcular las notas
 * Se utilizaran tres notas
 * Se utilizaran tres unidades y una definitiva
 * @author Jose Manuel
 * @version: 04/04/2023/A
 */

public class notas {
	
	/**
	 * Aqui podemos observar las variables notas y las variables que harán referencia a las unidades
	 */
	//declaramos la variables que nos hacen falta
	double unidad1, unidad2, unidad3;
	double eval1, eval2, eval3, def;
	//utilizamos escanner para poder introducir datos
	
	/**
	 * Utilizamos el scanner para introducir los datos
	 */
	Scanner entrada = new Scanner(System.in);
	
	///vamos ha crear un metodo para ingresar 
	
	/**
	 * En esta parte observamos el metodo ingresaNotas y la entrada de las notas en el scanner
	 */
	
	public void IngresaNotas() {
		//cuando ejecutamos este metodo lo primero que queremos es que nos pida notas
		System.out.println("ingrese las notas del estudiante");
		
		System.out.print("ingrese nota 1: ");
		
		unidad1= entrada.nextDouble();

		
		
		System.out.print("ingrese nota 2: ");
		
		unidad2= entrada.nextDouble();
		System.out.print("ingrese nota 3: ");
		
		unidad3= entrada.nextDouble();
		
	
	}
	
	// metodo para comprobar bien entroduccion de notas
	
	/**
	 * En este metodo se comprueba que se ha introducido las notas correctamente
	 * @param unidad1 unidad formativa 1
	 * @param unidad2 unidad formativa 2
	 * @param unidad3 unidad formativa 3
	 * @return devuelve si se ha introducido bien las notas
	 */
	
	public void comprobarcion(){
		
		if (unidad1>10) {
			System.out.println(" nota1 mal introducida");
			
		}else {
			System.out.println(" nota1 correcta");
		}
		
		if (unidad2>10) {
			System.out.println(" nota2 mal introducida");
			
		}else {
			System.out.println(" nota2 correcta");
		}
		if (unidad3>10) {
			System.out.println(" nota3 mal introducida");
			
		}else {
			System.out.println(" nota3 correcta");
		}
		
			
		
		
	}
	// metodo para calcular nota
	
	/**
	 * En este metodo se introduce un porcentaje para calcular las notas y crear las acu
	 * @param unidad1 unidad formativa 1
	 * @param unidad2 unidad formativa 2
	 * @param unidad3 unidad formativa 3
	 */
	
	public void Calculonotas() {
		eval1= unidad1*0.35;
		eval2 = unidad2*0.35;
		eval3 = unidad3*0.30;
		
		def = eval1 + eval2+ eval3;
		
		//hasta aqui la tenemos calculada pero no la mostramos
	}
	
	/**
	 * En este metodo muestra las notas introducidas
	 * @param unidad1 unidad formativa 1
	 * @param unidad2 unidad formativa 2
	 * @param unidad3 unidad formativa 3
	 * @param eval1
	 * @param eval2
	 * @param eval3
	 * @param def nota definitiva
	 * @return devuelve la nota introducida
	 */
	
	public void Mostrar() {
		//print ln lo que hace es que al terminar el print baja la linea
		System.out.println(" notas introducidas son:");
		System.out.println(" nota1 = " + unidad1);
		System.out.println(" nota2 = " + unidad2);
		System.out.println(" nota3 = " + unidad3);
		
		System.out.println(" acumuado 1 = "+ eval1);
		System.out.println(" acumuado 2 = "+ eval2);
		System.out.println(" acumuado 3 = "+ eval3);
		
		System.out.println(" nota definitiva es = "+ def);
		
	}
	
	/**
	 * En este metodo se calcula si se ha aprobado o se ha suspendido
	 * @param def nota definifiva
	 * @return Aqui devuelve un resultado
	 */

	public void aprobado() {
			
			if(def<5 && def>=0) {
				System.out.println("suspendio");
			}else {
				if (def>=5 && def<=10 ) {
				System.out.println("aprobado");
				}else {
					System.out.println(" error en la notas");
				}
			}
		}
		
	/**
	 * En esta parte se observa los metodos creados y preparados para su utilizacion
	 * @param args
	 */
	
	public static void main(String[] args) {
		// creamos mecanimos para llamar a cualquier metodo fuero de la clase
		notas fc= new notas();
		
		fc.IngresaNotas();
		
		fc.comprobarcion();
		

		fc.Calculonotas();
		
		fc.Mostrar();
		
		fc.aprobado();
		
	}

}
