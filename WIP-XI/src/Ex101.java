
import java.util.Scanner;

public class Ex101 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner member = new Scanner(System.in);
        Scanner my = new Scanner(System.in);
        double priceT , priceV;
        
        System.out.print("ราคาอาหารทั้งหมด : ");        
        
        double price = sc.nextInt();
        
        System.out.print("มีบัตรสมาชิกไหม : ");
        
        boolean have = member.nextBoolean();
        
        if (have = true) {
            priceT = price+ price*(5.00/100.00);
           
        }
            System.out.println("มีบัตรสมาชิก");
            
            System.out.print("ชำระด้วยเงินสดไหม :");
            
            boolean money = my.nextBoolean(); 
        if(money = true){
            priceV = price+(price*10.00/100.00);
            System.out.print("ค่าอาหารทั้งหมด :" + priceV);
        }
        if (money = false){
        priceV = price+(price*5.00/100.00);
            System.out.print("ค่าอาหารทั้งหมด :" + priceV);
        }
    }
}