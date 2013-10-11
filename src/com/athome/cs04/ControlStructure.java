package com.athome.cs04;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: kevinguo
 * Date: 10/11/13
 * Time: 10:03 AM
 * To change this template use File | Settings | File Templates.
 */
public class ControlStructure {

    public static void main(String[] args){

        //读取用户输入
        int input = 0;
        try{
            System.out.println("Please enter a integer:");
            //从终端读入要计算的值
            Scanner in = new Scanner(System.in);
            input = in.nextInt();

        } catch(Exception ex){
            ex.printStackTrace();
        }

        ifBigger(input);
    }

    //if 判断
    public static void ifBigger(int input){
        if (input>10){
            System.out.println("Bingo! Your input is bigger than 10");
        }else{
            System.out.println("Sorry! Your input is equal or less than 10");
        }
    }

    //for 循环
    public static void forLoop(int times){
        System.out.println("Print hello for " + times +" times");

        //for(初始化;执行条件;更新){循环体}
        for (int i = 0; i <times; i++){
            System.out.println("Hello!");
        }
    }

    public static void whileLoop(int input){
        //while(执行条件){循环体, 需要更新}
        while (input >0){
            System.out.print('*');
            input--;
        }
    }

}
