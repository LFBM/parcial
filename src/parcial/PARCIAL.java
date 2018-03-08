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
public class PARCIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal obj1= new Animal();
        
        obj1.setPeso((float)4.5 );
        obj1.comer();
        obj1.setNombre("Rufus");
        obj1.setEdad(8);
        
        Oviparo obj2=new Oviparo();
        obj2.setPeso((float) 5.2);
        obj2.setNombre("Zeus");
        obj2.setEdad(5);
        obj2.comer();
        obj2.ponerHuevos();
        
        System.err.println(obj2.getPeso());
        System.out.println(obj2.getEdad());
        System.out.println(obj2.getNombre());
        
        Mamifero obj3=new Mamifero();
        
        
        obj3.setPeso((float)8.5 );
        obj3.setNombre("Otto");
        obj3.setEdad(6);
        obj3.comer();
        obj3.parir();
        obj3.amamantar();
        
        System.err.println(obj3.getPeso());
        System.out.println(obj3.getEdad());
        System.out.println(obj3.getNombre());
        
        
        Delfin obj4= new Delfin() ;
        
        
        
        obj4.setPeso((float)10.3 );
        obj4.setNombre("Celerin");
        obj4.setEdad(24);
        obj4.comer();
        obj4.parir();
        obj4.amamantar();
        obj4.nadar();
        
        System.err.println(obj4.getPeso());
        System.out.println(obj4.getEdad());
        System.out.println(obj4.getNombre());
        
        
        Perro obj5= new Perro ();
        
        
        
        obj5.setPeso((float)10.3 );
        obj5.setNombre("Firulais");
        obj5.setEdad(24);
        obj5.comer();
        obj5.parir();
        obj5.amamantar();
        obj5.setColorpelo("negro");
        obj5.ladrar();
        
        
        System.err.println(obj5.getPeso());
        System.out.println(obj5.getEdad());
        System.out.println(obj5.getNombre());
        System.out.println(obj5.getColorpelo());
        
    }
    
}
