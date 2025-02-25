package testClases;

import Base.BaseWebMercado;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import page.mercadoLibre.categoriaDeBusqueda;
import page.mercadoLibre.homeMercadoLibre;
import page.mercadoLibre.seleccionProductoCategoria;

import static constans.Constants.*;

public class CPA0002BusquedaProductoPorCategoria extends BaseWebMercado {

    @Test(groups = {"BUSQUEDA PRODUCTO MERCADO LIBRE POR CATEGORIA"},description = "TOOLSQA ")
    @Parameters({""})

    public void CPA0002BusquedaProductoPorCategoria (){

        homeMercadoLibre.pageObject().homePagina();
        homeMercadoLibre.pageObject().informacionCookie();
        homeMercadoLibre.pageObject().ingresoProducto(productoModa);
        homeMercadoLibre.pageObject().busquedaProducto();

        /**Genero MUJER*/
        categoriaDeBusqueda.pageObject().busquedaPorGenero(generoMujer);
        seleccionProductoCategoria.pageObject().obtieneDescrPrimerProducto();
        homeMercadoLibre.pageObject().ingresoProducto(productoModa);
        homeMercadoLibre.pageObject().busquedaProducto();

        /**Categoria Ropa Interior*/
        categoriaDeBusqueda.pageObject().busquedaPorCategoria(categoriaRopaInt);
        seleccionProductoCategoria.pageObject().obtieneDescrSegundoProducto();


    }


}
