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
        int[] id = new int[100];
        String[] nama = new String[100];
        int[] gaji = new int[100];
        int pil = 0,temp, temp2;
        String temp1;
        System.out.println("PILIH MENU");
        System.out.println("1. Masukkan Data");
        System.out.println("2. Sorting Data");
        System.out.println("3. Search Data");
        System.out.print("Pilih menu : ");
        int pilihan = inp.nextInt();
        switch(pilihan){
            case 1:
                System.out.print("Masukkan jumlah inputan nama : ");
                pil = inp.nextInt();
        
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
                break;
            case 2:
                for(int x=0; x<pil; x++){
                    for(int y=0; y<pil; y++){
                        if(id[x]<id[y]){
                            temp = id[x];
                            id[x] = id[y];
                            id[y] = temp;
                            temp1 = nama[x];
                            nama[x] = nama[y];
                            nama[y] = temp1;
                            temp2 = gaji[x];
                            gaji[x] = gaji[y];
                            gaji[y]=temp2;
                        }
                    }
                }
                System.out.println("Data terurut");
                break;
            case 3:
                System.out.print("Masukkan data yang anda cari : ");
                String name = inp.next();
                for(int a=0; a<pil; a++){
                    if(nama[a] == null ? name == null : nama[a].equals(name)){
                        System.out.println("ID : "+ id[a]);
                        System.out.println("Nama : "+ nama[a]);
                        System.out.println("Gaji : "+ gaji[a]);
                    }    
                }
                break;
        }        
        
    }
    
}
