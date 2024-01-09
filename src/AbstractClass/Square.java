package AbstractClass;

public class Square extends Figure {
    private float lado;
    public Square(String color, float lado)
    {
        super(color);
        this.lado = lado;
    }
    @Override
    public float area(){
        return lado*lado;
    }
    @Override
    public float perimetro()
    {
        return 4*lado;
    }
    @Override
    public void printColor()
    {
        System.out.println("El color del cuadrado es: " + color);
    }
}
