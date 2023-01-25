package org.example;
import java.util.*;
import java.lang.*;
class Shape
{
    int length;
    int breadth;
    int height;
    int radius;
    Shape(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
        System.out.println("Area of the Rectangle: "+RectArea(length,breadth));
        System.out.println("perimeter of the Rectangle: "+Rectperimeter(length,breadth));
    }
    Shape(int breadth,int height,int side1,int side2,int side3)
    {
        this.breadth=breadth;
        this.height=height;
        System.out.println("Area of the Triangle: "+TriArea(breadth,height));
        System.out.println("perimeter of the Triangle: "+Triperimeter(side1,side2,side3));
    }
    Shape(int radius)
    {
        this.radius=radius;
        System.out.println("Area of the Circle: "+CirArea(radius));
        System.out.println("Circumference of the Circle: "+Circumference(radius));
    }
    public int RectArea(int length,int breadth)
    {
        int result1;
        result1=length*breadth;
        return result1;

    }
    public float TriArea(int breadth,int height)
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
    public int Triperimeter(int side1,int side2,int side3)
    {
        int result;
        result=side1+side2+side3;
        return result;
    }
    public  double Circumference(int radius)
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
            System.out.println("\n1)Rectangle\n2)Triangle\n3)circle\n4)exit");
            System.out.println("Enter your choice: ");
            choice=sc.nextInt();
            if(choice==1)
            {
                System.out.println("Enter the length: ");
                length=sc.nextInt();
                System.out.println("Enter the breadth: ");
                breadth=sc.nextInt();
                Shape shape=new Shape(length,breadth);
                System.out.println("Area of the Rectangle: "+shape.RectArea(shape.length,shape.breadth));
                System.out.println("perimeter of the Rectangle: "+shape.Rectperimeter(shape.length,shape.breadth));
            }
            else if(choice==2)
            {
                //System.out.println("Enter the length: ");
                //length=sc.nextInt();
                System.out.println("Enter the breadth: ");
                breadth=sc.nextInt();
                System.out.println("Enter the height: ");
                height=sc.nextInt();
                System.out.println("Enter the side1: ");
                side1=sc.nextInt();
                System.out.println("Enter the side2: ");
                side2=sc.nextInt();
                System.out.println("Enter the side3: ");
                side3=sc.nextInt();
                Shape shape=new Shape(breadth,height,side1,side2,side3);
                System.out.println("Area of the Triangle: "+shape.TriArea(shape.breadth,shape.height));
                System.out.println("perimeter of the Triangle: "+shape.Triperimeter(side1,side2,side3));
            }
            else if(choice==3)
            {

                System.out.println("Enter the radius: ");
                radius=sc.nextInt();
                Shape shape=new Shape(radius);
                System.out.println("Area of the Circle: "+shape.CirArea(shape.radius));
                System.out.println("Circumference of the Circle: "+shape.Circumference(shape.radius));
            }
            else if(choice==4)
            {
                break;
            }

        }

    }
}
