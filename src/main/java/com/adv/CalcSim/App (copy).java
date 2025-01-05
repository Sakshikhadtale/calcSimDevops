package com.adv.CalcSim;

//import org.apache.log4j.BasicConfigurator;
/**
 * Hello world!
 */
class Calculator {
	private int a;
	private int b;
	
	public Calculator(int a, int b){
		this.a=  a;
		this.b = b;
	}
	
	public int sum() {
		int res = this.a+ this.b;
		return res;
	}
	
	public int diff() {
		return this.a-this.b;
	}
}
public class App {
    public static void main(String[] args) {
//    	BasicConfigurator.configure();

        System.out.println("Hello Calculatorss!");
        Calculator c = new Calculator(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
        
        System.out.println(c.sum());
        System.out.println(c.diff());
    }
}
