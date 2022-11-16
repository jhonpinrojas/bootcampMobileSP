/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minireto1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jhon pinedo
 */
public class Challenge1 {
     Random random = new Random();
     Scanner scn= new Scanner(System.in) ;
     String word,randomfragment="",randomnumber="",option,organizednumber="";
     
    public void RamdonNumbergenerator(){
      System.out.println("Ingrese cadena de texto TipoA o TipoB: " );
      //The option entered in the console is register in the String word
      word=scn.nextLine();
      int s=0;
      //with the random method an 8-digit string number is generated
      for (int i=0;i<8;i++){
        randomfragment=randomfragment+random.nextInt(9);   
       }
       //enclose the code inside a while loop until a correct option is entered in the console
       while (s<1){
       //compares if the string registred in the console is TypeA
       if(word.equals("TipoA")){
           randomnumber="54"+randomfragment;
           s=1;
       }
       //compares if the string registred in the console is TypeB
       else if (word.equals("TipoB")){  
           randomnumber="08"+randomfragment;
           s=1;
       }else{
           //asks to enter an option again if this is different from TypeA or TypeB
           System.out.println("Opcion incorrecta " );
           System.out.println("Ingrese cadena de texto TipoA o TipoB: " );
           word=scn.nextLine();
           s=0;
       }
       }           
       //print the random number generated
        System.out.println(randomnumber) ;
     }
     
    public void Numberorganizator(){
        System.out.println("Ingrese orden de la matriz Asc o Desc: " );
        //The option entered in the console is register in the String option
        option=scn.nextLine();
        int []numers=new int[8];
        int s= 0;
        //with the random method an 8-digit array number is generated
        for (int i=0;i<8;i++){
        numers[i]= random.nextInt(99);   
        }
        while (s<1){
         //compares if the string registred in the console is Asc 
         if(option.equals("Asc")){
         
                    //Example Array To sort.
            for (int i = 0; i < numers.length; i++) 
            {      //Loop over java Array  outer Loop use
                for (int j = i + 1; j < numers.length; j++) 
                {  // Loop over java array
                    int tmp = 0;                            //tempraory variable in order to compare.
                    if (numers[i] < numers[j]) 
                    {          //compare outer loop object with inner loop 
                        tmp = numers[i];               // if greater than swapping.
                        numers[i] = numers[j];            // Swaping code here.
                        numers[j] = tmp;
                    }
                }
             //add to the string organizednumber the generated and organized random numbers 
             if (i==7){
             organizednumber=organizednumber+ numers[i];
             }else{
             organizednumber=organizednumber+ numers[i]+",";
             } 
            }
              
          //print the organized array number generated
          System.out.println(organizednumber);  
          // S takes the value 1 to exit the while loop
         s=1;
        }
        //compares if the string regitred in the console is Desc 
        else if (option.equals("Desc")){  
            
              //Example Array To sort...
            for (int i = 0; i < numers.length; i++) 
            {      //Loop over java Array  outer Loop use
                for (int j = i + 1; j < numers.length; j++) 
                {  // Loop over java array
                    int tmp = 0;                            //tempraory variable in order to compare.
                    if (numers[i] > numers[j]) 
                    {          //compare outer loop object with inner loop 
                        tmp = numers[i];               // if greater than swapping.
                        numers[i] = numers[j];            // Swaping code here.
                        numers[j] = tmp;
                    }
                }
             //add to the string organizednumber the generated and organized random numbers     
             if (i==7){
             organizednumber=organizednumber+ numers[i];
             }else{
             organizednumber=organizednumber+ numers[i]+",";
             } 
            }
            //print the organized array number generated
            System.out.println(organizednumber);  
         // S takes the value 1 to exit the while loop
         s=1;
        }
        //asks to enter an option again if this is different from Asc or Desc    
        else{
         System.out.println("Opcion incorrecta " );
         System.out.println("Ingrese orden de la matriz Asc o Desc: " );
         option=scn.nextLine();
         s=0;
            }
       }
    
    
    }
}
