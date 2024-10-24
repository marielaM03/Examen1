package hn.unah.subclases;

import hn.unah.clasebase.Productos;

public class ProductoAlimenticio extends Productos {

    private int fecha_expiracion;
    private int fecha_inicio;

    public ProductoAlimenticio(String nombre, int precio, int stock, int fecha_expiracion, int fecha_inicio) {
        super(nombre, precio, stock);
        this.fecha_expiracion = fecha_expiracion;
        this.fecha_inicio = fecha_inicio;
        //TODO Auto-generated constructor stub
    }

    public int getFecha_expiracion() {
        return fecha_expiracion;
    }

    public void setFecha_expiracion(int fecha_expiracion) {
        this.fecha_expiracion = fecha_expiracion;
    }

    public int getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(int fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    
    

    
}
 