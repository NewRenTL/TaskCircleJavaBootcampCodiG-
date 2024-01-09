package AbstractClass;

public abstract class Figure {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract float area();
    public abstract float perimetro();

    public void printColor()
    {
        System.out.println(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
