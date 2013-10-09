/**
 * package: 包
 *
 * 定义:
 * 包内包含有一系列类，它们在单一的名称空间之下被组织在一起。这个名称空间就是包名 如以下的'com.athome.cs01'
 * 相关功能的类通常放在同一个包下
 *
 * 语法:
 *   package xxx.xxx.xxx;
 *
 * 注意:
 *  - 包名以'.'分隔，全小写
 *  - 类文件必须放在对应的文件夹下, 如com/athome/cs01
 */
package com.athome.cs01;

/**
 * 注释类型
 *  - 块注释
 *  - 行注释 //
 */


/**
 * class: 类
 *
 * 定义:
 *   Java程序最基础的单元, 包含程序逻辑
 *
 * 语法:
 *   public class XXX {}
 *
 * 注意:
 *   - 命名规则，字母，数字，CamelCase
 *   - 文件名与类名必须一致
 */

//This is a HelloWorld class
public class HelloWorld {

    /**
     *
     * main: 主函数
     *
     * 定义:
     *   执行 java [class] 被直接执行的函数
     *
     * 语法:
     *   public static void main(String[] args){} //必须记住
     *
     * 注意:
     *   - 一个类只会有一个主函数
     */
    public static void main(String[] args){

        /**
         *  Function: 函数
         *
         *  定义：
         *      给定输入 执行逻辑 返回结果
         *      作用：重复使用，封装
         *
         *  语法:
         *    - 定义： public/private [type] [name]{}
         *    - 调用: name();
         *
         *  注意：
         *      - public/private 修饰符用于定义函数被调用
         */


        /**
         *   System out 语句
         *   print 是一个函数
         */

        System.out.print(" Hello World! ");

    }
}
