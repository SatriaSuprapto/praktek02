
package praktek02;

public class persegiaksi {
    public static void main(String[] args) {
        persegi rl = new persegi();
        rl.sisi1 = 4;
        rl.sisi2 = 4;
        
        rl.cetakinfo();
        System.out.println("Luas persegi = "+rl.hitungLuas());
    }
}
