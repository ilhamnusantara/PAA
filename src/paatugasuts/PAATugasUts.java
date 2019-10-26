/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paatugasuts;
import java.util.Scanner;
/**
 *
 * @author ilham-07010
 */
public class PAATugasUts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp = new Scanner(System.in);
        int[] id = new int[8];
        String[] nama = new String[8];
        int[] gaji = new int[8];
        int temp;
        System.out.print("Masukkan jumlah inputan : ");
        int pil = inp.nextInt();
        
        for(int i=0; i<pil; i++){
            System.out.print("id : ");
            int iD = inp.nextInt();
            System.out.print("nama : ");
            String name = inp.next();
            System.out.print("gaji : ");
            int upah = inp.nextInt();
            id[i]=iD;
            nama[i]=name;
            gaji[i]=upah;
        }
        
        for(int x=0; x<pil; x++){
            for(int y=0; y<pil; y++){
                if(id[x]<id[y]){
                    temp = id[x];
                    id[x] = id[y];
                    id[y] = temp;
                }
            }
        }
        
        
        for(int j=0; j<pil; j++){
            System.out.println(id[j]);
            System.out.println(nama[j]);
            System.out.println(gaji[j]);
        }
    }
    
}
