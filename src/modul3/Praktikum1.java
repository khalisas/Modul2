/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3;

/**
 *
 * @author LENOVO
 */
public class Praktikum1 {
    static int tambah (int a, int b){
      return a+b;}  
    
    static double tambah (double a,double b){
        return a+b;
    }
    public static void main (String []args){
        int a = 3;
        int b = 4;
        int c = 8;
        double d = 0.5;
        
        System.out.println("1. "+(a+b));
        System.out.println("2. a<"+a+ ">+"+ "b<"+b+">="+(a+b));
        System.out.println("3. "+(a+b+c));
        System.out.println("4. "+(a+b+c-d));
        
        int t;
        t=tambah(4,5);
        System.out.println("Hasil dari 2 bilangan: "+t);
        
        double s;
        s=tambah(5.9,3.2);
        System.out.println("Hasil dari 2 bilangan: "+s);
    }
    
}
