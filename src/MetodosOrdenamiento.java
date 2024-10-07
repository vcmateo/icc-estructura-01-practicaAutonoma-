import java.util.Arrays;

public class MetodosOrdenamiento {

    // Método de burbuja tradicional con errores
    // Error encontrado:
    //EL RETURN NOS DABA UN ARREGLO VACIO
    //correccion el return nos devuelve el arreglo
    public int[] burbujaTradicional(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // Intercambio de elementos
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }
        return arreglo;
    }

    // Método de burbuja tradicional con errores
    // Error encontrado: cambiaba el for y nos daba el arreglo de mayor a menor
    //Correccion cambio de signo de menor que a mayor que en el if 

    public int[] burbujaTradicionalSegundo(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // Intercambio de elementos
                    // Estas 3 lineas NO DEBEN ser modificadas
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }

        return arreglo;

    }

    // Método de burbuja tradicional con errores
    // Error encontrado: cambia la condicion en el for lo que hace que vaya de mayor a menor
    // correccion en la linea 56 se cambia la condicion del primer for al segundo con el menos uno
    public int[] burbujaTradicionalTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n-1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambio de elementos
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
        return arreglo;
    }

    // Método de selección con errores
     //Error encontrado: se encontro el error ya que faltaba el return arreglo para retornarlo y que se imprima
     //correccion se añadio el return
    public int[] seleccionPrimero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            int smallerNumber = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;
        }
        return arreglo;
    }

    // Método de selección con errores
     //Error encontrado: en la linea 101 ya que la condicion estaba j--
     //correccion se cambio la j en el for estaba j-- por for++
    public int[] seleccionSegundo(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length; i++) {
            int indiceMinimo = i;

            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            int smallerNumber = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;
        }
        return arreglo;
    }

    // Método de selección con errores
    //Error encontrado:Se encontraban las variables cambiadas en los arreglos "indiceMinimo" e "i" ya que hacemos
    //que la variable smallerNumber e i terminen valiendo lo mismo y por eso se duplica los 34
    //correccion se cambio el indice i por el indiceMinimo en las lineas 131 y 133 
    public int[] seleccionTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length -1; i++) {
           int indiceMinimo = i;

            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            int smallerNumber = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;
        }
        return arreglo;
    }

    // Método de inserción con errores
    // Error encontrado:en el while, la variable i debe ser >= a 0 y el arreglo[i] no debe ser menor que key
    //solucion en el while i debe ser >= a 0 y arreglo[i] mayor que la key
   public int[] insercionPrimero(int[] arregloOriginal) {

       int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
       for (int j = 1; j < arreglo.length; j++) {
           int key = arreglo[j];
           int i = j - 1;

           while (i >= 0 && arreglo[i] > key) {
               arreglo[i + 1] = arreglo[i];
               i--;
           }
           arreglo[i + 1] = key;
       }
       return arreglo;
   }

    // Método de inserción con errores
    // Error encontrado: el metodo de insercion se hace a traves de un while, tambien el cambio de variables de i por j
    //solucion se reemplaza el for por un while, dentro se le llama a la variable i y por eso el resto de arreglos i cambian por j
    public int[] insercionSegundo(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int actual = arreglo[j];

            int i = j - 1;
            for (i>= 0 && arreglo[i] > actual) {
                arreglo[i + 1] = arreglo[i];
            }
            arreglo[i + 1] = actual;
            
        }
        return arreglo;
    }

    // Método de inserción con errores
    // Error encontrado: corregimos el while para que se adapte como debe ser el while
    //correccion se cambia variables de while y se añade el return
   public int[] insercionTercero(int[] arregloOriginal) {

       int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
       for (int j = 1; j < arreglo.length; j++) {
           int key = arreglo[j];
           int i = j;

           while (i > 0 && arreglo[i-1] > key) {
               arreglo[i] = arreglo[i-1];
               i--;
           }
           arreglo[i + 1] = key;
       }
       return arreglo;
   }

}
