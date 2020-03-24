package unidad2;

public class Main {
    public static void main(String[] args) {
//
//        Generic genericos = new Generic<Persona>();
//        Persona luis = new Persona("luis","perez",25410880,30);
//        Persona pedro = new Persona("pedro","gonzales",41002020,40);
//        Persona paco = new Persona("paco","marino",390029290,33);
//        Persona bruno = new Persona("bruno","cr",222222,20);
//        Persona jose = new Persona("jose","castillo",555555,55);
//
//        genericos.agregar(luis);
//        genericos.agregar(pedro);
//        genericos.agregar(paco);
//        genericos.agregar(bruno);
//        genericos.agregar(jose);
//

//      Persona minimo = (Persona)genericos.min();
//      Persona maximo = (Persona)genericos.max();
//      System.out.println("Maximo es:" + " "+maximo.toString()+"/n");
//      System.out.println("Minimo es:" + " "+minimo.toString()+"/n");
//      System.out.println(genericos.toString());
//        Persona p = (Persona)genericos.removerUltimo();
//        System.out.println( p.toString());


        Pila pila = new Pila<Integer>();
        pila.push(1);
        pila.push(3);
       System.out.println("cantidad total: " + pila.size());

        System.out.println(pila.pop());
        System.out.println(pila.pop());
        System.out.println(pila.pop());
        System.out.println("cantidad total: " + pila.size());

    }
}
