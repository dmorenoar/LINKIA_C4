/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkia_c4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LINKIA_C4 {


    public static void main(String[] args) {
        
        boolean truea;
        double num2;
        String nombre;
        int numero;
        

        
        ArrayList<String> pandemonium = new ArrayList<String>();

        ArrayList<Game> listaJuegos = new ArrayList<Game>();
       
        Game pokemon = new Game("Pokemon", "Nintendo", 1997);
       
        listaJuegos.add(pokemon);
        
        listaJuegos.add(new Game("Castelvania", "Konami", 1985));
        
        /*for(int i=0;i<listaJuegos.size();i++){
            System.out.println(listaJuegos.get(i));
        }*/

        //System.out.println("Elementos del arrayJuegos:" + listaJuegos.size());
        //System.out.println("Que juego hay en la posicion 0:" + listaJuegos.get(0));
        
        Game zelda = new Game("The legend of Zelda", "Nintendo", 1986);
        
        Game zelda2 = new Game("The legend of Zelda: Windwakers", "Konami", 2000);
        
        System.out.println("Existe zelda en el array(se llama igual):" + zelda.equals(zelda2));
        
        if(zelda.equals(zelda2)){
            System.out.println("No puedes introducir juegos repetidos");
        }else{
            System.out.println("todo ok");
        }
        
        //Añadimos un elemento en la posición que queremos
        listaJuegos.add(0, zelda);
        
        /*for(int i=0;i<listaJuegos.size();i++){
            System.out.println(listaJuegos.get(i));
        }*/
        
        //Eliminamos un juego de la lista
        //listaJuegos.remove(pokemon);
        
        //Elimina todos los elementos de la lista
        //listaJuegos.clear();
        
        for(int i=0;i<listaJuegos.size();i++){
            System.out.println(listaJuegos.get(i));
        }
        
        
        //OPCION 1 Sustituimos un elemento de nuestra lista por uno nuevo.
        //listaJuegos.set(1, new Game("The legend of Zelda: Majora's Mask","Nintendo",2000));
        
        
        //OPCION 2
        Game majoras = new Game("The legend of Zelda: Majora's Mask","Nintendo",2000);
        listaJuegos.set(1,majoras);
       
        
        
        System.out.println("Sustituimos un elemento en nuestra lista");
        for(int i=0;i<listaJuegos.size();i++){
            System.out.println(listaJuegos.get(i));
        }
         
        System.out.println("Mi coleccion contiene pokemon?" + listaJuegos.contains(pokemon)); 
        System.out.println("Mi colección tiene TL of Zelda?:" + listaJuegos.contains(majoras));
    
        System.out.println("Que pos del ranking tiene el juego Majora's Mask:" + listaJuegos.indexOf(majoras));
    
        System.out.println("El mejor juego en el ranking es:" + listaJuegos.get(0));
    
        
        System.out.println("Mostramos con un bucle for each los juegos");
        
        for(Game juegos : listaJuegos){
            System.out.println(juegos);
        }
        
        
        System.out.println("Recorro una lista con java 8");
        listaJuegos.stream().forEach((i) -> {
            System.out.println(i);
        });
        
        
        HashMap<String, String> aeropuertos = new HashMap<>();
        
        aeropuertos.put("BCN", "Barcelona");
        aeropuertos.put("TKY" , "Tokyo");
        
        //Recorrer un hasmap por claves
        for(String clave : aeropuertos.keySet()){
            //clave es como el i en un bucle común
            System.out.println("La clave con valor:" + clave + " es del aeropuerto:" + aeropuertos.get(clave));
        }
        
        //Recorrer un array por clave y valor
        //enstrySet nos permite convertir nuestro hashamp en una lista de clave valor
        
        /*CLAVE     VALOR
          TKY       Tokyo
          BCN       Barcelona  */
        
        
        
        
        for(Map.Entry<String,String> aero : aeropuertos.entrySet()){
            
            System.out.println("Clave:" + aero.getKey() + "con valor:" + aero.getValue());
        }
        
        //Vacia el hasmap
        //aeropuertos.clear();
        
        //Preguntamos por el valor
        System.out.println("El hashamp contiene Barcelona?:" + aeropuertos.containsValue("Barcelona"));
        
        //Preguntamos por key
        System.out.println("El hashamp contiene la clave BCN?:" + aeropuertos.containsKey("BCN"));
        
        System.out.println("Las claves guardadas son:" + aeropuertos.keySet());
               
        
        HashMap<String, String> aeropuertosCopia = new HashMap<>();
        
        //Copiamos lo de aeropuertos en el nuevo aeropuertosCopia
        aeropuertosCopia.putAll(aeropuertos);
        
        //Eliminamos un elementos del hashmap segun su llave
        aeropuertos.remove("BCN");
        
        //Devuele la lista de valores
        System.out.println("Los valores guardadas son:" + aeropuertos.values());
        
        /*
        ArrayList<Companyia> nintendo = new ArrayList<>();
        
        nintendo.add(zelda);
        nintendo.add(pokemon);
        
        //Recorremos los elemenots de la lista companyia
        System.out.println("Juegos de la companyia NINTENDO");
        for(int i=0;i<nintendo.size();i++){
            System.out.println(nintendo.get(i));
        }
*/
        
    }
    
}
