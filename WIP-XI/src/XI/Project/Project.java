/*
 * Copyright (C) 2019 wipcamp11.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package XI.Project;

/**
 *
 * @author wipcamp11
 */
import java.util.Scanner;

public class Project {

    public static void main(String[] args) {
        int item = 0, limit = 10;
        int amount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("กรุณเลทอกรายการที่ต้องการทำโดยการกดตัวเลข");
        System.out.println("1.เพิ่ม item ");
        System.out.println("2. ลบ item ");
        System.out.println("3.ตรวจสอบ item ");
        System.out.print("รายการที่ต้องการจะทำ : ");
        int menu = sc.nextInt();
        int itemtotal = item + amount;
        if (menu == 1) {
            if (itemtotal < limit) {
                System.out.print("กรุณากรอกจำนวนสิ้นที่ต้องการจะเพิ่ม : ");
                amount = sc.nextInt();
                itemtotal = item + amount;
                System.out.println(itemtotal);

            } else if (itemtotal > limit) {
                System.out.print("คลังสินค้าเต็มแล้วครับ");

            }
        } else if (menu == 2) {
            System.out.print("กรุณากรอกจำนวนสิ้นที่ต้องการจะลบ : ");
            amount = sc.nextInt();
            itemtotal = item - amount;
            if (itemtotal > 0) {
                
            System.out.println(itemtotal);
            }else  {

                    System.out.print("คลังสินค้าไม่มีสินค้าแล้วครับ");

                }

        } else if (menu == 3) {
            itemtotal = item + amount;
            System.out.println(itemtotal);
        } else {
            System.out.print("รายการที่เลือกไม่ถูกต้อง!!!");
        }
    }
}
