
/**
 *
 * @author ernesto
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] consultas = ManejadorArchivosGenerico.leerArchivo(
                "./src/consultaPrueba.txt");

        String[] lineas2 = ManejadorArchivosGenerico.leerArchivo(
                "./src/clavesPrueba.txt");

        TArbolBB arbolClaves = new TArbolBB();

        for (String linea : consultas) {
            TElementoAB elemento = new TElementoAB(Integer.parseInt(linea), null);
            arbolClaves.insertar(elemento);
        }

        boolean estaEnArbol = arbolClaves.buscar(5426) != null;
        System.out.println("La clave '5426' esta en 'clavesPrueba.txt': "
                + estaEnArbol);
        estaEnArbol = arbolClaves.buscar(10996) != null;
        System.out.println("La clave '10996' esta en 'clavesPrueba.txt': "
                + estaEnArbol);
        estaEnArbol = arbolClaves.buscar(1265) != null;
        System.out.println("La clave '1265' esta en 'clavesPrueba.txt': "
                + estaEnArbol);

        System.out.println("Post-Orden: " + arbolClaves.postOrden());
        System.out.println("In-Orden: " + arbolClaves.inOrden());
    


        // TODO code application logic here
        // SUBEQUIPO A
        
        TArbolBB arbol = new TArbolBB();
        String[] claves = ManejadorArchivosGenerico.leerArchivo("src/clavesPrueba.txt");
        for(String c : claves){
            TElementoAB elemento = new TElementoAB(Integer.parseInt(c), null);
            arbol.insertar(elemento);
        }
        System.out.println("Pre-Orden: " + arbol.preOrden());
        
        //Ejercicio2
        
        System.out.println("La altura del arbol es: " + arbol.obtenerAltura());
        System.out.println("La cantidad de hojas en el arbol es: " + arbol.obtenerCantidadHojas());
    }
}

