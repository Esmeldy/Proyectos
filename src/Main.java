public class Main {
    public static void main(String[] args) {
        System.out.println("Tarea 1");
            suma(5,6,7);

        System.out.println("Tarea 2");
        coche c = new coche();
        c.incrementarPuerta();
        c.incrementarPuerta();
        c.incrementarPuerta();
        c.incrementarPuerta();

        c.getPuertas();
    }

    public static void suma(int a, int b, int c){
        System.out.println("La suma es: " +(a+b+c));
    }
}