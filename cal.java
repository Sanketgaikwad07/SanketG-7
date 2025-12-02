package in.bank.util;

import in.bank.geometry.* ;


public class calculator {

    public static void main(String[] args) {
        
        circle   cir=new circle(5.5);
        Rectangle react=new Rectangle(10,5);
        double cirarea=Math.PI *Math.pow(cir.radius,2);
        double reacArea = react.breadth*react.length;

        System.out.printf("Area of the circle is=%d",cirarea,reacArea);


    }

}
