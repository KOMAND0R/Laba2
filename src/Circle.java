public class Circle
{
    private float centreX;
    private float centreY;
    private float radius;
    private String name;

    public Circle(float x, float y, float r, String n)
    {
        centreX = x;
        centreY = y;
        radius = r;
        name = n;
    }

    public float getSquare()
    {
        return (3.14f * radius * radius);
    }
    public float getLength()
    {
        return (3.14f * 2 * radius);
    }

    public float getCentreX()
    {
        return centreX;
    }
    public float getCentreY()
    {
        return centreY;
    }
    public float getRadius()
    {
        return radius;
    }
    public String getName()
    {
        return name;
    }

    public void setCentreX(float centreX)
    {
        this.centreX = centreX;
    }
    public void setCentreY(float centreY)
    {
        this.centreY = centreY;
    }
    public void setRadius(float radius)
    {
        this.radius = radius;
    }
    public void setName(String name)
    {
        this.name = name;
    }
}
