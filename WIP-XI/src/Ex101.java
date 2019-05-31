
import java.util.Scanner;

public class Ex101 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner member = new Scanner(System.in);
        Scanner my = new Scanner(System.in);
        

        System.out.print("ราคาอาหารทั้งหมด");
        
        double price = sc.nextInt();
        
        System.out.print("มีบัตรสมาชิกไหม");
        
        boolean have = member.nextBoolean();
        
        if (have = true) {
            double priceT = price*(5.00/100.00);
            
            System.out.println("มีบัตรสมาชิก");
            
            System.out.println("ใช้เงินสดไหม");
            
            boolean money = my.nextBoolean();
            
            if (money = true){
                System.out.println("ชำระด้วยเงินสด");
                System.out.println(price-priceT);
            }if (money = true) {
                
            }
        }
    }
}
