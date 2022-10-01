Package javaappliccation;
public class Bill {
    String nama, tea;
    Integer harga, qty;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String setTea(String Tea) {
        this.tea = tea;

    }

    public Integer getHarga() {
        return harga;
    }

    public void setHarga(Integer harga){
        this.harga = harga;

    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Bill (String nama, String tea, Integer harga, Integer qty, Integer bayar, Integer kembali) {
        this.nama = nama;
        this.tea = tea;
        this.harga = harga;
        this.qty = qty;
    }
}