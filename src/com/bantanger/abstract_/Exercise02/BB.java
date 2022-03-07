package com.bantanger.abstract_.Exercise02;

public class BB extends Template{
    private int num = 0;

    @Override
    public void job() {
        for (int i = 0; i < 800000; i++) {
            num += i;
        }
    }
}
