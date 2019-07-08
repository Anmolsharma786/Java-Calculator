/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author anmol
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner tc = new Scanner(System.in);
    Base var1 = new Base();
   
    System.out.print("press 1 to add, "
            + "press 2 to subtract, "
            + "press 3 to multiply,"
            + " press 4 to divide"
            );
    Scanner v = new Scanner(System.in);
    int opt = v.nextInt();
    if(opt==1){
    System.out.println("Enter your first Variable");
    int variable1= tc.nextInt();
    System.out.println("Enter your second Variable");
    int variable2= tc.nextInt();
    System.out.println("The sum of the two digit is "+var1.addition(variable1, variable2));  
    
    
    System.out.println("Enter your first Variable");
    double vare1 = tc.nextDouble();
    System.out.println("Enter your second Variable");
    double vare2 = tc.nextDouble();
    System.out.println("Enter your Third Variable");
    double vare3 = tc.nextDouble();
    
    System.out.println("the sum of three digit is"+var1.addition(vare1, vare2, vare3));
    }
    else if (opt==2){
    System.out.println("Enter your first Variable");
    int variable1= tc.nextInt();
    System.out.println("Enter your second Variable");
    int variable2= tc.nextInt();
    System.out.println("The subtract of the two digit is "+var1.subtraction(variable1, variable2));
    
     System.out.println("Enter your first Variable");
    double vare1 = tc.nextDouble();
    System.out.println("Enter your second Variable");
    double vare2 = tc.nextDouble();
    System.out.println("Enter your Third Variable");
    double vare3 = tc.nextDouble();
    
    System.out.println("the sum of three digit is"+var1.subtraction(vare1, vare2, vare3));
    
    }
    else if (opt==3){  
    System.out.println("Enter your first Variable");
    int variable1= tc.nextInt();
    System.out.println("Enter your second Variable");
    int variable2= tc.nextInt();
    System.out.println("The multiply of the two digit is "+var1.multiplication(variable1, variable2));
    
     System.out.println("Enter your first Variable");
    double vare1 = tc.nextDouble();
    System.out.println("Enter your second Variable");
    double vare2 = tc.nextDouble();
    System.out.println("Enter your Third Variable");
    double vare3 = tc.nextDouble();
    
    System.out.println("the sum of three digit is"+var1.multiplication(vare1, vare2, vare3));
    }
    else if (opt==4) {
    System.out.println("Enter your first Variable");
    int variable1= tc.nextInt();
    System.out.println("Enter your second Variable");
    int variable2= tc.nextInt();
    System.out.println("The divide of the two digit is "+var1.division(variable1, variable2));
    }
//    else if(opt==5) {
//    System.out.println("Enter your first Variable");
//    int variable1= tc.nextInt();
//    var1.prime(variable1);
//    }
//    
//    
//    else if(opt==6) {System.out.println("Enter your first Variable");
//    int variable1= tc.nextInt();
//    System.out.println("The sin of the two digit is "+var1.sin(variable1));
//    }
//    else if (opt == 7){
//    System.out.println("Enter your first Variable");
//    float variable1= tc.nextFloat();
//    System.out.println("Enter your second Variable");
//    float variable2= tc.nextFloat();
//    System.out.println("The sin of the two digit is "+var1.exponent(variable1, variable2));
//    }
//    else if(opt==8){
//    System.out.println("Enter your radius");
//    float variable1= tc.nextFloat();
//    System.out.println("the area of circle"+var1.areaCircle(variable1));
//    }
//    else if(opt == 9){
//    System.out.println("Enter your value of which you want cos");
//    double variable1= tc.nextDouble();
//    System.out.println("the cos of the value"+Base.cos(variable1));
//    }
    }
    
}
