package es.unileon.prg.tema5;

/**
 * Clase con los ejercicios correspondientes a cadenas de caracteres.
 * La clase "String"
 *
 * @author PRG
 * @version 1.0
 */
    public class Apartado030201 extends Apartado {
   
       protected String obtenerPractica(){
         return "P-VAR";
      }
   
       protected String obtenerBloque() {
         return "Cadenas de caracteres - Clase <<String>>";
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio1.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario para realizar las siguientes tareas:

    *	Obtener el numero de caracteres de la cadena.
    *	Calcular la posicion intermedia de la cadena.
    *	Extraer el caracter que ocupa dicha posicion.
    *	Mostrar por pantalla dicho caracter y el codigo que lo representa.
    */
       public void ejercicio01() {
         cabecera("01","");
         String cadena = "En un lugar de la Mancha";
        // Inicio modificacion.
         System.out.println("El tamaño de '" + cadena + "' es de " + cadena.length() + " caracteres ");
         System.out.println("La posicion del caracter del medio de la cadena es: " + cadena.length()/2);
         System.out.println("El caracter situado en la posicion anterior es: " + cadena.charAt(cadena.length()/2));
         System.out.println("El caracter hallado anteriormente en codigo ASCII es: "+ (int) cadena.charAt(cadena.length()/2));

        // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio2.
    *
    * </br>
    *
    *	Comparar las dos cadenas para ver si son iguales y mostrar por pantalla el resultado de la comparacion.
    * Volver a compararlas pero ahora sin tener en cuenta si estan en mayusculas o minusculas y mostrar por pantalla el resultado de la comparacion.
    *	Convertir las dos cadenas a minusculas, volver a compararlas y mostrar por pantalla el resultado de la comparacion.
    *
    */
       public void ejercicio02() {
         cabecera("02", "");
         String cadena = "Viaje al Parnaso";
         String otraCadena = "ViAje al pArnaso";
      // Inicio modificacion
         System.out.println("La comparacion entre las dos cadenas es: " + cadena.compareTo(otraCadena));
         System.out.println("La comparacion entre las dos cadenas sin tener en cuenta las mayusculas es: " + cadena.compareToIgnoreCase(otraCadena));
         cadena=cadena.toLowerCase();
         otraCadena = otraCadena.toLowerCase();
         System.out.println("La comparacion entre las dos cadenas en letras minusculas es: " + cadena.compareTo(otraCadena));
      // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio3.
    *
    * </br>
    * Se pide anyadir el codigo necesario para realizar las siguientes tareas:
    *	Concatenar las dos cadenas formando una tercera usando el operador +
    * Concatenar las dos cadenas formando una tercera usando el metodo concat
    * Mostrar los resultados por pantalla.
    */
       public void ejercicio03() {
         cabecera("03", "");
      
         String cadena = "Viaje al Parnaso";
         String otraCadena = "Persiles y Segismunda";
      // Inicio modificacion
         System.out.println(cadena + " " + otraCadena);
         System.out.println(cadena.concat(" " + otraCadena));

        // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio4.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario para realizar las siguientes tareas:
    * Comprobar si la cadena termina con la palabra Parnaso utilizando endsWith.
    * Comprobar si la cadena empieza con la palabra Viaje utilizando startsWith.
    * Mostrar los resultados por pantalla.
    */
       public void ejercicio04() {
         cabecera("04", "");
         String cadena = "Viaje al Parnaso";
        // Inicio modificacion
           System.out.println(cadena.endsWith("Parnaso"));
           System.out.println(cadena.startsWith("Viaje"));
        // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio5.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario para realizar las siguientes busquedas en cadena utilizando indexOf:
    * Buscar si el caracter p esta en la cadena y mostrar el resultado por pantalla.
    * Buscar si la cadena Par esta en la cadena y mostrar el resultado por pantalla.
    * Buscar la ultima ocurrencia de la letra a en la cadena y mostrar el resultado por pantalla.
    * Buscar la letra a empezando por la posicion 3 y mostrar el resultado por pantalla.
    */
       public void ejercicio05() {
         cabecera("05","");
         String cadena = "Viaje al Parnaso";
      // Inicio modificacion
         char letra = 'p';
         cadena.indexOf(letra);
         if (cadena.indexOf(letra) == -1){
            System.out.println("El caracter '" + letra + "' no está includo en la cadena");
          }else{
            System.out.println("El caracter '" + letra + "' está incluido en la cadena");
          }

         String palabra = "Par";
         cadena.indexOf(palabra);
         if (cadena.indexOf(palabra) == -1){
            System.out.println("La secuencia '" + palabra + "' no está includa en la cadena");
          }else{
            System.out.println("La secuencia '" + palabra + "' está incluida en la cadena");
          }

         char letraa = 'a';
          if (cadena.indexOf(letraa) == -1){
            System.out.println("El caracter '" + letraa + "' no está includo en la cadena");
          }else{
            System.out.println("La posicion que ocupa el caracter '" + letraa + "' es la posicion " + cadena.lastIndexOf(letraa));
          }

      
          int letras = cadena.indexOf('a',3);
          System.out.println("El siguiente caracter igual ocupa la posicion " + letras);

         

      // Fin modificacion  
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio6.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario para realizar las siguientes tareas:
    *	Reemplazar las ocurrencias de la letra a por * y mostrar el resultado por pantalla.
    * Reemplazar las ocurrencias de la palabra Parnaso por Olimpo y mostrar en resultado por pantalla
    */
       public void ejercicio06() {
         cabecera("06", "");
      
         String cadena = "Viaje al Parnaso";
      // Inicio modificacion
         System.out.println(cadena.replace("a","*"));
         System.out.println(cadena.replace("Parnaso","Olimpo"));
      // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio7.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario para realizar las siguientes tareas:
    * Obtener la subcadena que va desde la mitad al final.
    * Obtener la subcadena que empieza en la primera j y termina antes de la primera s
    */
       public void ejercicio07() {
         cabecera("07", "");
         String cadena = "Viaje al Parnaso";
      // Inicio modificacion
         String subcadena=cadena.substring(cadena.length()/2);
         System.out.println("La subcadena de la cadena '" + cadena + "' es: " + subcadena);
         char letraJ='j';
         cadena.indexOf(letraJ);
         char letraS='s';
         cadena.indexOf(letraS);
         String subacadena=cadena.substring(cadena.indexOf(letraJ),cadena.indexOf(letraS));
         System.out.println("La subcadena es: " + subacadena);
      // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio8.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario quitar los espacios sobrantes al principio y al final.
    */
       public void ejercicio08() {
         cabecera("08", "");
         String cadena = " La Galatea   ";
      // Inicio modificacion
        System.out.println(cadena.trim());

      // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio9.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario convertir las variables a String utilizando el metodo valueOf. Mostrar el resultado por pantalla.
    */
       public void ejercicio09() {
         cabecera("09", "");
         double numero = 1.12e12;
         boolean expresion = true;
         long enteroGrande = 1231231L;
      // Inicio modificacion
         System.out.println("Variable '" + numero + "' es: " + String.valueOf(numero));
         System.out.println("Variable '" + expresion + "' es: " + String.valueOf(expresion));
         System.out.println("Variable '" + enteroGrande + "' es: " + String.valueOf(enteroGrande));

      // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio10.
    *
    * </br>
    *
    * Se pide compara las dos cadenas lexicograficamente y mostrar el resultado por pantalla.
    */
       public void ejercicio10() {
         cabecera("10", "");
         String cadena = "Viaje al Parnaso";
         String otraCadena = "Viaje al Olimpo";
      // Inicio modificacion
         System.out.println("La comparacion entre las dos cadenas es: " + cadena.compareTo(otraCadena));
      // Fin modificacion
      }
   }