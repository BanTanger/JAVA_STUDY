package com.bantanger.customexception_;

/**
 * @author Bantanger 半糖先生
 * @version 1.0
 */
public class Homework {
    public static void main(String[] args) {
        // 三种可能错误处理
        // 1. 接收命令行的两个参数(整数) --> ArrayIndexOutOfBoundsException
        // 2. 所传入的参数是整数 --> NumberFormatException
        // 3. 被除数必须大于0  --> ArithmeticException
        // 使用args命令行参数配置，这样才能去处理传入参数个数
        try {
            if (args.length != 2){
                throw new ArrayIndexOutOfBoundsException("参数个数不对");
            }
            // 先把接收到的参数转换成整数
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            double res = cal(x,y);
            System.out.println(res);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e){
            System.out.println("参数格式不对，需要整数");
        } catch (ArithmeticException e) {
            System.out.println("出现了除0的异常");
        }
    }
    public static double cal(int x,int y){
        return x / y;
    }
}
