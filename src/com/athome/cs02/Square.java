/**
 * Topic
 *
 * - 函数: 定义
 * - 变量: 定义 赋值 范围
 * - 基本类型: int, float, string
 */
package com.athome.cs02;

import java.util.Scanner;

public class Square {

    /**
     *
     * 函数基本要素:
     * - 函数名
     * - 输入值
     * - 返回值
     *
     * 注意:
     * - 输入参数可以作为变量直接在函数内被使用
     * - 输入参数可以是多个
     */
    private static int square(int input){

        /**
         * 变量声明
         *
         * 语法:
         *     [type] [name]; 只声明
         *     [type] [name] = [value]; 声明并赋值
         */

        int value;
        value = input * input;//赋值

        //返回值必须与函数定义的返回类型一致
        return value;
    }



    public static void main(String[] args){

        //声明整型(int)变量 input 和 设定初始值, 可以修改数值打印出不同的结果
        int input = 4;

        try{
            System.out.println("Please enter a integer:");
            //从终端读入要计算的值
            Scanner in = new Scanner(System.in);
            input = in.nextInt();

        } catch(Exception ex){
            ex.printStackTrace();
        }


        //调用square函数，并且把结果赋值给result变量
        int result = square(input);

        //声明字符串类型，字符串可以用加号来表示连接
        String information = "Square of " + input + " = " + result;

        System.out.print(information);

    }

}
