/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eksiksayı;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class EksikSayı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sayıDizisi,sayı,strSayı;
        int onlarB,birlerB,sayıInt;
        boolean yeniSayıVarsa = true;
        System.out.println("sayı dizisini giriniz");
        sayıDizisi = input.next();
        sayı = sayıDizisi.substring(0,2);
        onlarB = sayıDizisi.charAt(0)-48;
        birlerB = sayıDizisi.charAt(1)-48;
        sayıInt = onlarB*10+birlerB;
        while(yeniSayıVarsa){
            sayıInt++;
            strSayı = sayıInt+"";
            if(!sayıDizisi.contains(strSayı)){
                yeniSayıVarsa = false;
            }
        }System.out.println(sayıInt);
    }
    
}
