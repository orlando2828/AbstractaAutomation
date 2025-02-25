package testClases.mercadoLibre;

import Base.BaseWebMercado;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import page.mercadoLibre.homeMercadoLibre;
import page.mercadoLibre.homeMercadoLibreWeb;
import page.mercadoLibre.seleccionDeProductos;
import page.mercadoLibre.seleccionDeProductosWeb;

import static constans.Constants.productoModa;

public class CPA0001BusquedaProductosMercadoLibre extends BaseWebMercado {
    @Test(groups = {"BUSQUEDA PRODUCTO MERCADO LIBRE"},description = "TOOLSQA ")
    @Parameters({""})

    public void CPA0001BusquedaProductosMercadoLibre(){

        homeMercadoLibre.pageObject().homePagina();
        homeMercadoLibre.pageObject().informacionCookie();
        homeMercadoLibre.pageObject().ingresoProducto(productoModa);
        homeMercadoLibre.pageObject().busquedaProducto();

        seleccionDeProductos.pageObject().obtieneDescrPrimerProducto();
        homeMercadoLibre.pageObject().ingresoProducto(productoModa);
        homeMercadoLibre.pageObject().busquedaProducto();

        seleccionDeProductos.pageObject().obtieneDescrSegundoProducto();
        homeMercadoLibre.pageObject().ingresoProducto(productoModa);
        homeMercadoLibre.pageObject().busquedaProducto();

        seleccionDeProductos.pageObject().obtieneDescrTercerProducto();
        homeMercadoLibre.pageObject().ingresoProducto(productoModa);
        homeMercadoLibre.pageObject().busquedaProducto();



    }
}
