package data;

public class LaptopApp {
    public static void main(String[] args) {
        System.out.println("\tOuput");
        System.out.println("-----------------------");
        Laptop laptop1 = new Laptop();
        System.out.println("\n\tLaptop 1");
        System.out.println("\nNama            : "+laptop1.getNama());
        System.out.println("Brand           : "+laptop1.getBrand());
        System.out.println("Processor       : "+laptop1.getProcessor());
        System.out.println("Jumlah Core     : "+laptop1.getJumlahCore());
        System.out.println("Sistem Operasi  : "+laptop1.getsistemOperasi());
        System.out.println("RAM             : "+laptop1.getsizeRAM());
        System.out.println("Storage         : "+laptop1.getStorage());
        System.out.println("Stok            : "+laptop1.getStok()+"\n");
        
        System.out.println("\tLaptop 2");
        Laptop laptop2 = new Laptop("Acer Helios", "Acer", "Intel Core i7-8750H", 
                "6 Core", "Windows 11", "16GB", "SSD SATA", 5);
        System.out.println(laptop2);
    }
}
