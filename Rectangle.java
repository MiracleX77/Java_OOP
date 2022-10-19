public class Rectangle {
    private float length;
    private float width;

    public Rectangle(){
        length=1.0f;
        width=1.0f;
    }

    public Rectangle(float l,float w){
        length=l;
        width=w;
    }

    public float getLength(){
        return length;
    }

    public void setLength(float new_l){
        length=new_l;
    }

    public float getWidth(){
        return width;
    }

    public void setWidth(float new_w){
        width=new_w;
    }

    public double getArea(){
        return width*length;
    }

    public double getPerimeter(){
        return  (width+length)*2;
        
    }
    public String toString(){
        return "Rectangle[length="+length+" ,width="+width+"]";
    }
}