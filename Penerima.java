package ZakatMal;

public class Penerima {
        private String nama;
        
        public Penerima(){
            nama = "Tidak diketahui";
        }
        
        public String setNama(String nama){
            return this.nama = nama;
        }
        
        public String getNama(){
            return nama;
        }
        
        
}
