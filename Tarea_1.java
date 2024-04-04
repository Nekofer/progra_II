/*

 */
package tarea_1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author josue
 */
public class Tarea_1 {

    /**
     * @param args the command line arguments
     */
     static Scanner PePe=new Scanner(System.in);
    public static void main(String[] args) {
        menu();
      
    }
    
    static void menu(){
       
        int opc = 0;
 
        do{
        System.out.println("------Menu------");
        System.out.println("---1.-Conversiones---");
        System.out.println("---2.-Fibonacci---");
        System.out.println("---3.-Vectores---");
        System.out.println("---4.-Triangulo de pascal---");
        System.out.println("---5.-Cadenas_1---");
        System.out.println("---6.-Cadenas_2---");
        System.out.println("---7.-Numero Aleatorio---");
        System.out.println("---8.-Vectores_2---");
        System.out.println("---9.-Matrices");
        System.out.println("---10.-Union de vectores");
        System.out.println("---11.-Numeros romanos");
        System.out.println("---12.-Exit---");
        System.out.println("Elige una opcion");
        opc=PePe.nextInt();
        
        switch(opc){
            case 1:
            Conversiones();
                break;
            case 2:
               Fibonacci();
                break;
             case 3:
          
               Vectores();
                break;
             case 4:
            Triangulo();
                break;
             case 5:
            cadena1();
                break;
             case 6:
            cadena2();
                break;
             case 7:
            Numeros_aleatorios();
                break;
             case 8:
            Vectores_2();
                break;
             case 9:
            Matrices();
                break;
             case 10:
            Union_de_vectores();
                break;
             case 11:
            Numeros_romanos();
                break;
             case 12:
                 System.out.println("Adios vuelva Pronto");
                break;
             default:
                 System.out.println("Mijo no le sabe a esto que se llama leer 7n7");
        }
        }while(opc!=12);
    }
   static void Conversiones(){
         int opc=1;
        float num1,numr;
        Scanner boo;
        boo=new Scanner(System.in);
        do{
        System.out.println("---Menu---");
        System.out.println("---1.-Convertir plg a cm---");
        System.out.println("---2.-Convertir de cm a plg---");
        System.out.println("---3.-Convertir fts a mts---");
        System.out.println("---4.-Convertir mts a fts---");
        System.out.println("---5.-Salir---");
        opc=boo.nextInt();
        
        switch(opc){
            case 1:
                System.out.println("Dame las pulgadas weon que quieres convertir a cm: ");
                num1=boo.nextFloat();
                numr=(float) (num1*2.54);               
                System.out.println("El resultado a cm es: "+numr);
                break;
            case 2: 
                System.out.println("Dame los centimetros weon que quieres convertir a plg: ");
                num1=boo.nextFloat();
                numr=(float) (num1/2.54);
                System.out.println("El resultado a plg es: "+numr);
                 break;
            case 3:
                System.out.println("Dame los fts weon que quieres convertir a mts: ");
                num1=boo.nextFloat();
                numr=(float) (num1/3.281);
                System.out.println("El resultado a mts es: "+numr);
                 break;
                 
            case 4: 
                System.out.println("Dame los mts weon que quieres convertir a fts: ");
                num1=boo.nextFloat();
                numr=(float) (num1*3.281);
                System.out.println("El resultado a mts es: "+numr);
                 break;
                 
            case 5: 
                 break;
                 
            default: System.out.println("No sabi leir weon ");
        }
        }while(opc!=5);
        }
   
   static void Fibonacci(){
       int tamanio, n1=0, n2=1 ,sum;
       System.out.println("Dime de cuanto quieres la secuencia: ");
       tamanio=PePe.nextInt();
       for(int i=0; i<=tamanio; i++){
           sum=n1+n2;
           System.out.println(sum+"-"+i);
           n1=n2;
           n2=sum;
       }
   }
   
   static void Vectores(){
    int [] vector = {2,3,5,78,100,1,8,9,777,4};
    int temporal = 0;
    for (int i = 0; i < vector.length; i++) {
        for (int j = 1; j < (vector.length - i); j++) {
            if (vector[j - 1] > vector[j]) {
                temporal = vector[j - 1];
                vector[j - 1] = vector[j];
                vector[j] = temporal;
            }
        }
    }
    System.out.println(Arrays.toString(vector)); 
   }
   
   static void Triangulo(){
       int n,elemento=0,k=0;
       System.out.println("Cuantos renglones quieres: ");
       n=PePe.nextInt();
       for(int i=0;i<=n;i++){
          for(int j=0;j<=k;j++){
              elemento=(factorial1(i))/(factorial1(j)*(factorial1(i-j)));
              System.out.print(" "+elemento);
          }
          k++;
           System.out.println("");
       }
      
   }
   
   static void cadena1(){
       
   }
   static void cadena2(){
       
   }
   static void Numeros_aleatorios(){
       int re,cont=0;
       boolean Rc = false;
        int num = (int)(Math.random()*10+1);
       
       do{
       System.out.println("Escriba el numero que cree que se trate:");
       re=PePe.nextInt();
            if(re!=num){
                System.out.println("Lo sentimos es erroneo :c");
            cont++;   
       }
       else{
                System.out.println("Es correcto el numero es: "+num+ " Y tu numero es:"+re);
                Rc=true;
       }
       }while(cont!=5 || Rc!=true);
   }
   static void Vectores_2(){
       int tc, ta ,tb,sel, in=0;
       int []vecta;
       int [] vectb;
       int [] vectC;
       boolean band= false;
       System.out.println("Tamanio del vector a; ");
       ta=PePe.nextInt();
       vecta=new int[ta];
       System.out.println("Tamanio del vector b");
       tb=PePe.nextInt();
       vectb=new int[tb];
       tc=ta+tb;
       vectC=new int[tc];
       do{
           System.out.println("---------Vectores---------");
           System.out.println("1.-------Llenar los vectores-------");
           System.out.println("2.-------Ordenar los vectores-------");
           System.out.println("3.-------Mezclar los vectores-------");
           System.out.println("4.-------Mostrar los vectores-------");
           System.out.println("5.-------Buscar los vectores-------");
           System.out.println("6.-------Salir-------");
           sel=PePe.nextInt();
        switch(sel){
            case 1:
                    for(int i=0; i< vecta.length;i++){
                        vecta[i]=(int) (Math.random()*100);
                        for(int j=0; j< vectb.length;i++){
                            vectb[j]=(int) (Math.random()*100);
                        }
                    }
            break;
            case 2:
               Arrays.sort(vecta);
                Arrays.sort(vectb);
                break;
            case 3:
                for(int i=0;i<vecta.length;i++){
                    vectC[i]=vecta[i];
                }
                in=0;
             for(int i=vecta.length;i<vectC.length;i++){
                 vectC[i]=vectb[in];
                 in++;
             }
             Arrays.sort(vectC);
             break;
            case 4:
                System.out.println("Vector a");
                for(int i=0; i< vecta.length;i++){
                    System.out.println("["+vecta[i]+"]");
                    System.out.println("");
                     }
                 System.out.println("Vector b");
                for(int i=0;i<vectb.length;i++){
                    System.out.println("["+vectb[i]+"]");
                    System.out.println("");
                }
                     System.out.println("Vector c");
                     for(int j=0;j<vectC.length;j++){
                        System.out.println("["+vectC[j]+"]");
                        System.out.println(""); 
                }
                break;
            case 5:
                System.out.println("Elemento a buscar");
                in=PePe.nextInt();
                for(int i=0;i<vectC.length;i++){
                    if(in==vectC[i]){
                        System.out.println("Elemento encontrado en la posicion"+i+1);
                        band=true;
                    }
                }
                break;
        }
       }
       while(sel!=6);
   }
   static void Matrices(){
       
   }
   static void Union_de_vectores(){
       
   }
  
   ///////////////////////////////////////////////////////////
  
   static int factorial1(int num){
       int factorial=1;
       for(int i=1; i<=num;i++){
           factorial=factorial*i;
       }
       return factorial;
   }
    
}
