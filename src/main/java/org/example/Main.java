package org.example;
import java.util.*;
import java.lang.*;
import java.util.logging.Level;
import java.util.logging.Logger;
class Shape
{
    private static final Logger LOGGER=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    int length;
    int breadth;
    int height;
    int radius;
    Shape(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    Shape(int breadth,int height,int side1,int side2,int side3)
    {
        this.breadth=breadth;
        this.height=height;
    }
    Shape(int radius)
    {
        this.radius=radius;
    }
    public int RectArea(int length,int breadth)
    {
        int result1;
        result1=length*breadth;
        return result1;

    }public float TriArea(int breadth,int height)
    {
        float result;
        result=(float)(breadth*height)/2;
        return result;
    }
    public double CirArea(int radius)
    {
        double result;
        result=Math.PI*radius*radius;
        return result;
    }
    public int Rectperimeter(int length,int breadth)
    {
        int result;
        result=2*(length+breadth);
        return result;
    }
    public int TRI_PERIMETER(int side1,int side2,int side3)
    {
        int result;
        result=side1+side2+side3;
        return result;
    }
    public  double CIRCUM_FERENCE(int radius)
    {
        double result;
        result=2*(Math.PI)*radius;
        return result;
    }
    public static void main(String[] args)
    {
        int choice;
        int length;
        int breadth;
        int height;
        int radius;
        int side1;
        int side2;
        int side3;
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            LOGGER.log(Level.INFO,"\n1)Rectangle\n2)Triangle\n3)circle\n4)exit");
            LOGGER.log(Level.INFO,"Enter your choice: ");
            choice=sc.nextInt();
            if(choice==1)
            {
                LOGGER.log(Level.INFO,"Enter the length: ");
                length=sc.nextInt();
                LOGGER.log(Level.INFO,"Enter the breadth: ");
                breadth=sc.nextInt();
                Shape shape=new Shape(length,breadth);
                LOGGER.log(Level.INFO,Integer.toString(shape.RectArea(shape.length,shape.breadth)),"Area of the Rectangle: "+shape.RectArea(shape.length,shape.breadth));
                LOGGER.log(Level.INFO,Integer.toString(shape.Rectperimeter(shape.length,shape.breadth)),"perimeter of the Rectangle: "+shape.Rectperimeter(shape.length,shape.breadth));
            }
            else if(choice==2)
            {
                //System.out.println("Enter the length: ");
                //length=sc.nextInt();
                LOGGER.log(Level.INFO,"Enter the breadth: ");
                breadth=sc.nextInt();
                LOGGER.log(Level.INFO,"Enter the height: ");
                height=sc.nextInt();
                LOGGER.log(Level.INFO,"Enter the side1: ");
                side1=sc.nextInt();
                LOGGER.log(Level.INFO,"Enter the side2: ");
                side2=sc.nextInt();
                LOGGER.log(Level.INFO,"Enter the side3: ");
                side3=sc.nextInt();
                Shape shape=new Shape(breadth,height,side1,side2,side3);
                LOGGER.log(Level.INFO,Float.toString(shape.TriArea(shape.breadth,shape.height)),"Area of the Triangle: "+shape.TriArea(shape.breadth,shape.height));
                LOGGER.log(Level.INFO,Integer.toString(shape.TRI_PERIMETER(side1,side2,side3)),"perimeter of the Triangle: "+shape.TRI_PERIMETER(side1,side2,side3));
            }
            else if(choice==3)
            {
                LOGGER.log(Level.INFO,"Enter the radius: ");
                radius=sc.nextInt();
                Shape shape=new Shape(radius);
                LOGGER.log(Level.INFO,Double.toString(shape.CirArea(shape.radius)),"Area of the Circle: "+shape.CirArea(shape.radius));
                LOGGER.log(Level.INFO,Double.toString(shape.CIRCUM_FERENCE(shape.radius)),"Circumference of the Circle: "+shape.CIRCUM_FERENCE(shape.radius));
            }
            else if(choice==4)
            {
                break;
            }
        }
    }
}
