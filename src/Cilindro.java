public class Cilindro extends Circle{
    private Float height=1.0f;

    public Cilindro(String color, Double radio, Float height) {
        super(color, radio);
        this.height = height;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }
    public Double getVolumen(){
        return super.getArea()*height;
    }
    //Sobreescribir el método calcular area declarado en Círculo, para que nos
    //permita calcular el área del cilindro.
    //(2π×radius×height + 2×areaBase)

    @Override
    public Double getArea(){
        return 2*Math.PI*super.getRadius()*height + 2*super.getArea();
    }

    //Modificar el método toString() de la clase cilindro para que imprima por
    //pantalla lo siguiente
    //Cilindro: subclase de + {toString() de Círculo} +altura= {alturaCilindro}

    public String toString(){
        return "Cilindro: subclase de CIRCULO "+ getCircle()+" altura del cilindro: "+height;

    }

}
