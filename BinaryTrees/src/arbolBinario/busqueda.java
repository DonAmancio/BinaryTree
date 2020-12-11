package arbolBinario;

public class busqueda {

   private Nodo raiz;

   public busqueda(){
       raiz = null;
   }

   public boolean vacio(){

       return raiz == null;

   }

   private void insertar(Nodo padre , Nodo hijo , int dato ){


       if (hijo  ==  null)
       {

           Nodo nuevo = new Nodo(null , dato , null);

           if (dato >= padre.getDato() )
           {

               padre.setDerecho(nuevo);

           }
           else {

               padre.setIzquierdo(nuevo);

           }

       }
       else
           {

               if (dato >= padre.getDato() )
               {

                   insertar(hijo , hijo.getDerecho(), dato);

               }
               else {

                   insertar(padre, hijo.getIzquierdo(), dato);

               }
       }

   }

    public void insertar(int dato ){



       if (vacio()){

           Nodo nuevo = new Nodo(null, dato , null);

           raiz = nuevo;

       }


       else {

           if (dato >= raiz.getDato()){


               insertar(raiz , raiz.getDerecho(), dato);


           }
           else{

               insertar( raiz , raiz.getIzquierdo(), dato);

           }

       }

    }


    private void mostrarInOrden(Nodo nodo){

       if (nodo == null){




       }

       else {


           mostrarInOrden(nodo.getIzquierdo());

           System.out.print(nodo.getDato() + "  " );

           mostrarInOrden(nodo.getDerecho());



       }

    }


    public void mostrarInOrden(){

       Nodo temp = raiz;

       mostrarInOrden(raiz);

        System.out.println();


    }


}
