/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitapinputoutput_8975;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class BaiTapInputOutput_8975 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ho ten: ");
        String hoten = scanner.nextLine();
        System.out.println("Nam sinh: ");
        int ngaysinh = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Gioitinh: ");
        String gioitinh = scanner.nextLine();
        System.out.println("GPA: ");
        float gpa =scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Que quan: ");
        String quequan = scanner.nextLine();
        System.out.println(hoten+ "-"+ ngaysinh+ "-"+ gioitinh+"-"+gpa+"-"+quequan);
        
        
        
    }
    
}
