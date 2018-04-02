
package praktek02;

public class persegiaksi {
    public static void main(String[] args) {
        persegi rl = new persegi();
        rl.sisi1 = 4;
        rl.sisi2 = 4;
        
        rl.cetakinfo();
        System.out.println("Luas persegi = "+rl.hitungLuas());
        rl.cetakLuas();
        
        persegi r2 = new persegi();
        r2.cetakinfo();
        
        persegi r3 = new persegi(16,16);
        r3.cetakinfo();
    }
}
