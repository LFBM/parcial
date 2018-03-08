/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

/**
 *
 * @author Felipe
 */
public class Perro extends Mamifero{
    
    public void ladrar(){
        System.out.println("los perros son mascotas que les gusta ladrar");
    }
    String colorpelo ;

    public String getColorpelo() {
        return colorpelo;
    }

    public void setColorpelo(String colorpelo) {
        this.colorpelo = colorpelo;
    }
    
    
}
