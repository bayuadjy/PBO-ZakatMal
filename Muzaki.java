
package zakat;

public class Muzaki {
        private String nama;
        private double total_harta;
        
        public Muzaki(String nama, double total_harta){
            this.nama = nama;
            this.total_harta = total_harta;
        }
        
        public Muzaki(){
            nama = "Tidak diketahui";
            total_harta = 0;
        }
        
        public double total_zakat(){
            return total_harta * 0.025;
        }
        
        public String setNama(String nama){
            return this.nama = nama;
        }
        
        public String getNama(){
            return nama;
        }
        
        public double setTotalHarta(double total_harta){
            return this.total_harta = total_harta;
        }
        
        public double getTotalHarta(){
            return total_harta;
        } 
        
        
        
}
