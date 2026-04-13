package com.junitjava;


public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    public int getAdd(int a,int b){
        return a+b;
    }
    public char checkGrade(int marks) {
    	if(marks>90) {
    		return 'A';
    		}
    	else if(marks >70) {
    		return 'B';
    		
    	}
    	else
    		return 'c';
    }
    public boolean experienceTest(int exp) {
    	
    	if (exp>5) {
    		return true;
    		
			
		} else {
			return false;

		}
    }
}

