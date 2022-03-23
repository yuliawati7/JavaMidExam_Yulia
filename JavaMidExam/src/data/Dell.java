package data;

public class Dell extends Laptop{
    String display, graphic, storefront;
    
    public Dell(String nama, String brand, String processor, String jumlahCore, String sistemOperasi, 
            String sizeRAM, String storage, int stok){
        super(nama, brand, processor, jumlahCore, sistemOperasi, sizeRAM, storage, stok);
        getStorefront();
        Stok();
    }

    public void Stok(){
        if (stok <= 0) {
            stok = 0;
        }
    }

    public String getDisplay() {
        System.out.println("Display     : 15.6 Inch");
        return display;
    }

    public void getGraphic() {
        System.out.println("Graphic     : Intel HD Graphics");
    }
    
    public String getStorefront() {
        if (storage == "SSD M.2") {
            storefront = "Best";
        } else if(storage == "SSD SATA"){
            storefront = "Good";
        } else if(storage == "HDD"){
            storefront = "Middle";
        } else {
            storefront = "Unknown";
        }
        return storefront;
    }
    
    public String toString(){
        return "Nama        : "+nama
                +"\nBrand       : "+brand
                +"\nProcessor   : "+processor
                +"\nJumlah Core : "+jumlahCore
                +"\nOS          : "+sistemOperasi
                +"\nRAM         : "+sizeRAM
                +"\nStorage     : "+storage
                +"\nStorefront  : "+storefront
                +"\nStok        : "+stok;
    }
}
