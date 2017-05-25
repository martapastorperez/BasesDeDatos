
package basesdatos;

import static basesdatos.Metodos.conectar;


public class Basesdatos {

    
    public static void main(String[] args) {
       Metodos met=new Metodos();
       met.conectar();
       met.crearTabla();
        Ventana base = new Ventana();
        base.setVisible(true);
    }
    
}
