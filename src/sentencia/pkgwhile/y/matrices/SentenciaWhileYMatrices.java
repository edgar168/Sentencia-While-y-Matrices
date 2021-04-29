/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentencia.pkgwhile.y.matrices;

/**
 *
 * @author Erick
 */
import java.util.Scanner;
public class SentenciaWhileYMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      //1.- Suma consecutiva del 0 a 10
      System.out.println("1.-Suma consecutiva del 0 al 10" );
      int cont = 0;
      int suma= 0;
      System.out.println("la lista es de:" );
      while (cont <=10){
           
      System.out.println("el numero "+cont );
                
            suma+= cont;
            cont++;
            System.out.println("="+suma);
            System.out.println("+");
            }  
      System.out.println(".................................................." );
      //2.-Calcular el factorial de 10
            System.out.println("2.-Calcular el factorial de 10" );     
            int cont2 = 1;
            int factorial=1;
            System.out.println("la lista es de:" );
            while (cont <=10){
            System.out.println("el numero "+cont );
                
            factorial*= cont;
            cont++;
            System.out.println("= "+factorial);
       
        }
       //3.-El factorial de un número que sea introducido por el usuario
 System.out.println(".................................................." );
 System.out.println("3.-El factorial de un número que sea introducido por el usuario" );   
 Scanner insertar=new Scanner(System.in);
    int cont3=1;
    System.out.println("ingrese un numero" ); 
    cont3=insertar.nextInt();
    int sumar=1;
    for(int i=1;i<=cont3;i++){
    sumar*=i;
        
    }
    System.out.println("El factorial de "+cont3+ " es igual a : "+sumar); 
    System.out.println(".................................................." );
    
        //4.-La media de la suma del 0 hasta el número introducido por el usuario
   
     System.out.println("4.-La media de la suma del 0 hasta el número introducido por el usuario" ); 
     int num=0;
     int sum=0;
     int media=0;
     System.out.println("ingrese un numero" ); 
     num=insertar.nextInt();
     for(int i=0;i<=num;i++){
     sum+=i;   
    }
     media=sum/(num+1);
 System.out.println("La media de la suma de 0 hasta "+num+ " es igual a : "+media);
 System.out.println(".................................................." );
 
         //5.-Suma, promedio, y cual es el mayor y menor de un n introducido por el usuario leido n veces
     System.out.println("5.-Suma, promedio, y cual es el mayor y menor de un n introducido por el usuario leido n veces" ); 
     int n=0;
     int s=0;
     int prom=0;
     int mayor=0;
     int menor = 0;
     System.out.println("ingresa una cantidad de numeros a ingresar" );  
     n=insertar.nextInt();
     System.out.println("inicia la suma" );
     for(int i=0;i<=n;i++){
     s+=i; 
     prom=s/n; 
     System.out.println("+ "+i+" es igual a: "+ s);
    }
        if (n>mayor) {
            mayor=n;
        } 
        if (n<=menor) {
            menor=n;
        }
            
System.out.println("El promedio de "+s+" es de: "+prom);
System.out.println("el numero mayor introducido es "+ mayor);
System.out.println("el numero mayor introducido es "+menor);

System.out.println(".................................................." );

//6.-Arreglo de los dias de la semana
System.out.println("6.-Arreglo de los dias de la semana" );
String [] semana;
semana= new String[7];
semana[0]="lunes";
semana[1]="martes";
semana[2]="miercoles";
semana[3]="jueves";
semana[4]="viernes";
semana[5]="sabado";
semana[6]="domingo";
        for (String dias:semana) {
        System.out.println(dias);
        }
System.out.println(".................................................." );
//7.- Codigo de Star War
System.out.println("7.- Codigo de Star War" ); 
String[][] sPers; 
sPers = new String[16][3]; 
sPers[0][0] = "Luke Skywalker"; 
sPers[0][1] = "172"; 
sPers[0][2] = "male";  
sPers[1][0] = "R2-D2"; 
sPers[1][1] = "96"; 
sPers[1][2] = "n/a";  
sPers[2][0] = "C-3PO"; 
sPers[2][1] = "167"; 
sPers[2][2] = "n/a";  
sPers[3][0] = "Darth Vader"; 
sPers[3][1] = "202"; 
sPers[3][2] = "male";  
sPers[4][0] = "Leia Organa"; 
sPers[4][1] = "150"; 
sPers[4][2] = "female";  
sPers[5][0] = "Owen Lars"; 
sPers[5][1] = "178"; 
sPers[5][2] = "male";  
sPers[6][0] = "Beru Whitesun lars"; 
sPers[6][1] = "165"; 
sPers[6][2] = "female";  
sPers[7][0] = "R5-D4"; 
sPers[7][1] = "97"; 
sPers[7][2] = "n/a";  
sPers[8][0] = "Biggs Darklighter"; sPers[8][1] = "183"; 
sPers[8][2] = "male";  
sPers[9][0] = "Obi-Wan Kenobi"; 
sPers[9][1] = "182"; 
sPers[9][2] = "male";  
sPers[10][0] = "Yoda"; 
sPers[10][1] = "66"; 
sPers[10][2] = "male";  
sPers[11][0] = "Jek Tono Porkins"; 
sPers[11][1] = "180"; 
sPers[11][2] = "male";  
sPers[12][0] = "Jabba Desilijic Tiure";
sPers[12][1] = "175"; 
sPers[12][2] = "hermaphrodite";  
sPers[13][0] = "Han Solo"; 
sPers[13][1] = "180"; 
sPers[13][2] = "male";  
sPers[14][0] = "Chewbacca"; 
sPers[14][1] = "228"; 
sPers[14][2] = "male";  
sPers[15][0] = "Anakin Skywalker"; 
sPers[15][1] = "188"; 
sPers[15][2] = "male";  
        for (int i = 0; i <16; i++) {
          for (int j = 0; j <3; j++) {
            System.out.println("sPers[i][j]= "+sPers[i][j]);
        }
          
        }
System.out.println(".................................................." );
//8.-Gato
System.out.println("8.-Gato" );  
int matriz[][]= new int[3][3];
matriz[0][0]=1;
matriz[0][1]=2;
matriz[0][2]=3;
matriz[1][0]=4;
matriz[1][1]=5;
matriz[1][2]=6;
matriz[2][0]=7;
matriz[2][1]=8;
matriz[2][2]=9;
 for (int i = 0; i <16; i++) {
          for (int j = 0; j <3; j++) {
             }
          }
System.out.println("...............");
System.out.println("|"+matriz[0][0]+"|"+matriz[0][1]+"|"+matriz[0][2]+"|");
System.out.println("...............");
System.out.println("|"+matriz[1][0]+"|"+matriz[1][1]+"|"+matriz[1][2]+"|");
System.out.println("...............");
System.out.println("|"+matriz[2][0]+"|"+matriz[2][1]+"|"+matriz[2][2]+"|");
System.out.println("...............");


    }
    
}
