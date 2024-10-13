public class Main {
    public static void main(String[] args) {
        ABinarioBusqueda arbol = new ABinarioBusqueda();

        arbol.insertar(5);
        arbol.insertar(3);
        arbol.insertar(2);
        arbol.insertar(1);
        arbol.insertar(4);
        arbol.insertar(7);
        arbol.insertar(6);
        arbol.insertar(8);
        arbol.insertar(0);

        System.out.println("Recorrido Inorden:");
        arbol.recorridoInorden();

        System.out.println("Recorrido Preorden:");
        arbol.recorridoPreorden(); 

        System.out.println("Recorrido Postorden:");
        arbol.recorridoPostorden();

        System.out.println("Buscar 4: " + arbol.buscar(4)); 
        System.out.println("Buscar 9: " + arbol.buscar(9));

        arbol.eliminar(2);
        System.out.println("Inorden después de eliminar 2:");
        arbol.recorridoInorden();

        arbol.eliminar(3);
        System.out.println("Inorden después de eliminar 3:");
        arbol.recorridoInorden();

        arbol.eliminar(5);
        System.out.println("Inorden después de eliminar 5:");
        arbol.recorridoInorden();
    }
}
