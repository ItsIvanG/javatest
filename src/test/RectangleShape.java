package test;
public class RectangleShape {
    private String color;
    private boolean filled;
    private double width;
    private double length;
    public RectangleShape(){
        color = "White";
        filled = false;
        width = 10;
        length = 10;
    }

    public void Area(){
        System.out.println("Rectangle Area: "+(width*length));
    }

    public RectangleShape(double w, double l, String c, boolean f){
        width = w;
        length = l;
        color = c;
        filled = f;
    }

    public void display(){
        System.out.println("Rectangle Color: "+color+"\nRectangle Filled: "+filled+"\nRectangle Width: "+width+"\nRectangle Height: "+length);
    }

    public String getColor(){
        return color;
    }

    public boolean getFilled(){
        return filled;
    }

    public double getWidth(){
        return width;
    }

    public double getLength(){
        return length;
    }

    public void setColor(String c)
    {
        color = c;
    }

    public void setFilled(boolean f)
    {
        filled = f;
    }

    public void setWidth(double w)
    {
        width = w;
    }

    public void setLength(double h)
    {
        length = h;
    }

}