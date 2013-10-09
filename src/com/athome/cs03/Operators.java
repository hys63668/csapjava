package com.athome.cs03;

/**
 * Topic
 *
 * - 算术运算符
 * - 关系运算符
 * - 逻辑运算符
 * - 赋值运算符
 */
public class Operators {

    public static void main(String[] args){
        //arithmetic();
        //relational();
        //logical();
        assignment();
    }

    public static void arithmetic(){

        int a = 7, b = 2;

        System.out.println("\n+");
        System.out.println( 2 + 3 );
        System.out.println( "2" + "3" );
        System.out.println( a + b );

        System.out.println("\n-");
        System.out.println(4 - 5);
        System.out.println(a - b);

        System.out.println("\n*");
        System.out.println(2 * 10);
        System.out.println(a * b);

        System.out.println("\n/");
        System.out.println(10/2);
        System.out.println(a / b);// 3 not 3.5
        System.out.println(7.0 / 2);


        System.out.println("\n%");
        System.out.println(7%2);
        System.out.println(a % b);
    }

    public static void relational(){
        int a = 5;
        int b = 2;

        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a==b);//two operators
        System.out.println(a!=b);

        System.out.println("a"=="b");

    }

    public static void logical(){
        /*
        && 与(and)
        || 或(or)
        !  非(not)
         */

        System.out.println(true && true); // true
        System.out.println(false && true); // false

        System.out.println(true || false); // true

        System.out.println(!true);// false
        System.out.println(!false);// true

        System.out.println(5 >2 && 2 >1);
    }

    public static void assignment(){

        //声明变量时赋值
        int x = 2;

        System.out.println(x);

        x += 3;
        System.out.println(x);

        x++;
        System.out.println(x);

        x--;
        System.out.println(x);

    }
}
