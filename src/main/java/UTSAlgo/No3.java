package UTSAlgo;
import java.util.Scanner;
public class No3 {
    public static void main(String[] args) {
         //PEMBENTUKAN MATRIX A
        Scanner data = new Scanner(System.in);
        System.out.println("Masukkan baris Matrix A : ");
        int baris = data.nextInt();
        System.out.println("Masukkan Kolom Matrix A : ");
        int kolom = data.nextInt();
        int tampung[][] = new int [baris][kolom];
        System.out.println("Masukkan elemen matrix A : ");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.println("Matrix A ["+i+","+j+"]");
                tampung[i][j] = data.nextInt();   
            }            
        }
        //PEMBENTUKAN MATRIX B
        Scanner data2 = new Scanner(System.in);
        System.out.println("Masukkan baris Matrix B : ");
        int baris2 = data2.nextInt();
        System.out.println("Masukkan Kolom Matrix B : ");
        int kolom2 = data2.nextInt();
        int tampung2[][] = new int [baris2][kolom2];
        System.out.println("Masukkan elemen matrix B : ");
        for (int i = 0; i < baris2; i++) {
            for (int j = 0; j < kolom2; j++) {
                System.out.println("Matrix B ["+i+","+j+"]");
                tampung2[i][j] = data2.nextInt();   
            }            
        }
        
         //HASIL MATRIX A
        System.out.println("Hasil Matrix A :");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(tampung[i][j]+" ");
            }
            System.out.println();
        }
        
        //HASIL MATRIX B
        System.out.println("Hasil Matrix B :");
        for (int i = 0; i < baris2; i++) {
            for (int j = 0; j < kolom2; j++) {
                System.out.print(tampung2[i][j]+" ");
            }
            System.out.println();
        }
        
         //TRANPOSE MATRIX A
        System.out.println("Hasil transpose Matrix A : ");
        int tranpose [][] = new int [10][10];
        for (int i = 0; i < tampung.length; i++) {
            for (int j = 0; j < tampung[0].length; j++) {
                tranpose[j][i] = tampung[i][j];
            }
        }
        for (int i = 0; i < tampung[0].length; i++) {
            for (int j = 0; j < tampung.length; j++) {
                System.out.print(tranpose[i][j]+" ");
            }
            System.out.println();
        }
        //TRANSPOSE MATRIX B
         System.out.println("Hasil transpose Matrix B : ");
        int tranpose2 [][] = new int [10][10];
        for (int i = 0; i < tampung2.length; i++) {
            for (int j = 0; j < tampung2[0].length; j++) {
                tranpose2[j][i] = tampung2[i][j];
            }
        }
        for (int i = 0; i < tampung2[0].length; i++) {
            for (int j = 0; j < tampung2.length; j++) {
                System.out.print(tranpose2[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    
}
