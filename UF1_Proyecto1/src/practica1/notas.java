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
	double uf1, uf2, uf3;
	double acu1, acu2, acu3, def;
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
		
		uf1= entrada.nextDouble();

		
		
		System.out.print("ingrese nota 2: ");
		
		uf2= entrada.nextDouble();
		System.out.print("ingrese nota 3: ");
		
		uf3= entrada.nextDouble();
		
	
	}
	
	// metodo para comprobar bien entroduccion de notas
	
	/**
	 * En este metodo se comprueba que se ha introducido las notas correctamente
	 * @param uf1 unidad formativa 1
	 * @param uf2 unidad formativa 2
	 * @param uf3 unidad formativa 3
	 * @return devuelve si se ha introducido bien las notas
	 */
	
	public void comprobarcion(){
		
		if (uf1>10) {
			System.out.println(" nota1 mal introducida");
			
		}else {
			System.out.println(" nota1 correcta");
		}
		
		if (uf2>10) {
			System.out.println(" nota2 mal introducida");
			
		}else {
			System.out.println(" nota2 correcta");
		}
		if (uf3>10) {
			System.out.println(" nota3 mal introducida");
			
		}else {
			System.out.println(" nota3 correcta");
		}
		
			
		
		
	}
	// metodo para calcular nota
	
	/**
	 * En este metodo se introduce un porcentaje para calcular las notas y crear las acu
	 * @param uf1 unidad formativa 1
	 * @param uf2 unidad formativa 2
	 * @param uf3 unidad formativa 3
	 */
	
	public void Calculonotas() {
		acu1= uf1*0.35;
		acu2 = uf2 * 0.35;
		acu3 = uf3 * 0.30;
		
		def = acu1 + acu2+ acu3;
		
		//hasta aqui la tenemos calculada pero no la mostramos
	}
	
	/**
	 * En este metodo muestra las notas introducidas
	 * @param uf1 unidad formativa 1
	 * @param uf2 unidad formativa 2
	 * @param uf3 unidad formativa 3
	 * @param acu1
	 * @param acu2
	 * @param acu3
	 * @param def nota definitiva
	 * @return devuelve la nota introducida
	 */
	
	public void Mostrar() {
		//print ln lo que hace es que al terminar el print baja la linea
		System.out.println(" notas introducidas son:");
		System.out.println(" nota1 = " + uf1);
		System.out.println(" nota2 = " + uf2);
		System.out.println(" nota3 = " + uf3);
		
		System.out.println(" acumuado 1 = "+ acu1);
		System.out.println(" acumuado 2 = "+ acu2);
		System.out.println(" acumuado 3 = "+ acu3);
		
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