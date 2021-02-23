package _06_inheritance.bai_tap.point2D_point3D;

public class Point3D extends Point2D{
    private float z=0.0f;

    public Point3D(){

    }

    public Point3D(float x,float y, float z){
        super(x,y);
        this.z=z;
    }
    public float getZ(){
        return this.z;
    }
    public void setZ(float z){
        this.z=z;
    }
    public void setXYZ(float x,float y,float z){
        setX(x);
        setY(y);
        this.z=z;
    }
    public String getXYZ(){
        return getXY()+" + z="+ getZ();
    }
    @Override
    public String toString(){
        return "Point3D :"
                +getXYZ();
    }
}
