package com.selenium;

public class VarargsJava {

    void Varargs_Demo(int... value){

        int[] arr = value;

        for(int val:arr){

            System.out.println(val);
        }

    }

    public static void main(String[] args) {

        VarargsJava varargsJava= new VarargsJava();
        varargsJava.Varargs_Demo(1,2,3,4);

    }
}
