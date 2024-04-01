
public class Circle {
    private String colour;
    private Double radius;

    public Circle(String colour, Double radius) {
        this.colour=colour;
        this.radius = radius;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
    public Double getArea(){
        return Math.pow(this.radius, 2)*Math.PI;
    }
    public String getCircle(){
        return "Color: "+colour+" Radio: "+radius;
    }
}
