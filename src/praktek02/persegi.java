
package praktek02;

public class persegi {
    
    double sisi1;
    double sisi2;

    public persegi() {
        sisi1 = 8;
        sisi2 = 8;
              
    }

    public persegi(double sisi1, double sisi2) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
    }
    
    
    void cetakinfo(){
        
        System.out.println("==============");
        System.out.println("sisi1 :"+sisi1);
        System.out.println("sisi2 :"+sisi2);
        System.out.println("==============");
        
    }
    
    double hitungLuas(){
        double luas;
        luas=sisi1*sisi2;
        return luas;
    }
        void cetakLuas(){
        System.out.println("Luasnya adalah:" +hitungLuas());
        
    }
    
}
