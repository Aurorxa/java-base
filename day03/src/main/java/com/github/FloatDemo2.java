package com.github;

public class FloatDemo2 {
    public static void main(String[] args) {

        float minValue = Float.MIN_VALUE;
        float maxValue = Float.MAX_VALUE;
        // float : [1.4E-45,3.4028235E38]
        System.out.println("float : [" + minValue + "," + maxValue + "]");

        double minValue2 = Double.MIN_VALUE;
        double maxValue2 = Double.MAX_VALUE;
        // double : [4.9E-324,1.7976931348623157E308]
        System.out.println("double : [" + minValue2 + "," + maxValue2 + "]");
    }
}
