package UTSAlgo;
public class No1 {
    public static void main(String[] args) {
        int [] A = {3,10,4,2,8,13};
        System.out.println("Data sebelum diurutkan : ");
        No1.print(A);
        No1.selectshort(A);
        System.out.println("Data setelah diurutkan : ");
        No1.print(A);
        No1.search(A);
        System.out.println("Moh.Faizal Ilham Falakh");
    }
    public static void print(int []A){
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
   public static void selectshort(int[]B){
        int littleindex;
        int pass;
        int j;
        int temp;
        for ( pass = 0; pass < B.length -1; pass++) {
            littleindex = pass;
            for (j = pass + 1; j < B.length; j++) {
                if(B[j]<B[littleindex]){
                    littleindex = j;
                }
                
            }
            temp = B[pass];
            B[pass] = B[littleindex];
            B[littleindex] = temp;
        }
         
        }
    public static void search(int [] A){
        int Data;
        int key = 8;
        int batasawal = 0;
        int batasakhir = A.length -1;
        int ketemu = 0;
        int point = 0;
        while ((batasawal<=batasakhir)&&(ketemu ==0)){
            point = (batasawal+batasakhir)/2;
            System.out.println("Pointer berada di : "+point);
            if (A[point]==key){
                ketemu = 1;
                
            }else{
                if (A[point] > key){ 
                    System.out.println("Cari di kiri");
                    batasakhir = point -1;
                }else{
                    System.out.println("Cari di kanan");
                    batasawal = point + 1;
                }
            }
        }
        if(ketemu ==1){
            System.out.println("Data ditemukan pada indeks ke "+point+" dan baris ke "+(point+1));
        }else{
            System.out.println("Data tidak ditemukan");
        }
      
    }
    
}
