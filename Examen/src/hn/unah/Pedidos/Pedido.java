package hn.unah.Pedidos;

import java.util.LinkedList;

import hn.unah.MetodosDePago.PagoPaypal;
import hn.unah.MetodosDePago.PagoTarjetaDeCredito;
import hn.unah.clasebase.Productos;
import hn.unah.subclases.ProductoAlimenticio;
import hn.unah.subclases.ProductoElectronico;

public class Pedido {

    Productos producto;

    PagoPaypal pagoPaypal;
    PagoTarjetaDeCredito pagoTarjeta;


    LinkedList<Productos> list = new LinkedList<>();

    public void agregarPedido(Productos producto, int cantidad){


        if (producto instanceof ProductoAlimenticio){

           if(((ProductoAlimenticio)producto).getFecha_expiracion() > ((ProductoAlimenticio)producto).getFecha_inicio() && ((ProductoAlimenticio)producto).getStock() < cantidad){

            System.err.println("El producto de pudo ser agregado al carrito. PRODUCTO VENCIDO.");
           }else{
            list.add(producto);
            System.out.println("Pedido Agregado");
           }

        }else{
            if (producto instanceof ProductoElectronico){
                list.add(producto);
                System.out.println("Pedido Agregado");

            }else{
                System.err.println("ERROR EN EL SISTEMA.");
            }

        }

    }

    public void calcular_total(){

        if (producto instanceof ProductoAlimenticio){

            
        }else if(producto instanceof ProductoAlimenticio){}


    }

    public void procesar_pedido(){
        if (producto instanceof ProductoAlimenticio){
            
            
        }else if(producto instanceof ProductoAlimenticio){

        }


    }


    
}
