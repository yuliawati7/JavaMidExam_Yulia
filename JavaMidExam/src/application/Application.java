package application;

import data.*;

public class Application {
    public static void main(String[] args) {
        
        Asus asus = new Asus("Asus ExpertBook", "Asus", "Intel Core i3-1115G4", 
                "2", "Windows 10 Home", "8GB", "SSD SATA", 6);
        System.out.println("Laptop Asus");
        System.out.println(asus);
        asus.getDisplay();
        asus.getGraphic();
        
        
        Dell dell = new Dell("Dell Inspiron 15 AMD", "Dell", "AMD Ryzen 3 3250U", 
                "2", "Windows 10 Home", "8GB", "SSD SATA", 2);
        System.out.println("\nLaptop Dell");
        System.out.println(dell);
        dell.getDisplay();
        dell.getGraphic();
    }
}
