import java.util.LinkedList;

import hn.unah.Pedidos.Pedido;
import hn.unah.clasebase.Productos;
import hn.unah.subclases.ProductoAlimenticio;
import hn.unah.subclases.ProductoElectronico;

public class App {
    public static void main(String[] args) throws Exception {

        LinkedList<Pedido> pedido1 = new LinkedList<>();
        
        Pedido pedidoAlimento = new Pedido();
        Pedido pedidoElectronico = new Pedido();

        Productos productosAlimenticio = new ProductoAlimenticio("Leche", 17 , 30, 17824, 90723);
        Productos productosAlimenticio2 = new ProductoAlimenticio("Pan", 24 , 25, 241224, 70723);

        Productos productosElectronicos = new ProductoElectronico("Television", 17000, 15, 10);
        Productos productosElectronicos2 = new ProductoElectronico("Radio", 1500, 10, 8);

        pedidoAlimento.agregarPedido(productosAlimenticio, 3);
        pedidoAlimento.agregarPedido(productosAlimenticio2, 4);
        

        pedidoElectronico.agregarPedido(productosElectronicos, 4);
        pedidoElectronico.agregarPedido(productosElectronicos2, 3);

        pedido1.add(pedidoAlimento);
        pedido1.add(pedidoElectronico);
        


    }
}
