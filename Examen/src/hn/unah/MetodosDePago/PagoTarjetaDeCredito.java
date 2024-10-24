package hn.unah.MetodosDePago;

import hn.unah.Interfac.IMetodoPago;

public class PagoTarjetaDeCredito implements IMetodoPago{

    private int tarjeta;

    public PagoTarjetaDeCredito(int tarjeta) {
        this.tarjeta = tarjeta;
    }


    @Override
    public void procesar_pago(int monto) {

        if (this.tarjeta > monto){
            System.out.println("PAGO COMPLETADO");
        }else{
            System.out.println("PAGO NO PROCESADO, SALDO INSUFICIENTE");
        }
        
    }


    
}
