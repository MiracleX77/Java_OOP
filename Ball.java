public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x,float y,int radius,float xDelta,float yDelta){
        this.x=x;
        this.y=y;
        this.radius=radius;
        this.xDelta=xDelta;
        this.yDelta=yDelta;
    }
    public float getX(){
        return x;
    }
    public float getY(){
        return y;
    }
    public void setX(float new_x){
        x=new_x;
    }
    public void setY(float new_y){
        y=new_y;
    }
    public int getRadius(){
        return radius;
    }
    public float getXDelta(){
        return xDelta;
    }
    public float getYDelta(){
        return yDelta;
    }
    public void setRadius(int new_r){
        radius=new_r;
    }
    public void setXDelta(float new_xd){
        xDelta=new_xd;
    }
    public void setYDelta(float new_yd){
        yDelta=new_yd;
    }
    public void move(){
        x+=xDelta;
        y+=yDelta;
    }
    public void reflectHorizontal(){
        xDelta=-1*xDelta;
    }
    public void reflectVertical(){
        yDelta=-1*yDelta;
    }
    public String toString(){
        return "Ball[("+x+","+y+"),speed=("+xDelta+","+yDelta+")]";
    }

}
