public class Main {
    public static void main(String[] args) {

        //Inicializar un Cilindro y debuguear analizando los constructores a los que va
        //llamando para inicializar la cadena de herencia. Imprimir por pantalla, el
        //radio del cilindro, la altura, el área de la base y el volumen.
        Cilindro c= new Cilindro("rojo", 1.0d, 1.0f);
        System.out.println("radio del cilindro: "+c.getRadius()+" altura: "+c.getHeight()+" area de la base: "+c.getArea()+" volumen: "+c.getVolumen());

        //Inicializar un segundo CIlindro esta vez especificando la altura y radio.
        //Imprimir por pantalla el radio, la altura, el área de la base y el volumen.

        Cilindro c1= new Cilindro("azul", 3.1d, 2.2f);
        System.out.println("radio del cilindro: "+c1.getRadius()+" altura: "+c1.getHeight()+" area de la base: "+c1.getArea()+" volumen: "+c1.getVolumen());

        //mprimir por pantalla el área y el volumen del cilindro. Vamos a notar que el
        //cálculo del volumen difiere, esto es porque nosotros sobreescribimos el método
        //calcular area y ahora nos calcula el área de un cilindro. Modificar el método calcular
        //volumen en la clase cilindro para que llame al método de la SUPERclase que calcula
        //el área.

        System.out.println("area cilindro C1: "+c1.getArea()+" volumen: "+c1.getVolumen()+" ");
        System.out.println(" C1: "+c1.toString());
    }

}