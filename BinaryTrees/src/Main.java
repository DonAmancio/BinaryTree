import arbolBinario.busqueda;

public class Main {

    public static void main(String[] args) {

        busqueda arbolBinario = new busqueda();

        System.out.println("Datos ordenados: ");

        arbolBinario.insertar(3);
        arbolBinario.insertar(2);
        arbolBinario.insertar(4);
        arbolBinario.insertar(1);
        arbolBinario.insertar(3);
        arbolBinario.insertar(5);
        arbolBinario.insertar(7);
        arbolBinario.insertar(6);



        arbolBinario.mostrarInOrden();


    }
}
