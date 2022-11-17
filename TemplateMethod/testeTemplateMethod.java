
package TemplateMethod;

import java.util.Scanner;


public class testeTemplateMethod {
    public static void main(String[] args) {
        String language;
        Compiler compiler;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Chose your language:");
        language = scan.next().toLowerCase();
        
        if(language.equals("ios")) {
            compiler = new iOSCompiler();
        } else if(language.equals("android"))  {
            compiler = new AndroidCompiler();
        } else {
            System.out.println("Linguagem nao encontrada");
        }
        
    }
}
