package curs2;

public class Rectangle {
    //variable
    private int length, width;
    //constructor
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;

    }

    //metoda
    public int calculateArea(){
        return length*width;
    }

}
