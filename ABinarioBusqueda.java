public class ABinarioBusqueda {
    private Nodo raiz;
    
    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }
    
    private Nodo insertarRec(Nodo raiz, int valor) {
        if (raiz == null) {
            raiz = new Nodo(valor);
            return raiz;
        }
        if (valor < raiz.valor) {
            raiz.izquierdo = insertarRec(raiz.izquierdo, valor);
        } else if (valor > raiz.valor) {
            raiz.derecho = insertarRec(raiz.derecho, valor);
        }
        return raiz;
    }
    
    public boolean buscar(int valor) {
        return buscarRec(raiz, valor);
    }
    
    private boolean buscarRec(Nodo raiz, int valor) {
        if (raiz == null) {
            return false; 
        }
        if (raiz.valor == valor) {
            return true;
        }
        if (valor < raiz.valor) {
            return buscarRec(raiz.izquierdo, valor);
        } else {
            return buscarRec(raiz.derecho, valor);
        }
    }
    
    public void eliminar(int valor) {
        raiz = eliminarRec(raiz, valor);
    }

    private Nodo eliminarRec(Nodo raiz, int valor) {
        if (raiz == null) {
            return raiz;
        }
    
        if (valor < raiz.valor) {
            raiz.izquierdo = eliminarRec(raiz.izquierdo, valor);
        } else if (valor > raiz.valor) {
            raiz.derecho = eliminarRec(raiz.derecho, valor);
        } else {
            if (raiz.izquierdo == null) {
                return raiz.derecho;
            } else if (raiz.derecho == null) {
                return raiz.izquierdo;
            }
        
            raiz.valor = minValor(raiz.derecho);
    
            raiz.derecho = eliminarRec(raiz.derecho, raiz.valor);
        }
        return raiz;
    }
    
    private int minValor(Nodo raiz) {
        int minValor = raiz.valor;
        while (raiz.izquierdo != null) {
            minValor = raiz.izquierdo.valor;
            raiz = raiz.izquierdo;
        }
        return minValor;
    }
    
    public void recorridoInorden() {
        inordenRec(raiz);
        System.out.println();
    }
    
    private void inordenRec(Nodo raiz) {
        if (raiz != null) {
            inordenRec(raiz.izquierdo);
            System.out.print(raiz.valor + " ");
            inordenRec(raiz.derecho);
        }
    }
    
    public void recorridoPreorden() {
        preordenRec(raiz);
        System.out.println();
    }
    
    private void preordenRec(Nodo raiz) {
        if (raiz != null) {
            System.out.print(raiz.valor + " ");
            preordenRec(raiz.izquierdo);
            preordenRec(raiz.derecho);
        }
    }
    
    public void recorridoPostorden() {
        postordenRec(raiz);
        System.out.println();
    }
    
    private void postordenRec(Nodo raiz) {
        if (raiz != null) {
            postordenRec(raiz.izquierdo);
            postordenRec(raiz.derecho);
            System.out.print(raiz.valor + " ");
        }
    }
}