package hn.unah.subclases;

import hn.unah.clasebase.Productos;

public class ProductoElectronico extends Productos {

    private int garantia;

    public ProductoElectronico(String nombre, int precio, int stock, int garantia) {
        super(nombre, precio, stock);
        this.garantia = garantia;
        
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    
    
    
}
