package AbstractClass;


public class Circle extends Figure {
    private final float PI = 3.14f;
    private float radius;
    public Circle(String color,float radius)
    {
        super(color);
        this.radius = radius;
    }


    @Override
    public float area() {
        return PI* radius*radius;
    }

    @Override
    public float perimetro() {
        return 2*PI*radius;
    }
}
