package com.bantanger.tank03_;

import java.util.Vector;

/**
 * @author bantanger 半糖
 * @version 1.0
 */
public class EnemyTank extends Tank {
    Vector<Shot> shots = new Vector<>();
    public EnemyTank(int x, int y) {
        super(x, y);
    }
}
