/**
* The Circle class models a circle with a radius and color.
*/
public class Circle
{
    // private instance variable, not accessible from outside this class
    private double radius;
    // TASK 1.1.1
    // Adding variable color
    private String color;

    // Constructor (Overloaded)
    /** Constructs a Circle instance with default value for radius and color */
    public Circle() { // 1st (default) constructor
        radius = 1.0;
        color = "red";
    }

    /** Constructs a Circle instance with the given radius and default color */
    public Circle(double radius) { // 2nd constructor
        this.radius = radius;
    }

    // TASK 1.1.2
    /** Constructs a Circle instance with the given radius and given color */
    public Circle(double radius, String color) { // 3rd constructor
        this.radius = radius;
        this.color = color;
    }

    /** Returns the radius */
    public double getRadius() {
        return radius;
    }

    // TASK 1.1.3
    /** Returns the color */
    public String getColor() {
        return color;
    }

    /** Change the color value */
    public void setColor(String color) {
        this.color = color;
    }

    /** Returns the area of this Circle instance */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /**
     * Return a self-descriptive string of this instance in the form of
     * Circle[radius=?,color=?]
     */
    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }

}