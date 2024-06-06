import java.util.Vector;
import java.util.Enumeration;

public class EjemploEnumeration {
    public static void main(String[] args) {
      
        Vector<String> colores = new Vector<>();
        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Azul");
        colores.add("Amarillo");
        
   
        Enumeration<String> enumeracion = colores.elements();
        
       
        System.out.println("Colores en el vector:");
        while (enumeracion.hasMoreElements()) {
            String color = enumeracion.nextElement();
            System.out.println(color);
        }
    }
}
