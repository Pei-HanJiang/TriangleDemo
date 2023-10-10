package org.example;


public class Triangle {
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    int checkTriangle(int a, int b, int c) throws TriangleException{
        //檢查是否合法
        if(a <= 0 || b <= 0 || c <= 0){
            throw new TriangleException(a,b,c);
        }

        if(a+b <= c || a+c <= b || b+c <= a){
            throw new TriangleException(a,b,c);
        }

        //正三角形
        if(a == b && b == c){
            return 0;
        }
        //等腰三角形
        else if (a == b || b == c || a == c) {
            return 1;
        }
        //非特殊三角形
        return 2;
    }

}

