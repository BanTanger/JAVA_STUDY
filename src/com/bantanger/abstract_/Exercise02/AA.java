package com.bantanger.abstract_.Exercise02;

public class AA extends Template{
    private int n = 45;
    @Override
    public void job(){
        // 以毫秒为单位
       Fn(n);
    }
    public int Fn(int n){
        if (n == 1 || n == 2)
            return 1;
        return Fn(n - 1) + Fn(n-2);
    }
}
