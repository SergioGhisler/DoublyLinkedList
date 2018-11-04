/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticklist;

/**
 *En este clase guardaremos la lista de empleados de una empresa
 * @author Sergio
 */
public class StatickList  {

    /**
     * @param args the command line arguments
     */
    private int capacity;
    private int length;
    private static  Empleados[] data;
/**
 * El constructor sera el que inicialice la lista,
 * nuestra lista se inicializara siempre con la length en 0,
 * ya que siempre empezara estando vacia
 * Por otro lado creamos el array de tipo empleados al que llamamos data
 * @param capacity es la capacidad maxima de nuestra lista

 */
    public StatickList(int capacity) {
        this.capacity = capacity;
        this.length = 0;
        StatickList.data=new Empleados[capacity];
    }
    
    /**
     * Metodo que confirma si la lista esta o no vacia
     * @return el return es un booleano por lo que si esta vacio = true, lleno= false
     */
    public boolean isEmpty() {
        return length == 0;
    }
/**
 * Este metodo inserta en la lista (solamente si hay hueco), en la ultima posicion
 * vacia que exista
 * @param elemento Es el objeto que quieres introducir en la lista
 * @return Returna true si funciona y false si no funciona
 */
    public boolean insertar(Empleados elemento) {
        if (length < capacity) {
            data[length]= elemento;
            length ++;
            return true;
        }
        return false;
    }
/**
 * En este metodo podemos insertar en la posicion que queramos, si la posicion 
 * esta ocupada, movemos este objeto a la derecha, asi como los que estan a la derecha
 * de este
 * @param elemento El objeto que deseamos insertar
 * @param pos la posicion en la que deseamos insertar
 * @return devuelve true si inserta y false si no inserta
 */
    public boolean insertarPos(Empleados elemento, int pos) {
        if (length < capacity && pos < capacity) {
            if (pos >= length) {
                  data[length] = elemento;
                length++;
                return true;

            } else {
                for (int i = length-1; i>=pos; i--) {
                    data[i + 1] = data[i];
                }
                data[pos] = elemento;
                length ++;
                return true;
            }
        }
        return false;
    }
/**
 *  Con este metodo eliminamos el elemento en la posicion que queramos,
 * cuando eliminemos un elemento, los que estan a su derecha se mueven hacia la
 * izquierda, para as√≠ ordenarse.
 * @param pos Posicion en la que queremos eliminar
 * @return returnara falso si en la posicion a eliminar no hay nada
 */
    public boolean eliminar(int pos) {
       
        if (pos<length) { 
  
            for(int i=pos;i<length-1;i++){
                data[i]=data[i+1];
                
            }
            length--;
           
            return true;
            
        }
        return false;
    }
    /**
     * Modifica el elemento en esta posicion y lo cambia por otro
     * @param pos posicion del elemento a modificar
     * @param elemento elemento que va a sustituir al anterior
     * @return retornara falso si en esa posicion no hay nada que se pueda modificar
     */
    public boolean modificar ( int pos, Empleados elemento ){
        if (pos <length){
            data[pos]= elemento;
                    return true;
        }
        return false;
    }
    /**
     * Este metodo imprime toda la lista
     * @return retorna la lista como un String
     */
      public String imprimir(){
          String contador = "";
          for(int i = 0; i<length;i++){
              
              contador += ("\n"
                      + ""+data[i]+"");
              
              
          }
          
      return contador +"\n";
      }
      /**
       * 
       * @param lista seleccionamos la lista a la que queramos aplicarle el mÈtodo
       */
      public static void seleccion(StatickList lista) {
    	  for(int i =0;i<lista.length;i++) {
    		  for(int j=1;j<lista.length;j++) {
    			  if(data[i].getId()>data[j].getId()&& i<j) {
    				Empleados temp= data[i];
    				data[i]=data[j];
    				data[j]=temp;
    			  }
    			  }
    		  }
    	  }
  
    public static void main(String[] args) {
       Empleados e1 = new Empleados( "Sergio",  19, "1212313D", 12,  "CEO", "29/03/08");
        Empleados e2 = new Empleados( "Yoshi",  19, "123WS", 1,  "Administrador", "14/'03/03");
        Empleados e3 = new Empleados ("Fran",23,"41234F",346,"Programador","22/08/10");
        Empleados e4 = new Empleados( "Antonio", 34, "2134f2",14, "Jardinero","31/01/99");
       StatickList lista = new StatickList(3);
        System.out.println(lista.isEmpty());
        System.out.println(lista.insertar(e1));
         System.out.println(lista.insertar(e2));
         System.out.println(lista.insertarPos(e3,0));
         System.out.println(lista.insertar(e3));
        System.out.println(lista.imprimir());
   
        StatickList.seleccion(lista);
        System.out.println(lista.imprimir());
        
    }

  

}
