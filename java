import java.util.Scanner;
public class HitungLuas2{
	public static void main (String [] args){
      Scanner sc = new Scanner(System.in);
		Scanner nilai = new Scanner (System.in);
           int panjang , lebar ;
           System.out.println("Masukan panjang = ");
           panjang = nilai.nextInt();
           System.out.println("Masukan lebar = ");
           lebar = nilai.nextInt();
		     int Luas = panjang * lebar;
           System.out.println("Luas Persegi Panjang = "+Luas);
		
	}
}